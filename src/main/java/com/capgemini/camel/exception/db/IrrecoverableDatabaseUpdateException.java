package com.capgemini.camel.exception.db;

import com.capgemini.camel.exception.core.IrrecoverableException;

/**
 * Exception representing an error occurring during database update/upsert that need not be retried.
 *
 * @author Abbas Attarwala
 */
public class IrrecoverableDatabaseUpdateException extends IrrecoverableException implements DatabaseUpdateError {

    /**
     * Constructor with message arg
     * @param message with message
     */
    public IrrecoverableDatabaseUpdateException(final String message) {
        super(message);
    }
    
    /**
     * Constructor with message and cause args
     * @param message the message
     * @param cause the Throwable that caused this exception
     */
    public IrrecoverableDatabaseUpdateException(final String message, final Throwable cause) {
        super(message, cause);
    }
    
}
