package com.barclaycardus.e2e.exception;

/**
 * Created by Juhil on 7/23/2017.
 */
public class MonteBeanCreationException extends Exception {

    public MonteBeanCreationException()
    {
        super();
    }

    public MonteBeanCreationException(String message)
    {
        super(message);
    }

    public MonteBeanCreationException(String message, Throwable cause)
    {
        super(message,cause);
    }

    protected MonteBeanCreationException(String message, Throwable cause ,boolean enableSuppresson, boolean writableStackTrace)
    {
        super(message,cause,enableSuppresson,writableStackTrace);

    }
}
