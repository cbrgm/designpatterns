package patterns.structural.decorator;

/**
 * @author Christian Bargmann <christian.bargmann@haw-hamburg.de>
 * @version 29.01.2017
 * @see patterns.structural.decorator
 * @since 29.01.2017 , 17:14:33
 *
 */
public class ConcreteDecoratorA extends Decorator {

	/**
	 * Konstruktor fuer neue Exemplare der Klasse ConcreteDecoratorA.
	 * 
	 * @param component
	 */
	public ConcreteDecoratorA(Component component) {
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
		// operate der dekorierenden Komponente aufrufen
		_component.operate();

		// Eigene Funktionalitaet:
		System.out.println(this.getClass().getSimpleName() + " is operating!");

	}

}
