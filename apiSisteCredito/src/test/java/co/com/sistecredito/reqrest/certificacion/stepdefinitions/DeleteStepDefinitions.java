package co.com.sistecredito.reqrest.certificacion.stepdefinitions;

import co.com.sistecredito.reqrest.tasks.DeleteUser;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;

public class DeleteStepDefinitions {
    @When("^he delete user$")
    public void heDeleteUser() {
        OnStage.theActorInTheSpotlight().attemptsTo(DeleteUser.viewUserDelete());

    }
}
