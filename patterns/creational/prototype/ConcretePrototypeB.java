package patterns.creational.prototype;

/**
 * @author Christian Bargmann <christian.bargmann@haw-hamburg.de>
 * @version 08.12.2016
 * @see abstraction
 * @since 08.12.2016 , 02:48:22
 *
 */
public class ConcretePrototypeB implements Prototype {

	String _attribute;

	/**
	 * Konstruktor fuer neue Exemplare der Klasse ConcretePrototypeA.
	 * 
	 * @param attribute
	 */
	public ConcretePrototypeB(String attribute) {
		_attribute = attribute;
	}

	/**
	 * Konstruktor fuer neue Exemplare der Klasse ConcretePrototypeA.
	 * 
	 * @param attribute
	 */
	public ConcretePrototypeB() {
		super();
	}

	/**
	 * Getter-Methode zu _attribute. Ermöglicht es einem Klienten, den Wert der
	 * Exemplarvariablen _attribute abzufragen.
	 *
	 * @return the _attribute
	 */
	public String get_attribute() {
		return _attribute;
	}

	/**
	 * Ueberschreiben der Methode clone in der Klasse ConcretePrototypeA. Fuer
	 * Details zur Implementierung siehe:
	 * 
	 * @see java.lang.Object#clone()
	 */
	@Override
	public ConcretePrototypeB clone() throws CloneNotSupportedException {
		return (ConcretePrototypeB) super.clone();

	}

}
