package co.com.certification.sistecredito.dafiti.questions;

import co.com.certification.sistecredito.dafiti.userinterface.InfoCuent;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Email implements Question<String> {
    public static Email isView() {
        return new Email();
    }

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(InfoCuent.INFO_EMAIL).viewedBy(actor).asString();
    }
}
