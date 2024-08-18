package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

    @RunWith(Cucumber.class)
    @CucumberOptions(
            //Localiza os cenários
            features = "src/test/java/features",

            //Localização dos testes
            glue = {"utility", "stepDefinition"},
            plugin = {"pretty","html:target/cucumber-html-report", "json:cucumber.json"},
            monochrome = true,
            stepNotifications = true,
            snippets = CucumberOptions.SnippetType.CAMELCASE
    )
    public class testRunner {

    }

