package patterns.behavior.command;

/**
 * @author Christian Bargmann <christian.bargmann@haw-hamburg.de>
 * @version 25.12.2016
 * @see patterns.behavior.command
 * @since 25.12.2016 , 22:54:54
 *
 */
public class ConcreteCommandA implements Command {

	private ReceiverA empfaengerA;

	/**
	 * Konstruktor fuer neue Exemplare der Klasse ConcreteCommandA.
	 */
	public ConcreteCommandA(ReceiverA empfaengerA) {
		this.empfaengerA = empfaengerA;
	}

	/**
	 * Ueberschreiben der Methode execute in der Klasse ConcreteCommandA. Fuer
	 * Details zur Implementierung siehe:
	 * 
	 * @see patterns.behavior.command.Command#execute()
	 */
	@Override
	public void execute() {
		empfaengerA.doAction1();
		empfaengerA.doAction2();
		empfaengerA.doAction3();

	}

}
