package com.jsbd.vr.bean;

import org.json.JSONException;
import org.json.JSONObject;

import com.jsbd.debug.DebugLog;
import com.jsbd.vr.define.ResultDefine;

public class ControlResultBean {
	/**
	 * 执行的结果状态
	 */
	private int status;
	/**
	 * 可能要存的值
	 */
	private String sValue;
	/**
	 * 可能要播报的语句
	 */
	private String message;
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getsValue() {
		return sValue;
	}
	public void setsValue(String sValue) {
		this.sValue = sValue;
	}
	
	public ControlResultBean init(){
		this.status = ResultDefine.Status.IDLE ;
		this.sValue = "";
		this.message = "";
		return this;
	}
	
	public void setStatusIdle(){
		this.status = ResultDefine.Status.IDLE;
	}
	
	
	public void setStatusSame(){
		this.status = ResultDefine.Status.SAME;
	}
	
	
	public void setStatusDiff(){
		this.status = ResultDefine.Status.DIFF;
	}
	
	
	public void setStatusDisable(){
		this.status = ResultDefine.Status.DISABLE;
	}
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
		this.status = ResultDefine.Status.MSSAGE;
	}
	public String getJson(){
		
		JSONObject json = new  JSONObject();
		try {
			json.put("message", this.getMessage());
			json.put("value", this.getsValue());
			json.put("status", this.getStatus());
		} catch (JSONException e) {
			DebugLog.d(e);
		}
		String result = json.toString();
		DebugLog.d(result);
		return result;
	}
	
	
}
