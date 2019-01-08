package com.xmg.p2p.base.domain;

import com.alibaba.fastjson.JSONObject;
import com.sun.org.apache.bcel.internal.generic.RETURN;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author Elvis Chen
 * @Date 2019/1/4 17:35
 * @Version 1.0
 **/
public class RealAuth extends BaseDomain {

    public static final int SEX_MALE = 0;

    public static final int SEX_FEMALE = 1;

    public static final int STATE_NORMAL = 0;  //正常
    public static final int STATE_AUDIT = 1;  //审核通过
    public static final int STATE_REJECT = 2; //审核拒绝

    private String realName;
    private int sex;
    private String idNumber;
    private String bornDate;
    private String address;
    private String image1;
    private String image2;
    
    private String remark;
    private int state;
    private Logininfo applier;
    private Logininfo auditor;
    private Date applyTime;
    private Date auditTime;

    public String getSexDisplay(){
        return sex == SEX_MALE ? "男" : "女";
    }

    public String getSateDisplay() {
        switch (state) {
            case STATE_NORMAL:
                return "待审核";
            case STATE_AUDIT:
                return "审核通过";
            case STATE_REJECT:
                return "审核拒绝";
            default:
                return "";
        }
    }

    public String getJsonString(){
        Map<String, Object> json =new HashMap<>();
        json.put("id", id);
        json.put("applier", this.applier.getUsername());
        json.put("realName", realName);
        json.put("idNumber", idNumber);
        json.put("sex", getSexDisplay());
        json.put("bornDate", bornDate);
        json.put("address", address);
        json.put("image1", image1);
        json.put("image2", image2);
        return JSONObject.toJSONString(json);
    }


    public Logininfo getApplier() {
        return applier;
    }

    public void setApplier(Logininfo applier) {
        this.applier = applier;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getBornDate() {
        return bornDate;
    }

    public void setBornDate(String bornDate) {
        this.bornDate = bornDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getImage1() {
        return image1;
    }

    public void setImage1(String image1) {
        this.image1 = image1;
    }

    public String getImage2() {
        return image2;
    }

    public void setImage2(String image2) {
        this.image2 = image2;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public Logininfo getAuditor() {
        return auditor;
    }

    public void setAuditor(Logininfo auditor) {
        this.auditor = auditor;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Date getApplyTime() {
        return applyTime;
    }

    public void setApplyTime(Date applyTime) {
        this.applyTime = applyTime;
    }

    public Date getAuditTime() {
        return auditTime;
    }

    public void setAuditTime(Date auditTime) {
        this.auditTime = auditTime;
    }
}
