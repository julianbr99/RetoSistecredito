package co.com.certification.sistecredito.dafiti.exceptions;

import co.com.certification.sistecredito.dafiti.utils.Constans.Constans;

import static co.com.certification.sistecredito.dafiti.utils.Constans.Constans.EXCEPTION_CREATE;

public class CreateUserExeptions extends AssertionError {
    public CreateUserExeptions(String message, Throwable cause) {
        super(EXCEPTION_CREATE);
    }
}
