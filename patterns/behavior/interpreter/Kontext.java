package patterns.behavior.interpreter;

import java.util.HashMap;

/**
 * Der Kontext versorgt die Ausdruecke mit allem was der Ausdruck selber nicht
 * beinhaltet (alles was von aussen kommt). In dem Beispiel sind das die Inhalte
 * der Variablen, die in dem Ausdruck vorkommen.
 * 
 * @author Christian Bargmann <christian.bargmann@haw-hamburg.de>
 * @version 03.02.2017
 * @see patterns.behavior.interpreter
 * @since 03.02.2017 , 18:54:06
 *
 */
public class Kontext {

	private HashMap<String, String> variablen;

	public Kontext() {
		variablen = new HashMap<String, String>();
	}

	public HashMap<String, String> getVariablen() {
		return variablen;
	}

}
