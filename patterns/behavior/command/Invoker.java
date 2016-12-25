package patterns.behavior.command;

/**
 * Diese Klasse stellt einen Aufrufer da. Ein Aufrufer besitzt Commandos, die er
 * ausfuehren kann. Durch die Kommandos werden anschließend bestimmte Aktionen
 * in den Emfpaengerklassen (Receiver) ausgeloest.
 * 
 * @author Christian Bargmann <christian.bargmann@haw-hamburg.de>
 * @version 25.12.2016
 * @see patterns.behavior.command
 * @since 25.12.2016 , 23:01:05
 *
 */
public class Invoker {

	private Command befehl1;
	private Command befehl2;
	private Command befehl3;

	/**
	 * Fuehrt den ersten Befehl aus.
	 */
	public void doCommand1() {
		befehl1.execute();
	}

	/**
	 * Fuehrt den zweiten Befehl aus.
	 */
	public void doCommand2() {
		befehl2.execute();
	}

	/**
	 * Fuehrt den dritten Befehl aus.
	 */
	public void doCommand3() {
		befehl2.execute();
	}

	/**
	 * Setter-Methode. Ermöglicht es einem Clienten wie z.B. einem
	 * Kommandofenster das setzen von auszufuehrenden Befehlen.
	 * 
	 * @param befehl
	 */
	public void setCommand1(Command befehl) {
		befehl1 = befehl;
	}

	/**
	 * Setter-Methode. Ermöglicht es einem Clienten wie z.B. einem
	 * Kommandofenster das setzen von auszufuehrenden Befehlen.
	 * 
	 * @param befeh2
	 */
	public void setCommand2(Command befeh2) {
		befehl2 = befeh2;
	}

	/**
	 * Setter-Methode. Ermöglicht es einem Clienten wie z.B. einem
	 * Kommandofenster das setzen von auszufuehrenden Befehlen.
	 * 
	 * @param befeh3
	 */
	public void setCommand3(Command befeh3) {
		befehl3 = befeh3;
	}
}
