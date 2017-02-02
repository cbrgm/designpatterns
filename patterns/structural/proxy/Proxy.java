package patterns.structural.proxy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Christian Bargmann <christian.bargmann@haw-hamburg.de>
 * @version 02.02.2017
 * @see patterns.structural.proxy
 * @since 02.02.2017 , 15:30:22
 *
 */
public class Proxy implements Subject {

	private Subject _subject;

	// Logging von Methodenausfuehrungen
	private static List<String> logger = new ArrayList<String>();

	// Beispiel Begrenzung von Ausfuerhungen
	private final int MAX_OPERATIONS_AMOUNT = 3;
	private int _operationsCounter = 0;

	public Proxy(Subject subject) {
		_subject = subject;
	}

	/**
	 * Ueberschreiben der Methode operation in der Klasse Proxy. Fuer Details
	 * zur Implementierung siehe:
	 * 
	 * @see patterns.structural.proxy.Subject#operation()
	 */
	@Override
	public void operation() {
		if (_operationsCounter < MAX_OPERATIONS_AMOUNT) {

			_subject.operation();
			logger.add(System.currentTimeMillis() + " Operation wurde ausgefuehrt und geloggt.");
			_operationsCounter++;

		} else {
			System.out.println("Nicht moeglich");
		}
	}

	public void printLog() {
		for (String s : logger) {
			System.out.println(s);
		}
	}

}
