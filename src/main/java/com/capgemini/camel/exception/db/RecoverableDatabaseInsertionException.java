package com.capgemini.camel.exception.db;

import com.capgemini.camel.exception.core.RecoverableException;

/**
 * Exception representing an error occurring during a database insert that can be retried.
 *
 * @author Abbas Attarwala
 */
public class RecoverableDatabaseInsertionException extends RecoverableException implements DatabaseInsertionError {

    /**
     * Constructor with message arg
     * @param message with message
     */
    public RecoverableDatabaseInsertionException(final String message) {
        super(message);
    }
    
    /**
     * Constructor with message and cause args
     * @param message the message
     * @param cause the Throwable that caused this exception
     */
    public RecoverableDatabaseInsertionException(final String message, final Throwable cause) {
        super(message, cause);
    }
    
}
