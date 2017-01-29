package patterns.behavior.strategy;

/**
 * @author Christian Bargmann <christian.bargmann@haw-hamburg.de>
 * @version 29.01.2017
 * @see patterns.behavior.strategy
 * @since 29.01.2017 , 17:54:26
 *
 */
public class Context {

	StrategyA behaviorA;
	StrategyB behaviorB;

	public Context() {
		behaviorA = new ConcreteStrategyA1();
		behaviorB = new ConcreteStrategyB1();
	}

	/**
	 * Setter-Methode zu behaviorA. Ermöglicht es dem Klienten, den Wert der
	 * Exemplarvariablen behaviorA zu setzen.
	 *
	 * @param behaviorA
	 *            the behaviorA to set
	 */
	public void setBehaviorA(StrategyA behaviorA) {
		assert behaviorA != null : "Vorbedingung verletzt: behaviorA != null!";

		this.behaviorA = behaviorA;
	}

	/**
	 * Setter-Methode zu behaviorB. Ermöglicht es dem Klienten, den Wert der
	 * Exemplarvariablen behaviorB zu setzen.
	 *
	 * @param behaviorB
	 *            the behaviorB to set
	 */
	public void setBehaviorB(StrategyB behaviorB) {
		assert behaviorB != null : "Vorbedingung verletzt: behaviorB != null!";

		this.behaviorB = behaviorB;
	}

	/**
	 * Fuehrt ein Verhalten aus.
	 */
	public void executeA() {
		behaviorA.execute();
	}

	/**
	 * Fuehrt ein Verhalten aus.
	 */
	public void executeB() {
		behaviorB.execute();
	}
}
