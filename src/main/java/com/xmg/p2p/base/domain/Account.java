/**
 * 
 */
package com.xmg.p2p.base.domain;

import java.math.BigDecimal;

import com.xmg.p2p.base.util.BidConst;

/**
 * @Description: 用户对应的账户信息
 * @Author: chenyihong
 * @Date: 2018年12月17日
 */
public class Account extends BaseDomain{

	private int version;
	private String tradePassword;
	private BigDecimal usableAmount = BidConst.ZERO;
	private BigDecimal freezedAmount = BidConst.ZERO;
	private BigDecimal unReceiveInterest = BidConst.ZERO;
	private BigDecimal unReceivePrincipal = BidConst.ZERO;
	private BigDecimal unReturnAmount = BidConst.ZERO;
	private BigDecimal remainBorrowLimit = BidConst.INIT_BORROW_LIMIT;
	private BigDecimal borrowLimit = BidConst.INIT_BORROW_LIMIT;

	public BigDecimal getTotalAmount(){
		return usableAmount.add(this.freezedAmount).add(this.unReceivePrincipal);
	}
	
	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public String getTradePassword() {
		return tradePassword;
	}

	public void setTradePassword(String tradePassword) {
		this.tradePassword = tradePassword;
	}

	public BigDecimal getUsableAmount() {
		return usableAmount;
	}

	public void setUsableAmount(BigDecimal usableAmount) {
		this.usableAmount = usableAmount;
	}

	public BigDecimal getFreezedAmount() {
		return freezedAmount;
	}

	public void setFreezedAmount(BigDecimal freezedAmount) {
		this.freezedAmount = freezedAmount;
	}

	public BigDecimal getUnReceiveInterest() {
		return unReceiveInterest;
	}

	public void setUnReceiveInterest(BigDecimal unReceiveInterest) {
		this.unReceiveInterest = unReceiveInterest;
	}

	public BigDecimal getUnReceivePrincipal() {
		return unReceivePrincipal;
	}

	public void setUnReceivePrincipal(BigDecimal unReceivePrincipal) {
		this.unReceivePrincipal = unReceivePrincipal;
	}

	public BigDecimal getUnReturnAmount() {
		return unReturnAmount;
	}

	public void setUnReturnAmount(BigDecimal unReturnAmount) {
		this.unReturnAmount = unReturnAmount;
	}

	public BigDecimal getRemainBorrowLimit() {
		return remainBorrowLimit;
	}

	public void setRemainBorrowLimit(BigDecimal remainBorrowLimit) {
		this.remainBorrowLimit = remainBorrowLimit;
	}

	public BigDecimal getBorrowLimit() {
		return borrowLimit;
	}

	public void setBorrowLimit(BigDecimal borrowLimit) {
		this.borrowLimit = borrowLimit;
	}

}
