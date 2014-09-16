package com.abcwork.entity;


/**
 * 用户信息
 * 
 * @author qianxg
 * 
 */
public class User extends BaseModel {
	private static final long serialVersionUID = -3031382661274644382L;
	protected Long uid;
	protected String password;
	protected String nick;
	private Integer sex;
	private Long regTime;
	private Long loginNum;
	private Long lastLogin;
	private Long onlineTime;
	private Long lastActivity;
	private String regIp;
	/** TODO: 是否使用初始密码 */
	private Short initPassword;
	private String regCountry;
	private String lastLoginIp;
	private String lastLoginCountry;
	private Long loginDays;
	private Long groupId;
	private Long nickLastUpdate;
	private Short platform;
	/** 是否接受push信息 */
	private Short push;
	private Long topicNum;
	private Long replyNum;
	private Long favNum;
	/** 经验 */
	private Long score;
	/** 积分 */
	private Long credit;

	public User() {
	}
	
	/**
	 * 初始化对象的工厂方法
	 * @return
	 */
	public static User newInstance() {
		User ui = new User();
		// 匹配PHP时间
		long dateline = System.currentTimeMillis() / 1000;
		ui.setRegTime(dateline);
		ui.setLoginNum(0l);
		ui.setLastLogin(dateline);
		ui.setLastActivity(dateline);
		ui.setNickLastUpdate(dateline);
		return ui;
	}
	
	@Override
	public String toString() {
//		return Objects.toStringHelper(UserInfo.class)
//				.add("uid", uid)
//				.add("nick", nick)
//				.add("regTime", regTime)
//				.add("regCountry", regCountry)
//				.add("onlineTime", onlineTime)
//				.toString();
		return this.nick;
	}
	
	public Long getUid() {
		return uid;
	}

	public void setUid(Long uid) {
		this.uid = uid;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public Integer getSex() {
		return sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}

	public Long getRegTime() {
		return regTime;
	}

	public void setRegTime(Long regTime) {
		this.regTime = regTime;
	}

	public Long getLoginNum() {
		return loginNum;
	}

	public void setLoginNum(Long loginNum) {
		this.loginNum = loginNum;
	}

	public Long getLastLogin() {
		return lastLogin;
	}

	public void setLastLogin(Long lastLogin) {
		this.lastLogin = lastLogin;
	}

	public Long getOnlineTime() {
		return onlineTime;
	}

	public void setOnlineTime(Long onlineTime) {
		this.onlineTime = onlineTime;
	}

	public Long getLastActivity() {
		return lastActivity;
	}

	public void setLastActivity(Long lastActivity) {
		this.lastActivity = lastActivity;
	}

	public String getRegIp() {
		return regIp;
	}

	public void setRegIp(String regIp) {
		this.regIp = regIp;
	}

	public Short getInitPassword() {
		return initPassword;
	}

	public void setInitPassword(Short initPassword) {
		this.initPassword = initPassword;
	}

	public String getRegCountry() {
		return regCountry;
	}

	public void setRegCountry(String regCountry) {
		this.regCountry = regCountry;
	}

	public String getLastLoginIp() {
		return lastLoginIp;
	}

	public void setLastLoginIp(String lastLoginIp) {
		this.lastLoginIp = lastLoginIp;
	}

	public String getLastLoginCountry() {
		return lastLoginCountry;
	}

	public void setLastLoginCountry(String lastLoginCountry) {
		this.lastLoginCountry = lastLoginCountry;
	}

	public Long getLoginDays() {
		return loginDays;
	}

	public void setLoginDays(Long loginDays) {
		this.loginDays = loginDays;
	}

	public Long getGroupId() {
		return groupId;
	}

	public void setGroupId(Long groupId) {
		this.groupId = groupId;
	}

	public Long getNickLastUpdate() {
		return nickLastUpdate;
	}

	public void setNickLastUpdate(Long nickLastUpdate) {
		this.nickLastUpdate = nickLastUpdate;
	}

	public Short getPlatform() {
		return platform;
	}

	public void setPlatform(Short platform) {
		this.platform = platform;
	}

	public Short getPush() {
		return push;
	}

	public void setPush(Short push) {
		this.push = push;
	}

	public Long getTopicNum() {
		return topicNum;
	}

	public void setTopicNum(Long topicNum) {
		this.topicNum = topicNum;
	}

	public Long getReplyNum() {
		return replyNum;
	}

	public void setReplyNum(Long replyNum) {
		this.replyNum = replyNum;
	}

	public Long getFavNum() {
		return favNum;
	}

	public void setFavNum(Long favNum) {
		this.favNum = favNum;
	}

	public Long getScore() {
		return score;
	}

	public void setScore(Long score) {
		this.score = score;
	}

	public Long getCredit() {
		return credit;
	}

	public void setCredit(Long credit) {
		this.credit = credit;
	}

}
