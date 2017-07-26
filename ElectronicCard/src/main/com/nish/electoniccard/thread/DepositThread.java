package com.nish.electoniccard.thread;

import java.math.BigDecimal;

import com.nish.electoniccard.card.Card;
import com.nish.electoniccard.transaction.TransactionManagerImpl;

public class DepositThread implements Runnable{
	private Card card;
	private String transactionDesc;
	private BigDecimal amount;
	public DepositThread(Card card, BigDecimal amount, String transactionDesc) {
		this.card = card;
		this.amount = amount;
		this.transactionDesc = transactionDesc;
	}
	@Override
	public void run() {
		TransactionManagerImpl.getInstance().creditCard(card, amount, transactionDesc);
	}

}
