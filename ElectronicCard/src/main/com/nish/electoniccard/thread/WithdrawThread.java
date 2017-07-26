package com.nish.electoniccard.thread;

import java.math.BigDecimal;

import com.nish.electoniccard.card.Card;
import com.nish.electoniccard.transaction.TransactionManagerImpl;

public class WithdrawThread implements Runnable{
	private Card card;
	private String transactionDesc;
	private BigDecimal amount;
	public WithdrawThread(Card card, BigDecimal amount, String transactionDesc) {
		this.card = card;
		this.amount = amount;
		this.transactionDesc = transactionDesc;
	}
	@Override
	public void run() {
		TransactionManagerImpl.getInstance().debitCard(card, amount, transactionDesc);
	}

}
