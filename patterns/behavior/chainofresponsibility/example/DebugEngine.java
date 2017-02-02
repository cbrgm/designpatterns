package patterns.behavior.chainofresponsibility.example;

import java.util.Arrays;
import java.util.List;

/**
 * Konkreter Bearbeiter
 * 
 * @author Christian Bargmann <christian.bargmann@haw-hamburg.de>
 * @version 02.02.2017
 * @see patterns.behavior.chainofresponsibility
 * @since 02.02.2017 , 16:14:32
 *
 */
public class DebugEngine extends Engine {

	/**
	 * Ueberschreiben der Methode getSupportedCommands in der Klasse
	 * BuildEngine. Fuer Details zur Implementierung siehe:
	 * 
	 * @see patterns.behavior.chainofresponsibility.example.Engine#getSupportedCommands()
	 */
	@Override
	protected List<String> getSupportedCommands() {
		return Arrays.asList("debug", "console");
	}

	/**
	 * Ueberschreiben der Methode executeCommand in der Klasse BuildEngine. Fuer
	 * Details zur Implementierung siehe:
	 * 
	 * @see patterns.behavior.chainofresponsibility.example.Engine#executeCommand(java.lang.String)
	 */
	@Override
	protected void executeCommand(String Command) {
		System.out.println(this.getClass().getSimpleName() + " Command executed : " + Command);

	}

}
