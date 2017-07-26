package com.nish.electoniccard.thread;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;

import org.junit.Test;

import com.nish.electoniccard.card.Card;
import com.nish.electoniccard.exception.TransactionException;
/**
 * Test class for Withdraw thread
 * @author Nishanth Mathew Joy
 *
 */
public class WithdrawRunnableTest {

	@Test
	public void testRun() {
		Card card = new Card(); 
		card.setBalance(BigDecimal.valueOf(1000));
		card.setCardHolerName("Test1");
		WithdrawRunnable runnable = new WithdrawRunnable(card,  BigDecimal.valueOf(100));
		runnable.run();
		assertEquals(BigDecimal.valueOf(900), card.getBalance());
	}
	
	@Test(expected = TransactionException.class)
	public void testRunException() {
		Card card = new Card(); 
		card.setCardHolerName("Test1");
		WithdrawRunnable runnable = new WithdrawRunnable(card,  BigDecimal.valueOf(100));
		runnable.run();
	}

}
