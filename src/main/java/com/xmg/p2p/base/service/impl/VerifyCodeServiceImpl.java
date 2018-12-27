package com.xmg.p2p.base.service.impl;


import com.xmg.p2p.base.service.IVerifyCodeService;
import com.xmg.p2p.base.util.BidConst;
import com.xmg.p2p.base.util.DateUtil;
import com.xmg.p2p.base.util.UserContext;
import com.xmg.p2p.base.vo.VerifyCodeVO;

import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.Date;
import java.util.UUID;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.util.StreamUtils;


/**
 * @Author Elvis Chen
 * @Date 2018/12/27 17:21
 * @Version 1.0
 **/
@Service
public class VerifyCodeServiceImpl implements IVerifyCodeService {

	@Value("${sms.username}")
	private String username;

	@Value("${sms.password}")
	private String password;

	@Value("${sms.apikey}")
	private String apiKey;

	@Value("${sms.url}")
	private String url;

	@Override
	public void sendVerifyCode(String phoneNumber) {



		VerifyCodeVO vc = UserContext.getCurrentVerifyCode();
		if (vc == null || DateUtil.secondsBetween(new Date(), vc.getLastSendTime()) > 90) {
			String verifyCode = UUID.randomUUID().toString().substring(0, 4);
			try{
				URL url = new URL(this.url);
				HttpURLConnection conn = (HttpURLConnection)url.openConnection();
				//拼接POST请求的内容
				StringBuilder content = new StringBuilder(100)
						.append("username=").append(username)
						.append("&password=").append(password)
						.append("&apikey=")	.append(apiKey)
						.append("&mobile=").append(phoneNumber)
						.append("&content=")
						.append("验证码是:").append(verifyCode).append(",请在5分钟内使用");
				conn.setRequestMethod("POST");
				conn.setDoOutput(true);
				conn.getOutputStream().write(content.toString().getBytes());
				String response = StreamUtils.copyToString(conn.getInputStream(), Charset.forName("UTF-8"));
				if(response.startsWith("success:")){
					vc = new VerifyCodeVO();
					vc.setLastSendTime(new Date());
					vc.setPhoneNumber(phoneNumber);
					vc.setVerifyCode(verifyCode);
					UserContext.putVerifyCode(vc);
				}else{
					throw new RuntimeException();
				}
			} catch (Exception e){
				e.printStackTrace();
				throw new RuntimeException("短信发送失败!");
			}

		} else {
			throw new RuntimeException("发送过于频繁!");
		}
	}

	@Override
	public boolean verify(String phoneNumber, String verifyCode) {
		VerifyCodeVO vc = UserContext.getCurrentVerifyCode();
		if(vc!=null
				&&vc.getPhoneNumber().equals(phoneNumber)
				&&vc.getVerifyCode().equalsIgnoreCase(verifyCode)
				&&DateUtil.secondsBetween(new Date(), vc.getLastSendTime())<=BidConst.VERIFYCODE_VAILDATE_SECOND){
			return true;
		}
		return false;
	}
}
