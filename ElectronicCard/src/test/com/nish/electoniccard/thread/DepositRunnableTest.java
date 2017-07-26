package com.nish.electoniccard.thread;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Test;

import com.nish.electoniccard.card.Card;

public class DepositRunnableTest {

	@Test
	public void testRun() {
		Card card = new Card(); 
		card.setBalance(BigDecimal.valueOf(1000));
		card.setCardHolerName("Test1");
		DepositRunnable runnable = new DepositRunnable(card,  BigDecimal.valueOf(100));
		runnable.run();
		assertEquals(BigDecimal.valueOf(1100), card.getBalance());
	}
	

}
