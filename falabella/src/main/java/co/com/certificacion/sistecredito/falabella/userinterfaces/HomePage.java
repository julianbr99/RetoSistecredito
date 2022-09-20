package co.com.certificacion.sistecredito.falabella.userinterfaces;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePage extends PageObject {
    public static final Target PRODUCT = Target.the("select product").locatedBy("//b[contains(text(),'{0}')]//ancestor::div[@data-pod]//button//div//div");
    public static final Target ADD_BAG = Target.the("add bag").located(By.id("linkButton"));
    public static final Target SHOPPING = Target.the("shopping").located(By.xpath("//button[contains(text(),'Ir a comprar')]"));


}
