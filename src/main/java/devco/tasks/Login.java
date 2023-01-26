package devco.tasks;

import co.com.devco.automation.screenplay.as400.model.*;
import co.com.devco.automation.screenplay.as400.screen5250.interactions.*;
import co.com.devco.automation.screenplay.as400.screen5250.utils.*;
import devco.ui.*;
import net.serenitybdd.screenplay.*;

public class Login {

    public static Performable inPub400(){
        return Task.where("{0} login in pub400 server",actor -> actor.attemptsTo(
                        Open5250.session(Session.withHost("pub400.com").andPort(992).conectingToSSL(true)),
                        Enter.theValue("devco").into(LoginUi.USERNAME),
                        Enter.theValue("devco400").into(LoginUi.PASSWORD),
                        Hit.the(KeysScreen.ENTER)
                )
                );
    }

}
