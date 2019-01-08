package com.xmg.p2p.base.query;

import com.xmg.p2p.base.util.DateUtil;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.regex.Pattern;

/**
 * 实名认证查询对象
 * @Author Elvis Chen
 * @Date 2019/1/7 2:49
 * @Version 1.0
 **/
public class RealAuthQueryObject extends QueryObject{


    private int state = -1;

    private Date beginDate;

    private Date endDate;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public Date getBeginDate() {
        return beginDate;
    }

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    public void setBeginDate(Date beginDate) {
        this.beginDate = beginDate;
    }

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    public void setEndDate(Date endDate){
        this.endDate =endDate;
    }

    public Date getEndDate() {
        return endDate == null ? null : DateUtil.endOfDay(endDate);
    }
}
