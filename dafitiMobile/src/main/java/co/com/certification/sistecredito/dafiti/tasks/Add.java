package co.com.certification.sistecredito.dafiti.tasks;

import co.com.certification.sistecredito.dafiti.userinterface.CategorieMasculine;
import co.com.certification.sistecredito.dafiti.userinterface.HomePag;
import co.com.certification.sistecredito.dafiti.utils.Esperar;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class Add implements Task {
    public static Add product() {
        return Tasks.instrumented(Add.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            HomePag.BOTTON_CLOSE.resolveFor(actor).click();
        } catch
        (Exception e) {
        }

        actor.attemptsTo(

                Click.on(HomePag.CATEGORIE_MASCULINE),
                Click.on(CategorieMasculine.SHOP_ADIDAS),
                Click.on(CategorieMasculine.TENNIS_ADIDAS),
                Click.on(CategorieMasculine.TALLA_TENNIS),
                Esperar.unTiempo(2000),
                Click.on(CategorieMasculine.BUTTON_CARRITO)


        );

    }
}
