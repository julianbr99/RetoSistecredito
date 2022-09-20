package co.com.sistecredito.certificacion.falabella.runner;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/buy_item.feature",
        glue = "co.com.sistecredito.certificacion.falabella.stepdefinitions",
        snippets = SnippetType.CAMELCASE)

public class BuyItemRunner {
}
