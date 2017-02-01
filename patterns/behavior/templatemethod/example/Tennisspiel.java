package patterns.behavior.templatemethod.example;

/**
 * @author Christian Bargmann <christian.bargmann@haw-hamburg.de>
 * @version 01.02.2017
 * @see patterns.behavior.templatemethod.example
 * @since 01.02.2017 , 20:25:13
 *
 */
public class Tennisspiel extends Spiel {

	/**
	 * Ueberschreiben der Methode initiiere in der Klasse Tennisspiel. Fuer
	 * Details zur Implementierung siehe:
	 * 
	 * @see patterns.behavior.templatemethod.example.Spiel#initiiere()
	 */
	@Override
	void initiiere() {
		System.out.println("Tennisspiel wird vorbereitet.");

	}

	/**
	 * Ueberschreiben der Methode starteSpiel in der Klasse Tennisspiel. Fuer
	 * Details zur Implementierung siehe:
	 * 
	 * @see patterns.behavior.templatemethod.example.Spiel#starteSpiel()
	 */
	@Override
	void starteSpiel() {
		System.out.println("Tennisspiel wird gestartet.");

	}

	/**
	 * Ueberschreiben der Methode beendeSpiel in der Klasse Tennisspiel. Fuer
	 * Details zur Implementierung siehe:
	 * 
	 * @see patterns.behavior.templatemethod.example.Spiel#beendeSpiel()
	 */
	@Override
	void beendeSpiel() {
		System.out.println("Tennisspiel wird beendet.");

	}

}
