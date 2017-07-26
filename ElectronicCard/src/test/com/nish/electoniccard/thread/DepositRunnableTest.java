package com.nish.electoniccard.thread;

import static org.junit.Assert.*;
import java.math.BigDecimal;
import org.junit.Test;
import com.nish.electoniccard.card.Card;
/**
 * Test for deposit thread
 * @author Nishanth Mathew Joy
 *
 */
public class DepositRunnableTest {

	@Test
	public void testRun() {
		Card card = new Card(); 
		card.setBalance(new BigDecimal("1000.00"));
		card.setCardHolerName("Test1");
		DepositRunnable runnable = new DepositRunnable(card, new BigDecimal("100.00"));
		runnable.run();
		assertEquals(new BigDecimal("1100.00"), card.getBalance());
	}
	

}
