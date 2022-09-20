package co.com.certificacion.sistecredito.falabella.expections;

import co.com.certificacion.sistecredito.falabella.utils.constans.Constants;

import static co.com.certificacion.sistecredito.falabella.utils.constans.Constants.*;

public class BuyItemExceptions extends AssertionError {
    public BuyItemExceptions(String message, Throwable cause) {
        super(EXCEPTION);
    }
}
