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
	 */
	public  void debitCard(final Card card,final BigDecimal amount);
	/**
	 * 
	 * @param card
	 * @param amount
	 */
	public void creditCard(final Card card,final BigDecimal amount);
}
