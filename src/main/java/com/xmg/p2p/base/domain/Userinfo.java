/**
 * 
 */
package com.xmg.p2p.base.domain;

import com.xmg.p2p.base.util.BitStatesUtils;

/**
 * @Description: 
 * @Author: chenyihong
 * @Date: 2018年12月17日
 */
public class Userinfo extends BaseDomain{
	private int version;
	private long bitState = 0;
	private String realName;
	private String idNumber;
	private String phoneNumber;
	private String email;
	private SystemDictionaryItem incomeGrade;
	private SystemDictionaryItem marriage;
	private SystemDictionaryItem kidCount;
	private SystemDictionaryItem educationBackground;
	private SystemDictionaryItem houseCondition;
	
	public void addState(long state){
		this.setBitState(BitStatesUtils.addState(this.bitState, state));
	}

	//判断是否已经绑定了手机
	public boolean getIsBindPhone(){
		return BitStatesUtils.hasState(this.bitState, BitStatesUtils.OP_BIND_PHONE);
	}
	
	//判断用户是否已经绑定邮箱
	public boolean getIsBindEmail(){
		return BitStatesUtils.hasState(this.bitState, BitStatesUtils.OP_BIND_EMAIL);
	}
	
	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public long getBitState() {
		return bitState;
	}

	public void setBitState(long bitState) {
		this.bitState = bitState;
	}

	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public String getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public SystemDictionaryItem getIncomeGrade() {
		return incomeGrade;
	}

	public void setIncomeGrade(SystemDictionaryItem incomeGrade) {
		this.incomeGrade = incomeGrade;
	}

	public SystemDictionaryItem getMarriage() {
		return marriage;
	}

	public void setMarriage(SystemDictionaryItem marriage) {
		this.marriage = marriage;
	}

	public SystemDictionaryItem getKidCount() {
		return kidCount;
	}

	public void setKidCount(SystemDictionaryItem kidCount) {
		this.kidCount = kidCount;
	}

	public SystemDictionaryItem getEducationBackground() {
		return educationBackground;
	}

	public void setEducationBackground(SystemDictionaryItem educationBackground) {
		this.educationBackground = educationBackground;
	}

	public SystemDictionaryItem getHouseCondition() {
		return houseCondition;
	}

	public void setHouseCondition(SystemDictionaryItem houseCondition) {
		this.houseCondition = houseCondition;
	}
	
	

}
