package devco.stepdefinitions;

import co.com.devco.automation.screenplay.as400.model.*;
import co.com.devco.automation.screenplay.as400.screen5250.interactions.*;
import co.com.devco.automation.screenplay.as400.screen5250.questions.*;
import devco.tasks.*;
import devco.ui.*;
import io.cucumber.java.en.*;
import net.serenitybdd.screenplay.actors.*;
import net.serenitybdd.screenplay.ensure.*;

public class CelsiusTemperatureConverter {

    @Given("the user is in the celsius converter")
    public void theUserIsInTheCelsiusConverter() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Login.inPub400(),
                OpenCelsius.converter()
        );
    }

    @When("the user enters {string} Celsius degrees to (.*)")
    public void theUserEntersCelsiusDegreesToFahrenheit(String valueCelsius) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Convert.celcius(valueCelsius)
        );
    }

    @Then("the result should be {string} Fahrenheit degrees")
    public void theResultShouldBeFahrenheitDegrees(String valueCelsius) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Ensure.that(Text.of(ConverterUi.FAHRENHEIT_OUT).trim()).isEqualTo(valueCelsius)
        );
    }

    @Then("the result should be {string} Kelvin degrees")
    public void theResultShouldBeKelvinDegrees(String valueCelsius) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Ensure.that(Text.of(ConverterUi.KELVIN_OUT).trim()).isEqualTo(valueCelsius)
        );
    }

    @Then("the system should display an error message {string}")
    public void theSystemShouldDisplayAnErrorMessage(String string) {

    }

}
