package co.com.certification.sistecredito.dafiti.questions;

import co.com.certification.sistecredito.dafiti.userinterface.Carr;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Proceed implements Question <String> {
    @Override
    public String answeredBy(Actor actor) {
        return Text.of(Carr.PROCEED_PAYMENT).
                viewedBy(actor).asString();
    }
    public static Proceed payment  (){

        return new Proceed();
    }
}
