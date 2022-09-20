package co.com.certification.sistecredito.dafiti.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Carr {

    public static final Target PROCEED_PAYMENT = Target.the("proceed payment")
            .located(By.id("br.com.dafiti:id/cart_bottom_button"));
}
