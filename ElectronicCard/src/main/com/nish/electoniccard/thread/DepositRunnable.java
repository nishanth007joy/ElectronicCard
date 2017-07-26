package com.nish.electoniccard.thread;

import java.math.BigDecimal;

import com.nish.electoniccard.card.Card;
import com.nish.electoniccard.transaction.TransactionManagerImpl;
/**
 * Runnable class for deposit
 * @author Nishanth Mathew Joy
 *
 */
public class DepositRunnable implements Runnable{
	private Card card;
	private BigDecimal amount;
	public DepositRunnable(Card card, BigDecimal amount) {
		this.card = card;
		this.amount = amount;
	}
	@Override
	public void run() {
		
		TransactionManagerImpl.getInstance().creditCard(card, amount);
		
	}

}
