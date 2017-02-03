package patterns.behavior.interpreter;

import java.util.ArrayList;
import java.util.List;

/**
 * Die Grammatik der Testdatensprache erlaubt es, dass Ausdruecke beliebig oft
 * aneinandergereiht werden. Aus dem grund erstellen wir einen weiteren
 * Nichtterminalausdruck, der die hintereinander gereihten Ausdruecke aufnimmt.
 * 
 * @author Christian Bargmann <christian.bargmann@haw-hamburg.de>
 * @version 03.02.2017
 * @see patterns.behavior.interpreter
 * @since 03.02.2017 , 19:20:28
 *
 */
public class ZusammengesetzterAusdruck extends TestdatenAusdruck {

	private List<TestdatenAusdruck> ausdruecke;

	/**
	 * Konstruktor fuer neue Exemplare der Klasse ZusammengesetzterAusdruck.
	 */
	public ZusammengesetzterAusdruck() {
		ausdruecke = new ArrayList<TestdatenAusdruck>();
	}

	public void ausdruckHinzufuegen(TestdatenAusdruck ausdruck) {
		ausdruecke.add(ausdruck);
	}

	public List<TestdatenAusdruck> getAusdruecke() {
		return ausdruecke;
	}

	/**
	 * Ueberschreiben der Methode interpretiere in der Klasse TestdatenAusdruck.
	 * Fuer Details zur Implementierung siehe:
	 * 
	 * @see patterns.behavior.interpreter.TestdatenAusdruck#interpretiere(patterns.behavior.interpreter.Kontext)
	 */
	@Override
	public String interpretiere(Kontext kontext) {
		StringBuilder stringBuilder = new StringBuilder();
		for (TestdatenAusdruck ausdruck : ausdruecke) {
			stringBuilder.append(ausdruck.interpretiere(kontext));
		}
		return stringBuilder.toString();
	}

}
