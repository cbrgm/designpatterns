package patterns.structural.flyweight.example;

/**
 * Konkretes Fliegengewicht
 * 
 * @author Christian Bargmann <christian.bargmann@haw-hamburg.de>
 * @version 02.02.2017
 * @see patterns.structural.flyweight.example
 * @since 02.02.2017 , 14:45:39
 *
 */
public class TemperaturSensor extends Sensor {

	/**
	 * Konstruktor fuer neue Exemplare der Klasse TemperaturSensor.
	 * 
	 * @param kalibrierfaktor
	 */
	public TemperaturSensor(double kalibrierfaktor) {
		super(kalibrierfaktor);
	}

	@Override
	protected double rechneUm(double messwert) {
		return messwert - 273.15;
	}

}
