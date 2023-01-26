package devco.ui;

import co.com.devco.automation.screenplay.as400.targets.Target;

public class LoginUi {

    public static final Target USERNAME = Target.the("username").locatedByTag("Your user name");
    public static final Target PASSWORD = Target.the("password").locatedByTag("Password");

}
