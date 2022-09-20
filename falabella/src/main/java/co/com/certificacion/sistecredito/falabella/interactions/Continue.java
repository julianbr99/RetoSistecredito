package co.com.certificacion.sistecredito.falabella.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.certificacion.sistecredito.falabella.userinterfaces.ShopperPage.CONTINUE;

public class Continue implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(CONTINUE));
    }

    public static Continue shopping(){
        return Tasks.instrumented(Continue.class);
    }
}
