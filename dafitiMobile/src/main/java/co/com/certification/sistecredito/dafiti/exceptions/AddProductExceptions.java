package co.com.certification.sistecredito.dafiti.exceptions;

import co.com.certification.sistecredito.dafiti.utils.Constans.Constans;

import static co.com.certification.sistecredito.dafiti.utils.Constans.Constans.*;

public class AddProductExceptions extends AssertionError {
    public AddProductExceptions(String message, Throwable cause) {
        super(EXCEPTION_ADD);
    }
}
