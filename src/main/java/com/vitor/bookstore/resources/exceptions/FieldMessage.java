package com.vitor.bookstore.resources.exceptions;

import java.io.Serializable;

public class FieldMessage implements Serializable {

    private String fieldName;
    private String message;

    private static final long serialVersionUID= 1L;

    public FieldMessage() {
        super();
    }

    public FieldMessage(String fieldName, String message) {
        super();
        this.fieldName = fieldName;
        this.message = message;
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
