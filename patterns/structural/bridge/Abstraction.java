package patterns.structural.bridge;

/**
 * @author Christian Bargmann <christian.bargmann@haw-hamburg.de>
 * @version 02.02.2017
 * @see patterns.structural.bridge
 * @since 02.02.2017 , 13:45:12
 *
 */
public class Abstraction {

	// Interface implementiert die jeweilige Implementation
	AbstractionImpl _implementation;

	public Abstraction(AbstractionImpl impl) {
		_implementation = impl;
	}

	/**
	 * Verhalten der Methode wird definiert von der Implementation
	 */
	public void operation() {
		// ...
		_implementation.operationImpl();
		// ...
	}

}
