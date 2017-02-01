package patterns.behavior.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Christian Bargmann <christian.bargmann@haw-hamburg.de>
 * @version 01.02.2017
 * @see patterns.behavior.mediator
 * @since 01.02.2017 , 22:24:32
 *
 */
public class ConcreteMediator implements Mediator {

	private List<Colleague> _colleagues;

	/**
	 * Konstruktor fuer neue Exemplare der Klasse ConcreteMediator.
	 */
	public ConcreteMediator() {
		_colleagues = new ArrayList<Colleague>();
	}

	public void addColleague(Colleague colleague) {
		_colleagues.add(colleague);
	}

	/**
	 * Ueberschreiben der Methode send in der Klasse ConcreteMediator. Fuer
	 * Details zur Implementierung siehe:
	 * 
	 * @see patterns.behavior.mediator.Mediator#send(java.lang.String,
	 *      patterns.behavior.mediator.Colleague)
	 */
	@Override
	public void send(String message, Colleague originator) {
		// Laesst alle Kollegen die vom Mediator versorgt werden ueber Aenderung
		// informieren.

		for (Colleague colleague : _colleagues) {

			// Wir selber sollen nicht informiert werden.
			if (!colleague.equals(originator)) {
				colleague.receive(message);
			}
		}

	}

}
