package co.com.sistecredito.dafitti.certificacion.runner;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/agrege_product.feature",
        glue = "co.com.sistecredito.dafitti.certificacion.stepdefinitions",
        snippets = SnippetType.CAMELCASE)

public class AddRunner {
}
