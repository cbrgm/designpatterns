package patterns.structural.composite.example;

/**
 * @author Christian Bargmann <christian.bargmann@haw-hamburg.de>
 * @version 01.02.2017
 * @see patterns.structural.composite.example
 * @since 01.02.2017 , 19:45:09
 *
 */
public class Blatt extends Knoten {

	/**
	 * Konstruktor fuer neue Exemplare der Klasse Blatt.
	 * 
	 * @param name
	 */
	public Blatt(String name) {
		super(name);
	}

	/**
	 * Ueberschreiben der Methode operation in der Klasse Blatt. Fuer Details
	 * zur Implementierung siehe:
	 * 
	 * @see patterns.structural.composite.example.Knoten#operation()
	 */
	@Override
	public void operation() {
		// Berechnen des Leerzeichens des FormatStrings fuer die Ausgabe von
		// Leerzeichen entprechend der erreichten Ebene.
		String formatString = "%" + (_ebene * 2) + "s";

		// Ausgabe der Leerzeichen
		System.out.printf(formatString, "");

		// Ausgabe eines Minuszeichens gefolgt vom Namen des Knotens
		System.out.println(" - " + super.gibName());

	}

}
