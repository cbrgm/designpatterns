package patterns.creational.abstractfactory;

/**
 * @author Christian Bargmann <christian.bargmann@haw-hamburg.de>
 * @version 08.12.2016
 * @see startup
 * @since 08.12.2016 , 00:34:58
 *
 */
public class Startup {

	/**
	 * Beispielnutzung durch den Clienten
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		AbstractFactory generator = new ConcreteFactoryA();

		// Erstellung der Objekte ueber einen Generator.
		Product1 concreteProduct1 = generator.createProduct1();
		Product2 concreteProduct2 = generator.createProduct2();
		Product3 concreteProduct3 = generator.createProduct3();
		// ...
	}

}
