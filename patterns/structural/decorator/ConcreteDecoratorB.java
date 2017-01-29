package patterns.structural.decorator;

/**
 * @author Christian Bargmann <christian.bargmann@haw-hamburg.de>
 * @version 29.01.2017
 * @see patterns.structural.decorator
 * @since 29.01.2017 , 17:14:33
 *
 */
public class ConcreteDecoratorB extends Decorator {

	private int _value;

	/**
	 * Konstruktor fuer neue Exemplare der Klasse ConcreteDecoratorB.
	 * 
	 * @param component
	 */
	public ConcreteDecoratorB(Component component) {
		super(component);
		_value = 99;
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
		System.out.println(this.getClass().getSimpleName() + " is operating! Value is " + _value);

	}

}
