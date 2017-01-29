package patterns.structural.decorator;

/**
 * @author Christian Bargmann <christian.bargmann@haw-hamburg.de>
 * @version 29.01.2017
 * @see patterns.structural.decorator
 * @since 29.01.2017 , 17:14:33
 *
 */
public class ConcreteDecoratorC extends Decorator {

	/**
	 * Konstruktor fuer neue Exemplare der Klasse ConcreteDecoratorC.
	 * 
	 * @param component
	 */
	public ConcreteDecoratorC(Component component) {
		super(component);
	}

	/**
	 * Ueberschreiben der Methode operate in der Klasse ConcreteDecoratorA. Fuer
	 * Details zur Implementierung siehe:
	 * 
	 * @see patterns.structural.decorator.Component#operate()
	 */
	@Override
	public void operate() {
		_component.operate();
		System.out.println(this.getClass().getSimpleName() + " is operating!");
		newOperation();

	}

	/**
	 * Fuegt der Komponente eine neue Operation hinzu. Erweiterung der
	 * Schnittstelle nach aussen.
	 */
	public void newOperation() {
		System.out.println(" ... und fuehrt eine neue Operation aus!");
	}

}
