package com.xmg.p2p.base.domain;

import java.util.Date;

/**
 * 邮箱验证对象
 * @Author Elvis Chen
 * @Date 2018/12/28 18:32
 * @Version 1.0
 **/
public class MailVerify extends BaseDomain{

    private Long userinfoId;

    private String email;

    private String uuid;

    private Date sendDate;

    public Long getUserinfoId() {
        return userinfoId;
    }

    public void setUserinfoId(Long userinfoId) {
        this.userinfoId = userinfoId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public Date getSendDate() {
        return sendDate;
    }

    public void setSendDate(Date sendDate) {
        this.sendDate = sendDate;
    }
}
