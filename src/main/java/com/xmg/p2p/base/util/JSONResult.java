package com.xmg.p2p.base.util;

import lombok.Getter;
import lombok.Setter;


@Setter 
@Getter
public class JSONResult {

	private boolean success = true ;
	private String msg;
	
	public JSONResult(Boolean success, String msg) {
		super();
		this.success = success;
		this.msg = msg;
	}

	public JSONResult(String msg) { 
		super();
		this.msg = msg;
	}

	public JSONResult() {
		super();
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
			
	
	
}
