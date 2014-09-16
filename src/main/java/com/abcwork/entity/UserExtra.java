package com.abcwork.entity;


/**
 * 用户信息表
 * 
 * @author qianxg
 *
 */
public class UserExtra extends BaseModel {

	private static final long serialVersionUID = 4037679787772137005L;
	
	private Long uid;
	/** 经期长度 */
	private Byte period;
	/** 周期长度 */
	private Byte cycle;
	/** 用户关键字 */
	private String keyword;
	private Long dateline;
	private Long updateTime;
	private Integer age;
	private Long menarche;
	private Long lastPeriod;
	/** 最近常见症状列表 */
	private String recentSymptom;
	/** 用户自定义最近常见症状 */
	private String recentSymptomUser;
	/** 扩展信息 */
	private String extraInfo;
	/** 用户组修改时间 */
	private Long groupChangeTime;
	
	public Long getUid() {
		return uid;
	}
	public void setUid(Long uid) {
		this.uid = uid;
	}
	public Byte getPeriod() {
		return period;
	}
	public void setPeriod(Byte period) {
		this.period = period;
	}
	public Byte getCycle() {
		return cycle;
	}
	public void setCycle(Byte cycle) {
		this.cycle = cycle;
	}
	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	public Long getDateline() {
		return dateline;
	}
	public void setDateline(Long dateline) {
		this.dateline = dateline;
	}
	public Long getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Long updateTime) {
		this.updateTime = updateTime;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Long getMenarche() {
		return menarche;
	}
	public void setMenarche(Long menarche) {
		this.menarche = menarche;
	}
	public Long getLastPeriod() {
		return lastPeriod;
	}
	public void setLastPeriod(Long lastPeriod) {
		this.lastPeriod = lastPeriod;
	}
	public String getRecentSymptom() {
		return recentSymptom;
	}
	public void setRecentSymptom(String recentSymptom) {
		this.recentSymptom = recentSymptom;
	}
	public String getRecentSymptomUser() {
		return recentSymptomUser;
	}
	public void setRecentSymptomUser(String recentSymptomUser) {
		this.recentSymptomUser = recentSymptomUser;
	}
	public String getExtraInfo() {
		return extraInfo;
	}
	public void setExtraInfo(String extraInfo) {
		this.extraInfo = extraInfo;
	}
	public Long getGroupChangeTime() {
		return groupChangeTime;
	}
	public void setGroupChangeTime(Long groupChangeTime) {
		this.groupChangeTime = groupChangeTime;
	}
	
}
