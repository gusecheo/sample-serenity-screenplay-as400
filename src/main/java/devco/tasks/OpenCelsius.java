package devco.tasks;

import co.com.devco.automation.screenplay.as400.screen5250.interactions.*;
import co.com.devco.automation.screenplay.as400.screen5250.utils.*;
import devco.ui.*;
import net.serenitybdd.screenplay.*;

public class OpenCelsius {

    public static Performable converter(){
        return Task.where("{0} open open celsius converter",actor ->
                actor.attemptsTo(
                        Enter.theValue("CALL DEVCO1/CELSIUS").into(GeneralUi.COMMNAD),
                        Hit.the(KeysScreen.ENTER)
                ));
    }

}
