package co.com.sistecredito.certificacion.falabella.stepdefinitions;

import co.com.certificacion.sistecredito.falabella.expections.BuyItemExceptions;
import co.com.certificacion.sistecredito.falabella.models.Person;
import co.com.certificacion.sistecredito.falabella.questions.Message;
import co.com.certificacion.sistecredito.falabella.tasks.BuyItem;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

import static co.com.certificacion.sistecredito.falabella.utils.constans.Constants.JULIAN;
import static co.com.certificacion.sistecredito.falabella.utils.constans.Constants.URL;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;
import static org.hamcrest.Matchers.is;


public class BuyItemStepDefinitions {

    @Before
    public void preparation() {
        setTheStage(new OnlineCast());
        theActorCalled(JULIAN);
        WebDriverManager.chromedriver().setup();
    }


    @Given("^pag web falabella$")
    public void pagWebFalabella() {
        theActorInTheSpotlight().wasAbleTo(Open.url(URL));

    }


    @When("^user go select on  section$")
    public void userGoSelectOnSection(List<Person> persona) {

        theActorInTheSpotlight().attemptsTo(BuyItem.cellPhone(persona.get(0)));

    }

    @Then("^user views  (.*)")
    public void userViewsA(String message) {
        theActorInTheSpotlight().should(seeThat
                (Message.paymentMethod(), is(message)).orComplainWith(BuyItemExceptions.class));
    }
}
