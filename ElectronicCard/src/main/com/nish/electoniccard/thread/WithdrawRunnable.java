package com.nish.electoniccard.thread;

import java.math.BigDecimal;

import com.nish.electoniccard.card.Card;
import com.nish.electoniccard.transaction.TransactionManagerImpl;

public class WithdrawRunnable implements Runnable{
	private Card card;
	private BigDecimal amount;
	public WithdrawRunnable(Card card, BigDecimal amount) {
		this.card = card;
		this.amount = amount;
	}
	@Override
	public void run() {
		TransactionManagerImpl.getInstance().debitCard(card, amount);
	}

}
