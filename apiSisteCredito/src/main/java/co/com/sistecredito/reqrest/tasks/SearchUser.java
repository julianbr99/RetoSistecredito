package co.com.sistecredito.reqrest.tasks;

import co.com.sistecredito.reqrest.models.User;
import co.com.sistecredito.reqrest.utilis.constans.Constans;
import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.rest.interactions.Get;

import static co.com.sistecredito.reqrest.utilis.constans.Constans.*;

public class SearchUser implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Get.resource(RESOURSE_SEARCH).with(request ->
                        request.contentType(ContentType.JSON)


                )
        );
        SerenityRest.lastResponse().print();
    }
    public static SearchUser viewUserSearch(){

        return Tasks.instrumented(SearchUser.class);
    }
}
