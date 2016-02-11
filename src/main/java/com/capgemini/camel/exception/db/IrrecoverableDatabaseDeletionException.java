package com.capgemini.camel.exception.db;

import com.capgemini.camel.exception.core.IrrecoverableException;

/**
 * Exception representing an error occuring during database deletion that need not be retried.
 *
 * @author Abbas Attarwala
 */
public class IrrecoverableDatabaseDeletionException extends IrrecoverableException implements DatabaseDeletionError {

    /**
     * Constructor with message arg
     * @param message with message
     */
    public IrrecoverableDatabaseDeletionException(final String message) {
        super(message);
    }
    
    /**
     * Constructor with message and cause args
     * @param message the message
     * @param cause the Throwable that caused this exception
     */
    public IrrecoverableDatabaseDeletionException(final String message, final Throwable cause) {
        super(message, cause);
    }
    
}
