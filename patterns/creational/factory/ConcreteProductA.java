package patterns.creational.factory;

/**
 * @author Christian Bargmann <christian.bargmann@haw-hamburg.de>
 * @version 07.12.2016
 * @see factorypattern
 * @since 07.12.2016 , 23:48:54
 *
 */
public class ConcreteProductA extends Product {

	/**
	 * Ueberschreiben der Methode getPrice in der Klasse ConcreteProductA.
	 * Konkrete Implementation eines Products. Hier werden die Methodenruempfe
	 * gefuellt.
	 * 
	 * @see abstraction.Product#getPrice()
	 */
	@Override
	public int getPrice() {
		return 10;
	}

}
