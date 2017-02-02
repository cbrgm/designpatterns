package patterns.behavior.chainofresponsibility.example;

/**
 * @author Christian Bargmann <christian.bargmann@haw-hamburg.de>
 * @version 02.02.2017
 * @see patterns.behavior.chainofresponsibility
 * @since 02.02.2017 , 16:18:24
 *
 */
public class Devenv {

	Command _firstEngine;

	/**
	 * Konstruktor fuer neue Exemplare der Klasse Devenv. Baut die
	 * Bearbeiterkette auf.
	 */
	public Devenv() {
		_firstEngine = new BuildEngine();
		DebugEngine debugEngine = new DebugEngine();

		_firstEngine.nextCommand(debugEngine);
	}

	/**
	 * Verarbeitet ein Kommando.
	 * 
	 * @param commandText
	 */
	public void CommandInputHandler(String commandText) {
		_firstEngine.processCommand(commandText);
	}

}
