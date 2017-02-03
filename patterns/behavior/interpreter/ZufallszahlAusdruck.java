package patterns.behavior.interpreter;

/**
 * @author Christian Bargmann <christian.bargmann@haw-hamburg.de>
 * @version 03.02.2017
 * @see patterns.behavior.interpreter
 * @since 03.02.2017 , 19:12:03
 *
 */
public class ZufallszahlAusdruck extends TestdatenAusdruck {

	/**
	 * Ueberschreiben der Methode interpretiere in der Klasse
	 * ZufallszahlAusdruck. Fuer Details zur Implementierung siehe:
	 * 
	 * @see patterns.behavior.interpreter.TestdatenAusdruck#interpretiere(patterns.behavior.interpreter.Kontext)
	 */
	@Override
	public String interpretiere(Kontext kontext) {
		int zufallszahl = (int) (Math.random() * 10);
		return Integer.toString(zufallszahl);
	}

}
