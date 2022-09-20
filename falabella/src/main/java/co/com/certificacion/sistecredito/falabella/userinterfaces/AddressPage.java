package co.com.certificacion.sistecredito.falabella.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class AddressPage extends PageObject {

    public static final Target DIRECTION = Target.the("direction").located(By.id("address"));
    public static final Target PREFIX = Target.the("prefix").located(By.id("departmentNumber"));
    public static final Target CONFIRM_ADDRESS = Target.the("confirm address").located(By.name("useAddress"));
    public static final Target SEARCH = Target.the("search").located(By.xpath("//input[@class='SearchBar-module_searchBar__Input__1VvhT']"));


}
