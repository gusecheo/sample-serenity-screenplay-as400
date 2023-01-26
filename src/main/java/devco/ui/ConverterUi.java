package devco.ui;

import co.com.devco.automation.screenplay.as400.targets.*;

public class ConverterUi {

    public static final Target CELSIUS = Target.the("celsius").locatedByTag("CELSIUS");
    public static final Target FAHRENHEIT_OUT = Target.the("Fahrenheit output").locatedByCoordinate(Coordinate.withRow(10).withInitialColumn(40).andLenght(7));
    public static final Target KELVIN_OUT = Target.the("Kelvin output").locatedByCoordinate(Coordinate.withRow(12).withInitialColumn(40).andLenght(7));

}
