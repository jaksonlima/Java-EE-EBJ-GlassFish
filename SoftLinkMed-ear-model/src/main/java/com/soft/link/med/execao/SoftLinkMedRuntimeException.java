package com.soft.link.med.execao;

import com.soft.link.med.model.iinterface.IEnum;
import javax.ejb.ApplicationException;

/**
 * @author jakson wilson bonfim de lima
 */
@ApplicationException(rollback = true)
public class SoftLinkMedRuntimeException extends RuntimeException {

    public SoftLinkMedRuntimeException() {
    }

    public SoftLinkMedRuntimeException(String message) {
        super(message);
    }

    public SoftLinkMedRuntimeException(IEnum iEnum) {
        super(iEnum.getValue());
    }

    public SoftLinkMedRuntimeException(String message, Throwable cause) {
        super(message, cause);
    }

    public SoftLinkMedRuntimeException(Throwable cause) {
        super(cause);
    }

    public SoftLinkMedRuntimeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    @FunctionalInterface
    public interface isChecked<T> {

        T getChecked() throws Exception;
    }

    @FunctionalInterface
    public interface isVoidChecked {

        void voidChecked() throws Exception;
    }

    public static <T> T getChecked(isChecked<T> checked) {
        try {
            return checked.getChecked();
        } catch (Exception ex) {
            throw new SoftLinkMedRuntimeException(ex);
        }
    }

    public static void voidChecked(isVoidChecked isVoidChecked) {
        try {
            isVoidChecked.voidChecked();
        } catch (Exception ex) {
            throw new SoftLinkMedRuntimeException(ex);
        }
    }

}
