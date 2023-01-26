package devco.tasks;

import co.com.devco.automation.screenplay.as400.screen5250.interactions.*;
import co.com.devco.automation.screenplay.as400.screen5250.utils.*;
import devco.ui.*;
import net.serenitybdd.screenplay.*;

public class Convert {

    public static Performable celcius(String value){
        return Task.where("{0} converts '"+value+"' degrees Celsius.",actor ->
                actor.attemptsTo(
                        Enter.theValue(value).into(ConverterUi.CELSIUS),
                        Hit.the(KeysScreen.ENTER)
                )
        );
    }

}
