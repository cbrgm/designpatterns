package patterns.structural.bridge;

/**
 * @author Christian Bargmann <christian.bargmann@haw-hamburg.de>
 * @version 02.02.2017
 * @see patterns.structural.bridge
 * @since 02.02.2017 , 13:50:05
 *
 */
public class SpecialAbstraction extends Abstraction {

	/**
	 * Konstruktor fuer neue Exemplare der Klasse SpecialAbstraction.
	 * @param impl
	 */
	public SpecialAbstraction(AbstractionImpl impl) {
		super(impl);
	}

	/**
	 * Erweiterung der Schnittstelle durch Spezialisierung von Abstraction.
	 * 
	 * @param value
	 */
	public void loopOperation(int value) {
		for (int i = 0; i < value; i++) {
			_implementation.operationImpl();
		}
	}

}
