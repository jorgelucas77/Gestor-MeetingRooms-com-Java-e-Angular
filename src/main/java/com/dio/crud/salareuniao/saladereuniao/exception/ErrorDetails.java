package com.dio.crud.salareuniao.saladereuniao.exception;

import java.util.Date;

public class ErrorDetails {

    private Date timestamp;
    private String message;
    private String detail;

    public Date getTimestamp() {
        return timestamp;
    }

    public String getMessage() {
        return message;
    }

    public String getDetail() {
        return detail;
    }

    public ErrorDetails(Date timestamp, String message, String detail) {
        super();
        this.timestamp = timestamp;
        this.message = message;
        this.detail = detail;
    }
}
