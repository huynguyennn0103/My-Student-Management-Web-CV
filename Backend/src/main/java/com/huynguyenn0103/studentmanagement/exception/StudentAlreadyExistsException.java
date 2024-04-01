package com.huynguyenn0103.studentmanagement.exception;


public class StudentAlreadyExistsException extends RuntimeException {
    public StudentAlreadyExistsException(String message) {
        super(message);
    }
}
