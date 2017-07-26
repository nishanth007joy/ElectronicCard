package com.nish.electoniccard.transaction;

import java.math.BigDecimal;

import com.nish.electoniccard.card.Card;
/**
 * 
 * @author Nishanth Mathew Joy
 *
 */
public interface TransactionManager {
	/**
	 * 
	 * @param card
	 * @param amount
	 * @param transactionDesc
	 */
	public  void debitCard(Card card, BigDecimal amount, String transactionDesc);
	/**
	 * 
	 * @param card
	 * @param amount
	 * @param transactionDesc
	 */
	public void creditCard(Card card, BigDecimal amount, String transactionDesc);
}
