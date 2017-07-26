package com.nish.electoniccard.card;

import java.math.BigDecimal;
/**
 * 
 * @author Nishanth Mathew Joy
 *
 */
public class TransactionDetails {

	private BigDecimal transactionAmount;
	private String transactionDesc;
	{
		transactionAmount = new BigDecimal(0.00);
	}

	public BigDecimal getTransactionAmount() {
		return transactionAmount;
	}
	public void setTransactionAmount(BigDecimal transactionAmount) {
		this.transactionAmount = transactionAmount;
	}
	public String getTransactionDesc() {
		return transactionDesc;
	}
	public void setTransactionDesc(String transactionDesc) {
		this.transactionDesc = transactionDesc;
	}
	@Override
	public String toString() {
		return "TransactionDetails [transactionAmount=" + transactionAmount + ", transactionDesc=" + transactionDesc
				+ "]";
	}

}
