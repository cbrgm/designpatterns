package patterns.behavior.chainofresponsibility;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Christian Bargmann <christian.bargmann@haw-hamburg.de>
 * @version 02.02.2017
 * @see patterns.behavior.chainofresponsibility
 * @since 02.02.2017 , 16:38:39
 *
 */
public class ConcreteHandler2 implements Handler {

	private List<String> _commands = new ArrayList<String>();
	private Handler _predecessor;

	/**
	 * Konstruktor fuer neue Exemplare der Klasse ConcreteHandler1.
	 */
	public ConcreteHandler2() {
		_commands.add("my");
		_commands.add("friend");
	}

	/**
	 * Ueberschreiben der Methode handleRequest in der Klasse ConcreteHandler1.
	 * Fuer Details zur Implementierung siehe:
	 * 
	 * @see patterns.behavior.chainofresponsibility.Handler#handleRequest()
	 */
	@Override
	public void handleRequest(String request) {
		if (_commands.contains(request)) {
			execute(request);
		} else if (_predecessor != null) {
			_predecessor.handleRequest(request);
		}

	}

	/**
	 * Ueberschreiben der Methode setNextHandler in der Klasse ConcreteHandler1.
	 * Fuer Details zur Implementierung siehe:
	 * 
	 * @see patterns.behavior.chainofresponsibility.Handler#setNextHandler()
	 */
	@Override
	public void setNextHandler(Handler handler) {
		_predecessor = handler;

	}

	/**
	 * Beinhaltet den spezifischen Code fuer die Ausfuerhung des jeweiligen
	 * Komandos. Kann bei mehreren Befehlen z.B. mit einer Switch-Anweisung
	 * geloest werden.
	 * 
	 * @param request
	 */
	private void execute(String request) {
		System.out.println(this.getClass().getSimpleName() + " Executing Command: " + request);
	}

}
