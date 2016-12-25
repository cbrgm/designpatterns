package patterns.behavior.command;

/**
 * @author Christian Bargmann <christian.bargmann@haw-hamburg.de>
 * @version 25.12.2016
 * @see patterns.behavior.command
 * @since 25.12.2016 , 22:54:54
 *
 */
public class ConcreteCommandB implements Command {

	private ReceiverB emfpaengerB;

	/**
	 * Konstruktor fuer neue Exemplare der Klasse ConcreteCommandA.
	 */
	public ConcreteCommandB(ReceiverB empfaengerB) {
		this.emfpaengerB = empfaengerB;
	}

	/**
	 * Ueberschreiben der Methode execute in der Klasse ConcreteCommandA. Fuer
	 * Details zur Implementierung siehe:
	 * 
	 * @see patterns.behavior.command.Command#execute()
	 */
	@Override
	public void execute() {
		emfpaengerB.doAction1();
		emfpaengerB.doAction2();
		emfpaengerB.doAction3();

	}

}
