package com.nish.electoniccard.transaction;


import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;

import org.junit.Test;

import com.nish.electoniccard.card.Card;
import com.nish.electoniccard.exception.TransactionException;
/**
 * Test for Transaction manager impl
 * @author Nishanth Mathew Joy
 *
 */
public class TransactionManagerImplTest {

	@Test
	public void testDebit() {
		Card card = new Card(); 
		card.setBalance(new BigDecimal("1000.00"));
		card.setCardHolerName("Test1");
		TransactionManagerImpl.getInstance().debitCard(card, new BigDecimal("100.00"));
		assertEquals(new BigDecimal("900.00"), card.getBalance());
	}
	@Test(expected = TransactionException.class)
	public void testDebitException() {
		Card card = new Card(); 
		card.setCardHolerName("Test1");
		TransactionManagerImpl.getInstance().debitCard(card, new BigDecimal("100.00"));
	}
	
	@Test(expected = TransactionException.class)
	public void testDebitInvalidReqNullCard() {
		TransactionManagerImpl.getInstance().debitCard(null, new BigDecimal("100.00"));
	}
	
	@Test(expected = TransactionException.class)
	public void testDebitInvalidReqNullAmount() {
		Card card = new Card(); 
		card.setCardHolerName("Test1");
		TransactionManagerImpl.getInstance().debitCard(card, null);
	}
	@Test(expected = TransactionException.class)
	public void testDebitInvalidReqAllNull() {
		TransactionManagerImpl.getInstance().debitCard(null, null);
	}
	@Test
	public void testCreit() {
		Card card = new Card(); 
		card.setBalance(BigDecimal.valueOf(1000));
		card.setCardHolerName("Test1");
		TransactionManagerImpl.getInstance().creditCard(card, new BigDecimal("100.00"));
		assertEquals(new BigDecimal("1100.00"), card.getBalance());
	}
	@Test(expected = TransactionException.class)
	public void testCreitInvalidReqNullCard() {
		TransactionManagerImpl.getInstance().creditCard(null, new BigDecimal("100.00"));
	}
	
	@Test(expected = TransactionException.class)
	public void testCreitInvalidReqNullAmount() {
		Card card = new Card(); 
		card.setCardHolerName("Test1");
		TransactionManagerImpl.getInstance().creditCard(card, null);
	}
	@Test(expected = TransactionException.class)
	public void testCreditInvalidReqAllNull() {
		TransactionManagerImpl.getInstance().creditCard(null, null);
	}
}
