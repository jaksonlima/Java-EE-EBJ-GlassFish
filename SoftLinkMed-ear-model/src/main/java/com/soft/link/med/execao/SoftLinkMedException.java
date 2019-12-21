package com.soft.link.med.execao;

import javax.ejb.ApplicationException;

/**
 * @author jakson wilson bonfim de lima
 */
@ApplicationException(rollback = true)
public class SoftLinkMedException extends Exception {

    public SoftLinkMedException() {
    }

    public SoftLinkMedException(String message) {
        super(message);
    }

    public SoftLinkMedException(String message, Throwable cause) {
        super(message, cause);
    }

    public SoftLinkMedException(Throwable cause) {
        super(cause);
    }

    public SoftLinkMedException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
