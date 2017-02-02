package patterns.behavior.chainofresponsibility.example;

/**
 * Bearbeiter
 * 
 * @author Christian Bargmann <christian.bargmann@haw-hamburg.de>
 * @version 02.02.2017
 * @see patterns.behavior.chainofresponsibility
 * @since 02.02.2017 , 16:06:58
 *
 */
public interface Command {

	/**
	 * Prueft, ob das aktuelle Commando-Objekt das uebergebene Kommando (als
	 * String) unterstuetzt. Ist dies der Fall wird das Kommando ausgefuehrt und
	 * die Bearbeterkette wird unterbrochen. Kennt das aktuelle Command-Objekt
	 * das Kommando nicht, wird geprueft, ob es einen Nachfolger in der
	 * verketteten Liste gibt, und die Anfrage dorthin weitergeleitet.
	 * 
	 * @param commandText
	 */
	public void processCommand(String commandText);

	/**
	 * Setzt den Nachfolger des aktuellen Commando-Objektes in der
	 * Bearbeitungskette.
	 * 
	 * @param nextCommand
	 */
	public void nextCommand(Command nextCommand);

}
