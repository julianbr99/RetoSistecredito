package co.com.sistecredito.reqrest.tasks;

import co.com.sistecredito.reqrest.models.User;
import co.com.sistecredito.reqrest.utilis.constans.Constans;
import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.rest.interactions.Put;

import static co.com.sistecredito.reqrest.utilis.constans.Constans.RESOURSE_UPDATE;

public class UpdateUser implements Task {
    private User user ;

    public UpdateUser(User user) {
        this.user = user;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                Put.to(RESOURSE_UPDATE).with
                        (request ->request.contentType(ContentType.JSON).body(user))
        );
        SerenityRest.lastResponse().print();
    }
    public static UpdateUser viewUpdate(User user){

        return Tasks.instrumented(UpdateUser.class,user);
    }
}
