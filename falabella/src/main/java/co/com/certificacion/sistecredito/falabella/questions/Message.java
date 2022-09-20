package co.com.certificacion.sistecredito.falabella.questions;

import co.com.certificacion.sistecredito.falabella.userinterfaces.ZonePaymentPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Message implements Question <String> {
    @Override
    public String answeredBy(Actor actor) {
        return Text.of(ZonePaymentPage.MESSAGE).viewedBy(actor).asString();
    }
    public static Message paymentMethod(){

        return new Message();
    }
}
