package patterns.behavior.mediator;

/**
 * @author Christian Bargmann <christian.bargmann@haw-hamburg.de>
 * @version 01.02.2017
 * @see patterns.behavior.mediator
 * @since 01.02.2017 , 22:19:30
 *
 */
public abstract class Colleague {

	private Mediator _mediator;

	/**
	 * Konstruktor fuer neue Exemplare der Klasse Colleague. Setzt den Mediator
	 * fuer den Kollegen.
	 * 
	 * @param m
	 */
	public Colleague(Mediator m) {
		_mediator = m;
	}

	/**
	 * Sendet eine Nachricht ueber den Mediator.
	 * 
	 * @param message
	 */
	public void send(String message) {
		_mediator.send(message, this);
	}

	/**
	 * Liefert die Referenz auf den Mediator zurueck.
	 * 
	 * @return
	 */
	public Mediator getMediator() {
		return _mediator;
	}

	/**
	 * Abstrakte Methode fuer das Empfangen von Nachrichten. Implementation folgt in den abgeleiteten Klassen von Colleague.
	 * @param message
	 * @return 
	 */
	public abstract void receive(String message);

}
