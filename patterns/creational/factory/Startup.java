package patterns.creational.factory;

/**
 * @author Christian Bargmann <christian.bargmann@haw-hamburg.de>
 * @version 07.12.2016
 * @see factorypattern
 * @since 07.12.2016 , 23:53:00
 *
 */
public class Startup {
	/**
	 * Aufruf des Factory-Patterns durch den Clienten
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		// Fabrik 1
		Creator factoryA = new ConcreteCreatorA();
		Product productA = factoryA.createProduct();
		productA.getPrice(); // "10"

		// Fabrik 2
		Creator factoryB = new ConcreteCreatorB();
		Product productB = factoryB.createProduct();
		productB.prepare(); // "20"

	}

}
