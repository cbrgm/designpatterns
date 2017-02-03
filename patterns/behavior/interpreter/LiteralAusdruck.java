package patterns.behavior.interpreter;

/**
 * Terminalausdruck. Ein Terminalausdruck ist dieser Ausdruck deshalb, weil er
 * selbst keine weiteren Ausdruecke mehr beinhaltet. Der Ast eines Syntaxbaums
 * endet also, wenn ein solcher Ausdruck vorkommt.
 * 
 * @author Christian Bargmann <christian.bargmann@haw-hamburg.de>
 * @version 03.02.2017
 * @see patterns.behavior.interpreter
 * @since 03.02.2017 , 18:59:49
 *
 */
public class LiteralAusdruck extends TestdatenAusdruck {

	private String literal;

	/**
	 * Konstruktor fuer neue Exemplare der Klasse LiteralAusdruck.
	 */
	public LiteralAusdruck(String literal) {
		this.literal = literal;
	}

	/**
	 * Ueberschreiben der Methode interpretiere in der Klasse TestdatenAusdruck.
	 * Fuer Details zur Implementierung siehe:
	 * 
	 * @see patterns.behavior.interpreter.TestdatenAusdruck#interpretiere(patterns.behavior.interpreter.Kontext)
	 */
	@Override
	public String interpretiere(Kontext kontext) {
		return literal;
	}

}
