package com.paytmoauth.domain;

import java.util.Date;

public class MerchantPayResponse {
	private String transactionNo;
	private Date transactionDate;
	private String payTMAccountNo;
	private String merchantAccountNo;
	private double amount;
	private String status;

	public String getTransactionNo() {
		return transactionNo;
	}

	public void setTransactionNo(String transactionNo) {
		this.transactionNo = transactionNo;
	}

	public Date getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}

	public String getPayTMAccountNo() {
		return payTMAccountNo;
	}

	public void setPayTMAccountNo(String payTMAccountNo) {
		this.payTMAccountNo = payTMAccountNo;
	}

	public String getMerchantAccountNo() {
		return merchantAccountNo;
	}

	public void setMerchantAccountNo(String merchantAccountNo) {
		this.merchantAccountNo = merchantAccountNo;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
