package com.nish.electoniccard.exception;
/**
 * 
 * @author Nishanth Mathew Joy
 *
 */
public class TransactionException extends RuntimeException{
	private static final long serialVersionUID = 1L;

	  /**
	   * Construct Transaction exception with message.
	   *
	   * @param message
	   */
	  public TransactionException(String message) {
	    super(message);
	  }
}
