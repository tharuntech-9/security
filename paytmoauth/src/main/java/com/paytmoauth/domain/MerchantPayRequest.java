package com.paytmoauth.domain;

public class MerchantPayRequest {
	private String payTMAccountNo;
	private String merchantAccountNo;
	private double amount;
	private String description;

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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
