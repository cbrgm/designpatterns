package patterns.behavior.visitor;

/**
 * @author Christian Bargmann <christian.bargmann@haw-hamburg.de>
 * @version 29.01.2017
 * @see patterns.behavior.visitor
 * @since 29.01.2017 , 18:09:24
 *
 */
public class ConcreteVisitor implements Visitor {

	/**
	 * Ueberschreiben der Methode visitElement in der Klasse ConcreteVisitor.
	 * Fuer Details zur Implementierung siehe:
	 * 
	 * @see patterns.behavior.visitor.Visitor#visitElement(patterns.behavior.visitor.Element)
	 */
	@Override
	public void visitElement(Element element) {
		System.out.println(this.getClass().getSimpleName() + " visiting " + element.getClass().getSimpleName() + "!");

	}

}
