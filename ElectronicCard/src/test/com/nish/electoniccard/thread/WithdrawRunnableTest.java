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
		card.setBalance(new BigDecimal("1000.00"));
		card.setCardHolerName("Test1");
		WithdrawRunnable runnable = new WithdrawRunnable(card,  new BigDecimal("100.00"));
		runnable.run();
		assertEquals(new BigDecimal("900.00"), card.getBalance());
	}
	
	@Test(expected = TransactionException.class)
	public void testRunException() {
		Card card = new Card(); 
		card.setCardHolerName("Test1");
		WithdrawRunnable runnable = new WithdrawRunnable(card,  new BigDecimal("100.00"));
		runnable.run();
	}

}
