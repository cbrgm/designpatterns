package patterns.behavior.strategy;

/**
 * @author Christian Bargmann <christian.bargmann@haw-hamburg.de>
 * @version 29.01.2017
 * @see patterns.behavior.strategy
 * @since 29.01.2017 , 17:51:11
 *
 */
public class ConcreteStrategyA1 implements StrategyA {

	/**
	 * Ueberschreiben der Methode execute in der Klasse ConcreteStrategyA1. Fuer
	 * Details zur Implementierung siehe:
	 * 
	 * @see patterns.behavior.strategy.StrategyA#execute()
	 */
	@Override
	public void execute() {
		System.out.println(this.getClass().getSimpleName() + " execute Strategy!");

	}

}
