package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

public class MyFileNotFoundException extends Exception {

    public MyFileNotFoundException(String message) {
        super(message);
    }

    public MyFileNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
