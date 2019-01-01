/**
 * 
 */
package com.xmg.p2p.base.domain;

import java.util.HashMap;
import java.util.Map;

import com.alibaba.fastjson.JSONObject;

/**
 * @Description: 数据字典分类
 * @Author: chenyihong
 * @Date: 2018年12月17日
 */
public class SystemDictionary extends BaseDomain{

	private String sn;
	private String title;

	public String getJsonString() {
		Map<String, Object> json = new HashMap<>();
		json.put("id", id);
		json.put("sn", sn);
		json.put("title", title);
		return JSONObject.toJSONString(json);
	}

	public String getSn() {
		return sn;
	}

	public void setSn(String sn) {
		this.sn = sn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
}
