package com.capgemini.camel.exception.db;

/**
 * Marker interface, classifying an exception as a database related error.
 *
 * @author Abbas Attarwala
 */
public interface DatabaseError {
    String DESCRIPTION = "This is a database related exception.";
}
