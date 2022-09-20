package co.com.sistecredito.reqrest.certificacion.stepdefinitions;

import co.com.sistecredito.reqrest.models.User;
import co.com.sistecredito.reqrest.tasks.UpdateUser;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;

import java.util.List;

public class UptadeUserStepDefinitions {


    @When("^he update user$")
    public void heUpdateUser(List<User> user) {
        OnStage.theActorInTheSpotlight().attemptsTo(UpdateUser.viewUpdate(user.get(0)));

    }
}
