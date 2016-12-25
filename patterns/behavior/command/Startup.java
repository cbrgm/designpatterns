package patterns.behavior.command;

/**
 * @author Christian Bargmann <christian.bargmann@haw-hamburg.de>
 * @version 25.12.2016
 * @see patterns.behavior.command
 * @since 25.12.2016 , 22:30:19
 *
 */
public class Startup {

	/**
	 * Beispielmethode fuer die Benutzung durch den Clienten
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Invoker aufrufer = new Invoker();
		ReceiverA empfaengerA = new ReceiverA();
		ReceiverB empfaengerB = new ReceiverB();

		// Befehle hinzufuegen
		aufrufer.setCommand1(new ConcreteCommandA(empfaengerA));
		aufrufer.setCommand2(new ConcreteCommandB(empfaengerB));
		aufrufer.setCommand3(new ConcreteCommandB(empfaengerB));

		// Befehle ausfuehren
		aufrufer.doCommand1();
		aufrufer.doCommand2();

	}

}
