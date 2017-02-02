package patterns.structural.flyweight.example;

/**
 * Flyweight
 * 
 * @author Christian Bargmann <christian.bargmann@haw-hamburg.de>
 * @version 02.02.2017
 * @see patterns.structural.flyweight.example
 * @since 02.02.2017 , 14:41:58
 *
 */
public abstract class Sensor {

	private double _kalibrierFaktor;

	public Sensor(double kalibrierfaktor) {
		_kalibrierFaktor = kalibrierfaktor;
	}

	public void schreibe(double messwert) {
		// Messwert entspricht den entrinsischen Daten
		double kalibrierterWert = messwert * _kalibrierFaktor;
		double umgerechneterWert = rechneUm(kalibrierterWert);

		// Schreibe in Datenbank o.a.
		// ...
		System.out.println(this.getClass().getSimpleName() + ", Schreibe in die Datenbank: " + umgerechneterWert);
	}

	protected double rechneUm(double messwert) {
		return messwert;
	}

}
