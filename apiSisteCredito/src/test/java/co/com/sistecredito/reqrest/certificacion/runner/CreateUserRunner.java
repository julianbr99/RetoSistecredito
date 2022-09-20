package co.com.sistecredito.reqrest.certificacion.runner;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/users.feature",
        glue = "co.com.sistecredito.reqrest.certificacion.stepdefinitions",
        snippets = SnippetType.CAMELCASE)

public class CreateUserRunner {
}
