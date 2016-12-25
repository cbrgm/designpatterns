package patterns.creational.factory;

/**
 * @author Christian Bargmann <christian.bargmann@haw-hamburg.de>
 * @version 07.12.2016
 * @see factorypattern
 * @since 07.12.2016 , 23:38:04
 *
 */
public abstract class Creator {

	public Product createProduct() {
		// holt konkretes Product, weiß nicht welches.
		Product product = factoryMethod();

		// allgemeiner Programmübergreifender Code für Produkte
		return product;
	}

	protected abstract Product factoryMethod();

}
