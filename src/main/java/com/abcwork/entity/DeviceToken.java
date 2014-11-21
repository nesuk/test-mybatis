package com.abcwork.entity;

/**
 * 
 * 设备Token
 * 
 * @author qianxg
 *
 */
public class DeviceToken extends BaseModel {

	private static final long serialVersionUID = 8118641793093677686L;

	private Long uid;
	private String token;
	
	public DeviceToken() {
		
	}
	
	public DeviceToken(Long uid, String token) {
		this.uid = uid;
		this.token = token;
	}

	public Long getUid() {
		return uid;
	}

	public void setUid(Long uid) {
		this.uid = uid;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

}
