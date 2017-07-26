package com.nish.electoniccard.appclient;

import java.math.BigDecimal;
import com.nish.electoniccard.card.Card;
import com.nish.electoniccard.thread.DepositRunnable;
import com.nish.electoniccard.thread.WithdrawRunnable;

public class ApplicationClient {
	public static void main(String[] args) {
		Card card = new Card();
		card.setBalance(BigDecimal.valueOf(0.00));
		card.setCardHolerName("Nishanth Mathew Joy");
		DepositRunnable depositThread1 = new DepositRunnable(card, BigDecimal.valueOf(1000.00));
		Thread thread1 = new Thread(depositThread1, "Deposit 1");
		Thread thread2 = new Thread(depositThread1, "Deposit 2");
		Thread thread3 = new Thread(depositThread1, "Deposit 3");
		thread1.start();
		WithdrawRunnable withdrawThread1 = new WithdrawRunnable(card, BigDecimal.valueOf(10.00));
		Thread withdrawThread11 = new Thread(withdrawThread1, "Withdraw 1");
		Thread withdrawThread12 = new Thread(withdrawThread1, "Withdraw 2");
		Thread withdrawThread13 = new Thread(withdrawThread1, "Withdraw 3");
		withdrawThread11.start();
		withdrawThread12.start();
		withdrawThread13.start();
		thread2.start();
		thread3.start();
	}
}
