package com.capgemini.camel.exception.db;

import com.capgemini.camel.exception.core.RecoverableException;

/**
 * Database exception which, when it occurs can be retried.
 *
 * @author Abbas Attarwala
 */
public class RecoverableDatabaseException extends RecoverableException {

    /**
     * Constructor with message arg
     * @param message with message
     */
    public RecoverableDatabaseException(final String message) {
        super(message);
    }
    
    /**
     * Constructor with message and cause args
     * @param message the message
     * @param cause the Throwable that caused this exception
     */
    public RecoverableDatabaseException(final String message, final Throwable cause) {
        super(message, cause);
    }
    
}
