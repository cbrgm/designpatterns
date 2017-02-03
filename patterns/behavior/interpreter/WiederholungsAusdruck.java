package patterns.behavior.interpreter;

/**
 * NichtTerminalAusdruck. Die Klasse selbst muss wissen, wie oft sie einen
 * Ausdruck wiederholen soll und welcher Ausdruck das sein soll. Beide
 * Informationen erhaelt sie im Konstruktor. Die Interpretieren-Methode
 * durchläuft dann die gewünschte Anzahl und ruft die interpretier Methode des
 * Ausdrucks entsprechend oft auf.
 * 
 * @author Christian Bargmann <christian.bargmann@haw-hamburg.de>
 * @version 03.02.2017
 * @see patterns.behavior.interpreter
 * @since 03.02.2017 , 19:14:15
 *
 */
public class WiederholungsAusdruck extends TestdatenAusdruck {

	TestdatenAusdruck ausdruck;
	int anzahlWiederholungen;

	/**
	 * 
	 * Konstruktor fuer neue Exemplare der Klasse WiederholungsAusdruck.
	 * 
	 * @param ausdruck
	 * @param anzahlWiederholungen
	 */
	public WiederholungsAusdruck(TestdatenAusdruck ausdruck, int anzahlWiederholungen) {
		this.ausdruck = ausdruck;
		this.anzahlWiederholungen = anzahlWiederholungen;
	}

	/**
	 * Ueberschreiben der Methode interpretiere in der Klasse
	 * WiederholungsAusdruck. Fuer Details zur Implementierung siehe:
	 * 
	 * @see patterns.behavior.interpreter.TestdatenAusdruck#interpretiere(patterns.behavior.interpreter.Kontext)
	 */
	@Override
	public String interpretiere(Kontext kontext) {

		StringBuilder stringBuilder = new StringBuilder();
		for (int i = 0; i < anzahlWiederholungen; i++) {
			stringBuilder.append(ausdruck.interpretiere(kontext));
		}
		return stringBuilder.toString();
	}

}
