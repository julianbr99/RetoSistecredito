package co.com.certification.sistecredito.dafiti.interactions;

import net.serenitybdd.core.time.InternalSystemClock;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Wait implements Interaction {
    private int var;

    protected Wait(int var) {
        this.var = var * 1000;
    }

    public static Wait forTime(int var) {
        return instrumented(Wait.class, var);
    }

    @Step("{0} waits for the element")
    @Override
    public <T extends Actor> void performAs(T actor) {
        new InternalSystemClock().pauseFor(var);
    }



    }

