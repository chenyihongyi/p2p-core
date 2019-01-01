/**
 * 
 */
package com.xmg.p2p.base.domain;

import com.alibaba.fastjson.JSONObject;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description: 数据字典明细
 * @Author: chenyihong
 * @Date: 2018年12月17日
 */
public class SystemDictionaryItem extends BaseDomain{

	private Long parentId;
	private String title;
	private int sequence;
	
	/**
	 * 返回当前的json字符串
	 * @return
	 */
	public String getJsonString(){
		Map<String, Object> json = new HashMap<>();
		json.put("id", id);
		json.put("title", title);
		json.put("sequence", sequence);
		json.put("parentId", parentId);
		return JSONObject.toJSONString(json);
	}
	
	public Long getParentId() {
		return parentId;
	}

	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getSequence() {
		return sequence;
	}

	public void setSequence(int sequence) {
		this.sequence = sequence;
	}


	

}
