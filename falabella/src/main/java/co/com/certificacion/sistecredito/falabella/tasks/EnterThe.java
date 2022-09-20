package co.com.certificacion.sistecredito.falabella.tasks;

import co.com.certificacion.sistecredito.falabella.interactions.Continue;
import co.com.certificacion.sistecredito.falabella.userinterfaces.ShopperPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class EnterThe implements Task {
    String region;
    String city;
    String neighborhood;

    public EnterThe(String region, String city, String neighborhood) {
        this.region = region;
        this.city = city;
        this.neighborhood = neighborhood;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
        SelectFromOptions.byVisibleText(region).from(ShopperPage.DEPARTMENT),
                SelectFromOptions.byVisibleText(city).from(ShopperPage.CITY),
                SelectFromOptions.byVisibleText(neighborhood).from(ShopperPage.NEIGHBORHOOD),
                Scroll.to(ShopperPage.NEIGHBORHOOD),
                Continue.shopping());
    }

    public static EnterThe location(String region, String city, String neighborhood){
        return Tasks.instrumented(EnterThe.class, region,city,neighborhood);

    }
}
