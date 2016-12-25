package patterns.creational.factory;

/**
 * @author Christian Bargmann <christian.bargmann@haw-hamburg.de>
 * @version 07.12.2016
 * @see factorypattern
 * @since 07.12.2016 , 23:40:23
 *
 */
public abstract class Product {

	private int basisState;

	/**
	 * Beispielmethode die fuer alle Produkte gilt.
	 */
	public void prepare() {
		System.out.println("Grundeigenschaften oder Methodenaufrufe, die bei jedem Produkt durchlaufen werden müssen");
	}

	/**
	 * Setter-Methode fuer einen Zustand im Product.
	 * 
	 * @param state
	 */
	public void setState(int state) {
		this.basisState = state;
	}

	/**
	 * Getter-Methode fuer einen Zustand im Product.
	 * 
	 * @return
	 */
	public int getState() {
		return basisState;
	}

	/**
	 * Abstrakte Methode, wie der Preis berechnet wird.
	 * 
	 * @return
	 */
	public abstract int getPrice();
	// further code
}
