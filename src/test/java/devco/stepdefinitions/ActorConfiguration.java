package devco.stepdefinitions;

import co.com.devco.automation.screenplay.as400.model.*;
import co.com.devco.automation.screenplay.as400.screen5250.utils.*;
import io.cucumber.java.*;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class ActorConfiguration {

    @Before
    public void actorConfiguration(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Pepito");
    }

    @After
    public void closeSession(){
        Close.session();
    }

}
