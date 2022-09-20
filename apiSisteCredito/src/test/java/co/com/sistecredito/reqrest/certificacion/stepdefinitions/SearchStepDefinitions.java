package co.com.sistecredito.reqrest.certificacion.stepdefinitions;

import co.com.sistecredito.reqrest.tasks.SearchUser;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;

public class SearchStepDefinitions {
    @When("^he search user$")
    public void heSearchUser() {
        OnStage.theActorInTheSpotlight().attemptsTo(SearchUser.viewUserSearch());

    }



}
