package patterns.behavior.mediator;

/**
 * @author Christian Bargmann <christian.bargmann@haw-hamburg.de>
 * @version 01.02.2017
 * @see patterns.behavior.mediator
 * @since 01.02.2017 , 22:31:19
 *
 */
public class ConcreteColleagueB extends Colleague {

	/**
	 * Konstruktor fuer neue Exemplare der Klasse ConcreteColleagueA.
	 * 
	 * @param m
	 */
	public ConcreteColleagueB(Mediator m) {
		super(m);
	}

	/**
	 * Ueberschreiben der Methode receive in der Klasse Colleague. Fuer Details
	 * zur Implementierung siehe:
	 * 
	 * @see patterns.behavior.mediator.Colleague#receive(java.lang.String)
	 */
	@Override
	public void receive(String message) {
		System.out.println(this.getClass().getSimpleName() + " hat die Nachricht erhalten: " + message);
	}

}
