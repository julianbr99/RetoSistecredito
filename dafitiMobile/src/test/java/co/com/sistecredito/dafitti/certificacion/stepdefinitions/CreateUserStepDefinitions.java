package co.com.sistecredito.dafitti.certificacion.stepdefinitions;

import co.com.certification.sistecredito.dafiti.exceptions.CreateUserExeptions;
import co.com.certification.sistecredito.dafiti.models.Users;
import co.com.certification.sistecredito.dafiti.questions.Email;
import co.com.certification.sistecredito.dafiti.tasks.Create;
import co.com.certification.sistecredito.dafiti.utils.DriverMobile;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import org.hamcrest.Matchers;

import java.util.List;

public class CreateUserStepDefinitions {
    @Before
    public void setUp() {
        OnStage.setTheStage(Cast.whereEveryoneCan(BrowseTheWeb.with(DriverMobile.dafitiApplication())));
        OnStage.theActorCalled("julian");
    }

    @Given("^open apk$")
    public void openApk() {

    }


    @When("^create user$")
    public void createUser(List<Users> user) {
        OnStage.theActorInTheSpotlight().attemptsTo
                (Create.acount(user.get(0)));

    }

    @Then("^user views he (.*)$")
    public void userViewsHeEmail(String email) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(
                Email.isView(), Matchers.is(email)
        ).orComplainWith(CreateUserExeptions.class));
    }


}
