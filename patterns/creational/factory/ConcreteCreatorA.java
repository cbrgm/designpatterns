package patterns.creational.factory;

/**
 * @author Christian Bargmann <christian.bargmann@haw-hamburg.de>
 * @version 07.12.2016
 * @see factorypattern
 * @since 07.12.2016 , 23:44:39
 *
 */
public class ConcreteCreatorA extends Creator {

	/**
	 * Ueberschreiben der Methode factoryMethod in der Klasse ConcreteCreator.
	 * Definiert konkret, welches Product zurueckgeliefert werden soll.
	 * 
	 * @see abstraction.Creator#factoryMethod()
	 */
	@Override
	protected Product factoryMethod() {
		Product concreteProduct = new ConcreteProductA();
		return concreteProduct;
	}

}
