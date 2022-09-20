package co.com.certificacion.sistecredito.falabella.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ShopperPage extends PageObject {
    public static final Target DEPARTMENT = Target.the("department").located(By.id("region"));
    public static final Target CITY = Target.the("city").located(By.id("ciudad"));
    public static final Target NEIGHBORHOOD = Target.the("neighborhood").located(By.id("comuna"));
    public static final Target CONTINUE = Target.the("continue")
            .located(By.xpath("//div[@class='fbra_formItem fbra_formItem--Button fbra_input--field04' or @class='fbra_checkoutComponentDeliveryActions__addGiftOptionsAndSecurePaymentButtons fbra_test_checkoutComponentDeliveryActions__addGiftOptionsAndSecurePaymentButtons']//button"));

}
