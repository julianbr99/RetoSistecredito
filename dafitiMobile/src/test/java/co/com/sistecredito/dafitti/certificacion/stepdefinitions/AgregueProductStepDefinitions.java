package co.com.sistecredito.dafitti.certificacion.stepdefinitions;

import co.com.certification.sistecredito.dafiti.exceptions.AddProductExceptions;
import co.com.certification.sistecredito.dafiti.questions.Proceed;
import co.com.certification.sistecredito.dafiti.tasks.Add;
import co.com.certification.sistecredito.dafiti.utils.enums.Translate;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

public class AgregueProductStepDefinitions {
    @When("^add product$")
    public void agregueProduct() {
        OnStage.theActorInTheSpotlight().attemptsTo(Add.product());
    }

    @Then("^he will visualize (.*)$")
    public void userViewsOnProductToCarr(String message) {
        OnStage.theActorInTheSpotlight()
                .should(seeThat(Proceed.payment(),
                        is(equalTo(Translate.valueOf(message).word()))).
                        orComplainWith(AddProductExceptions.class));
        ;

    }

}
