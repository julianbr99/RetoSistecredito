package co.com.certificacion.sistecredito.falabella.tasks;

import co.com.certificacion.sistecredito.falabella.models.Person;
import co.com.certificacion.sistecredito.falabella.userinterfaces.AddressPage;
import co.com.certificacion.sistecredito.falabella.userinterfaces.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

public class AddProduct implements Task {
     private String category;
     private String product;

    public AddProduct(String category, String product) {
        this.category = category;
        this.product = product;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(category).into(AddressPage.SEARCH).thenHit(Keys.ENTER),
                Click.on(HomePage.PRODUCT.of(product)),
                WaitUntil.the(HomePage.ADD_BAG, WebElementStateMatchers.
                        isVisible()).forNoMoreThan(3).seconds(),
                Click.on(HomePage.ADD_BAG),
                Click.on(HomePage.SHOPPING)
        );
    }

    public static AddProduct toBag(String category, String product){
        return Tasks.instrumented(AddProduct.class, category, product);
    }


}
