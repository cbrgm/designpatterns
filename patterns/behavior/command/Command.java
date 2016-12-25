package patterns.behavior.command;

/**
 * Interface fuer Command-Befehle, die bestimmte Aktionen bei Emfpaengern
 * (Receiver) ausloesen.
 * 
 * @author Christian Bargmann <christian.bargmann@haw-hamburg.de>
 * @version 25.12.2016
 * @see patterns.behavior.command
 * @since 25.12.2016 , 22:52:01
 *
 */
public interface Command {

	/**
	 * Fuehrt beim aufzurufenden Clienten (Receiver) eine bestimmte aktion
	 * durch.
	 */
	public void execute();

}
