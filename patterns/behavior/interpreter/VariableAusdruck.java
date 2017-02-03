package patterns.behavior.interpreter;

/**
 * TerminalAusdruck. Die Interpretiere Methode besteht aus einem einfachen
 * Lookup und gibt den Variableninhalt zurueck oder liefert ERROR, falls die
 * Variable im Kontext gar nicht zu finden ist.
 * 
 * @author Christian Bargmann <christian.bargmann@haw-hamburg.de>
 * @version 03.02.2017
 * @see patterns.behavior.interpreter
 * @since 03.02.2017 , 19:08:02
 *
 */
public class VariableAusdruck extends TestdatenAusdruck {

	private String variable;

	/**
	 * Konstruktor fuer neue Exemplare der Klasse VariableAusdruck.
	 */
	public VariableAusdruck(String variable) {
		this.variable = variable;
	}

	/**
	 * Ueberschreiben der Methode interpretiere in der Klasse VariableAusdruck.
	 * Fuer Details zur Implementierung siehe:
	 * 
	 * @see patterns.behavior.interpreter.TestdatenAusdruck#interpretiere(patterns.behavior.interpreter.Kontext)
	 */
	@Override
	public String interpretiere(Kontext kontext) {
		if (kontext.getVariablen().containsKey(variable)) {
			return kontext.getVariablen().get(kontext);
		} else {
			return "ERROR";
		}
	}

}
