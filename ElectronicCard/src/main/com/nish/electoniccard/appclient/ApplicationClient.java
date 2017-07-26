package com.nish.electoniccard.appclient;

import java.math.BigDecimal;

import com.nish.electoniccard.card.Card;
import com.nish.electoniccard.thread.DepositThread;
import com.nish.electoniccard.thread.WithdrawThread;

public class ApplicationClient {
	public static void main(String[] args) {
		Card card = new Card();
		card.setBalance(BigDecimal.valueOf(0.00));
		card.setCardHolerName("Nishanth Mathew Joy");
		DepositThread depositThread1 = new DepositThread(card, BigDecimal.valueOf(1000.00), "Amount deposited");
		DepositThread depositThread2 = new DepositThread(card, BigDecimal.valueOf(1000.00), "Amount deposited");
		DepositThread depositThread3 = new DepositThread(card, BigDecimal.valueOf(1000.00), "Amount deposited");
		Thread thread1 = new Thread(depositThread1, "Deposit 1");
		Thread thread2 = new Thread(depositThread2, "Deposit 2");
		Thread thread3 = new Thread(depositThread3, "Deposit 3");
		thread1.start();
		WithdrawThread withdrawThread1 = new WithdrawThread(card, BigDecimal.valueOf(10.00), "Amount deposited");
		WithdrawThread withdrawThread2 = new WithdrawThread(card, BigDecimal.valueOf(10.00), "Amount deposited");
		WithdrawThread withdrawThread3 = new WithdrawThread(card, BigDecimal.valueOf(10.00), "Amount deposited");
		Thread withdrawThread11 = new Thread(withdrawThread1, "Withdraw 1");
		Thread withdrawThread12 = new Thread(withdrawThread2, "Withdraw 2");
		Thread withdrawThread13 = new Thread(withdrawThread3, "Withdraw 3");
		withdrawThread11.start();
		withdrawThread12.start();
		withdrawThread13.start();
		thread2.start();
		thread3.start();
	}
}
