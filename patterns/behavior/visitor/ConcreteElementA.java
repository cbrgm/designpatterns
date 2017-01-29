package patterns.behavior.visitor;

/**
 * @author Christian Bargmann <christian.bargmann@haw-hamburg.de>
 * @version 29.01.2017
 * @see patterns.behavior.visitor
 * @since 29.01.2017 , 18:11:23
 *
 */
public class ConcreteElementA implements Element {

	/**
	 * Ueberschreiben der Methode accept in der Klasse Element. Fuer Details zur
	 * Implementierung siehe:
	 * 
	 * @see patterns.behavior.visitor.Element#accept(patterns.behavior.visitor.Visitor)
	 */
	@Override
	public void accept(Visitor visitor) {
		visitor.visitElement(this);

	}

}
