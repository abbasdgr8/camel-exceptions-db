package com.capgemini.camel.exception.db;

import com.capgemini.camel.exception.core.RecoverableException;

/**
 * Exception representing an error occurring during database deletion that could be retried.
 *
 * @author Abbas Attarwala
 */
public class RecoverableDatabaseDeletionException extends RecoverableException implements DatabaseDeletionError {

    /**
     * Constructor with message arg
     * @param message with message
     */
    public RecoverableDatabaseDeletionException(final String message) {
        super(message);
    }
    
    /**
     * Constructor with message and cause args
     * @param message the message
     * @param cause the Throwable that caused this exception
     */
    public RecoverableDatabaseDeletionException(final String message, final Throwable cause) {
        super(message, cause);
    }
    
}
