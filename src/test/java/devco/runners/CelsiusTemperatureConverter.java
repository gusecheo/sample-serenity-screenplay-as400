package devco.runners;


import io.cucumber.junit.*;
import io.cucumber.junit.CucumberOptions.*;
import net.serenitybdd.cucumber.*;
import org.junit.runner.*;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "classpath:features/temperature_converter/celsius_temperature_converter.feature",
        glue = "devco.stepdefinitions",
        snippets = SnippetType.CAMELCASE
)

public class CelsiusTemperatureConverter {}
