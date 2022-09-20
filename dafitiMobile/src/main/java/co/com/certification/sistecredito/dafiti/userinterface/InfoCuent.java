package co.com.certification.sistecredito.dafiti.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class InfoCuent {
    public static final Target INFO_EMAIL = Target.the("email")
            .located(By.id("br.com.dafiti:id/account_email"));

}
