package co.com.sistecredito.reqrest.tasks;

import co.com.sistecredito.reqrest.utilis.constans.Constans;
import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.rest.interactions.Delete;

import static co.com.sistecredito.reqrest.utilis.constans.Constans.*;

public class DeleteUser implements Task {
    public static DeleteUser viewUserDelete() {

        return Tasks.instrumented(DeleteUser.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                Delete.from(RESOURSE_DELETE).with(request -> request.
                        contentType(ContentType.JSON))
        );

        System.out.println("Code " + SerenityRest.lastResponse().statusCode());
    }
}
