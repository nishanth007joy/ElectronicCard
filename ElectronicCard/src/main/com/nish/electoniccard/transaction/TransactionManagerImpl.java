package com.nish.electoniccard.transaction;

import java.math.BigDecimal;

import com.nish.electoniccard.exception.TransactionException;
import com.nish.electoniccard.card.Card;
/**
 * This class deals with core logic of transaction
 * @author Nishanth Mathew Joy
 *
 */
public class TransactionManagerImpl implements TransactionManager{
	private TransactionManagerImpl() {
	}
	private static final TransactionManagerImpl  transactionManager  = new TransactionManagerImpl();
	/**
	 * This is the methord returns instance of transaction manager
	 * @return
	 */
	public static synchronized TransactionManagerImpl getInstance(){
		return transactionManager;
	}
	@Override
	public synchronized void debitCard(final Card card,final BigDecimal amount) {
		if(null == card || null == amount){
			throw new TransactionException(TransactionException.ERROR_CODE_1);
		}
		BigDecimal currentBalance = card.getBalance();
		currentBalance = currentBalance.subtract(amount);
		if(currentBalance.signum() == -1){
			throw new TransactionException("Negative transaction not allowed for withdrawal  of "+amount+" from current balance of " +card.getBalance());
		}
		card.setBalance(currentBalance);
		System.out.println("After withdraw " + card);
	}

	@Override
	public synchronized void creditCard(final Card card,final BigDecimal amount) {
		if(null == card || null == amount){
			throw new TransactionException(TransactionException.ERROR_CODE_1);
		}
		BigDecimal currentBalance = card.getBalance();
		currentBalance= currentBalance.add(amount);
		card.setBalance(currentBalance);
		System.out.println("After deposit " + card);
	}
}
