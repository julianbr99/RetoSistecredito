package co.com.sistecredito.reqrest.certificacion.stepdefinitions;

import co.com.sistecredito.reqrest.models.User;
import co.com.sistecredito.reqrest.tasks.CreateUser;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;
import net.serenitybdd.screenplay.rest.questions.ResponseConsequence;

import java.util.List;

public class CreateUserStepDefinitions {
    @Before
    public void preparation() {

        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("julian");


    }

    @Given("^user preparation the service$")
    public void userPreparationTheService() {
        OnStage.theActorInTheSpotlight().whoCan(CallAnApi.at("https://reqres.in/api/"));
    }


    @When("^he create user$")
    public void heCreateUser(List<User> user) {
        OnStage.theActorInTheSpotlight().
                attemptsTo(CreateUser.withData(user.get(0)));

    }

    @Then("^he could views the code (.*)$")
    public void heCouldViewsTheCode(int code) {

        OnStage.theActorInTheSpotlight().should(ResponseConsequence
                .seeThatResponse("Create", response -> response.statusCode(code)));

    }
}
