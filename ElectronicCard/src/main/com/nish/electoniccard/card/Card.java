package com.nish.electoniccard.card;

import java.math.BigDecimal;
import java.util.Map;

/**
 * This is the class holding card details for each person
 * @author Nishanth Mathew Joy
 *
 */
public class Card {
	{
		balance = new BigDecimal(0.00);
	}
	private String cardHolerName;
	private BigDecimal balance;
	private Map<String,TransactionDetails> transactions;
	
	public BigDecimal getBalance() {
		return balance;
	}
	public String getCardHolerName() {
		return cardHolerName;
	}

	public void setCardHolerName(String cardHolerName) {
		this.cardHolerName = cardHolerName;
	}

	public synchronized void setBalance(BigDecimal balance) {
		this.balance = balance;
	}
	public Map<String, TransactionDetails> getTransactions() {
		return transactions;
	}
	public void setTransactions(Map<String, TransactionDetails> transactions) {
		this.transactions = transactions;
	}
	@Override
	public String toString() {
		return "Card [cardHolerName=" + cardHolerName + ", balance=" + balance + ", transactions=" + transactions + "]";
	}
	
}
