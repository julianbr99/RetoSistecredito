package co.com.certificacion.sistecredito.falabella.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ZonePaymentPage extends PageObject {
    public static final Target MESSAGE = Target.the("message").located(By.xpath("//h2[contains(text(),'Elige tu medio de pago')]"));
}
