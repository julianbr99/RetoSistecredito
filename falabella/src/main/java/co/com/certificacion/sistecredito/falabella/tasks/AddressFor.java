package co.com.certificacion.sistecredito.falabella.tasks;

import co.com.certificacion.sistecredito.falabella.interactions.Continue;
import co.com.certificacion.sistecredito.falabella.userinterfaces.AddressPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class AddressFor implements Task {
    private final String address;
    private final String prefix;

    public AddressFor(String address, String prefix) {
        this.address = address;
        this.prefix = prefix;
    }

    public static AddressFor dispatch(String address, String prefix) {
        return Tasks.instrumented(AddressFor.class, address, prefix);

    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(WaitUntil.the(AddressPage.DIRECTION, WebElementStateMatchers.
                        isVisible()).forNoMoreThan(3).seconds(),
                Enter.theValue(address).into(AddressPage.DIRECTION),
                Enter.theValue(prefix).into(AddressPage.PREFIX),
                Click.on(AddressPage.CONFIRM_ADDRESS),
                Continue.shopping());
    }
}
