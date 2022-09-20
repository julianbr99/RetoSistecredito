package co.com.certification.sistecredito.dafiti.tasks;

import co.com.certification.sistecredito.dafiti.models.Users;
import co.com.certification.sistecredito.dafiti.userinterface.HomePag;
import co.com.certification.sistecredito.dafiti.userinterface.RegisterUser;
import co.com.certification.sistecredito.dafiti.utils.Esperar;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;

public class Create implements Task {
    private final Users user;

    public Create(Users user) {
        this.user = user;
    }

    public static Create acount(Users user) {
        return Tasks.instrumented(Create.class, user);
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
                Click.on(HomePag.BUTTON_CUENT),
                Click.on(HomePag.BUTTON_ENTER),
                Click.on(HomePag.BUTTON_CREATE_COUNT),
                SendKeys.of(user.getEmail()).into(RegisterUser.EMAIL),
                SendKeys.of(user.getPasword()).into(RegisterUser.PASWORD),
                SendKeys.of(user.getConfirmpasword()).into(RegisterUser.CONFIRM_PASWORD),
                Click.on(RegisterUser.TIPO_DOCUMENTO),
                Click.on(RegisterUser.SELECT_DOCUMENTO),
                SendKeys.of(user.getDocumento()).into(RegisterUser.NUMERO_DOCUMENTO),
                SendKeys.of(user.getNombre()).into(RegisterUser.NOMBRE),
                SendKeys.of(user.getApellido()).into(RegisterUser.APELLIDO),
                SendKeys.of(user.getFechanacimiento()).into(RegisterUser.NACIMIENTO),
                Click.on(RegisterUser.GENERO),
                Click.on(RegisterUser.SELECT_GENERO),
                Click.on(RegisterUser.BOTTON_SAVE),
                Esperar.unTiempo(5000)


        );
    }
}
