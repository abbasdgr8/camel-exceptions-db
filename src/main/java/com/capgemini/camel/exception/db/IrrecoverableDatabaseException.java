package com.capgemini.camel.exception.db;

import com.capgemini.camel.exception.core.IrrecoverableException;

/**
 * A database exception that should not be retried.
 *
 * @author Abbas Attarwala
 */
public class IrrecoverableDatabaseException extends IrrecoverableException {
    
    /**
     * Constructor with message arg
     * @param message with message
     */
    public IrrecoverableDatabaseException(final String message) {
        super(message);
    }
    
    /**
     * Constructor with message and cause args
     * @param message the message
     * @param cause the Throwable that caused this exception
     */
    public IrrecoverableDatabaseException(final String message, final Throwable cause) {
        super(message, cause);
    }
    
}
