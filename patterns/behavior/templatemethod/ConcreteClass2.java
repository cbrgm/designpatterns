package patterns.behavior.templatemethod;

/**
 * @author Christian Bargmann <christian.bargmann@haw-hamburg.de>
 * @version 01.02.2017
 * @see patterns.behavior.templatemethod
 * @since 01.02.2017 , 20:18:28
 *
 */
public class ConcreteClass2 extends AbstractClass {

	/**
	 * Ueberschreiben der Methode concreteAlgorithm1 in der Klasse
	 * ConcreteClass1. Fuer Details zur Implementierung siehe:
	 * 
	 * @see patterns.behavior.templatemethod.AbstractClass#concreteAlgorithm1()
	 */
	@Override
	protected void concreteAlgorithm1() {
		for (int i = 0; i < 5; i++) {
			System.out.println(
					"Iteration Nummer 1 : " + "Ausfuehrung von Algorithmus 1 in " + this.getClass().getSimpleName());
		}

	}

	/**
	 * Ueberschreiben der Methode concreteAlgorithm2 in der Klasse
	 * ConcreteClass1. Fuer Details zur Implementierung siehe:
	 * 
	 * @see patterns.behavior.templatemethod.AbstractClass#concreteAlgorithm2()
	 */
	@Override
	protected void concreteAlgorithm2() {
		System.out.println("Ausfuehrung von Algorithmus 2 in " + this.getClass().getSimpleName());

	}

}
