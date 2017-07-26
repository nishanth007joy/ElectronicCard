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
	
	public BigDecimal getBalance() {
		return balance;
	}
	public String getCardHolerName() {
		return cardHolerName;
	}

	public synchronized void setCardHolerName(String cardHolerName) {
		this.cardHolerName = cardHolerName;
	}

	public synchronized void setBalance(BigDecimal balance) {
		this.balance = balance;
	}
	
	@Override
	public String toString() {
		return "Card [cardHolerName=" + cardHolerName + ", balance=" + balance + "]";
	}
	
}
