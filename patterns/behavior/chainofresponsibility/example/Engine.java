package patterns.behavior.chainofresponsibility.example;

import java.util.List;

/**
 * Basisklasse fuer alle Engines.
 * 
 * @author Christian Bargmann <christian.bargmann@haw-hamburg.de>
 * @version 02.02.2017
 * @see patterns.behavior.chainofresponsibility
 * @since 02.02.2017 , 16:08:00
 *
 */
public abstract class Engine implements Command {

	private Command _nextCommand;

	abstract protected List<String> getSupportedCommands();

	abstract protected void executeCommand(String Command);

	public void processCommand(String commandText) {
		if (getSupportedCommands().contains(commandText)) {
			executeCommand(commandText);
		} else if (_nextCommand != null) {
			_nextCommand.processCommand(commandText);
		}
	}

	public void nextCommand(Command nextCommand) {
		this._nextCommand = nextCommand;
	}

}
