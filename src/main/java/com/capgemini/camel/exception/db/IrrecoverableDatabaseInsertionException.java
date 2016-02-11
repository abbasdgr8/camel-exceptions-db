package com.capgemini.camel.exception.db;

import com.capgemini.camel.exception.core.IrrecoverableException;

/**
 * Exception representing an error occurring during a database insert that need not be retried.
 *
 * @author Abbas Attarwala
 */
public class IrrecoverableDatabaseInsertionException extends IrrecoverableException implements DatabaseInsertionError {

    /**
     * Constructor with message arg
     * @param message with message
     */
    public IrrecoverableDatabaseInsertionException(final String message) {
        super(message);
    }
    
    /**
     * Constructor with message and cause args
     * @param message the message
     * @param cause the Throwable that caused this exception
     */
    public IrrecoverableDatabaseInsertionException(final String message, final Throwable cause) {
        super(message, cause);
    }
}
