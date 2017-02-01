package patterns.behavior.templatemethod;

/**
 * @author Christian Bargmann <christian.bargmann@haw-hamburg.de>
 * @version 01.02.2017
 * @see patterns.behavior.templatemethod
 * @since 01.02.2017 , 20:14:52
 *
 */
public abstract class AbstractClass {

	/**
	 * Schnittstelle der Abstrakten Klasse nach aussen. Ueber diese Methode
	 * greift der Client auf die Funktionen der Klasse zu, die konkreten
	 * Instanziierungen definieren die Funktionsweise des Algorithmuses.
	 */
	public void templateMethod() {
		this.concreteAlgorithm1();
		this.concreteAlgorithm2();
	}

	/**
	 * Algorithmus, zu implementieren von den ConcreteClasses
	 */
	protected abstract void concreteAlgorithm1();

	/**
	 * Algorithmus, zu implementieren von den ConcreteClasses
	 */
	protected abstract void concreteAlgorithm2();

}
