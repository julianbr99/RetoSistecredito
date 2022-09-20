package co.com.sistecredito.reqrest.tasks;

import co.com.sistecredito.reqrest.models.User;
import co.com.sistecredito.reqrest.utilis.constans.Constans;
import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.rest.interactions.Post;

import static co.com.sistecredito.reqrest.utilis.constans.Constans.*;

public class  CreateUser implements Task {

    private User user;

    public CreateUser(User user) {
        this.user = user;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Post.to(RESOURSE_CREATE).with(request
                        ->request.contentType(ContentType.JSON).body(user))
        );
        SerenityRest.lastResponse().
                print();

    }
    public static CreateUser withData(User user){
     return  Tasks.instrumented(CreateUser.class,user);
    }
}
