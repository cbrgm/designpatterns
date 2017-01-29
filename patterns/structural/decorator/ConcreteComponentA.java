package patterns.structural.decorator;

/**
 * @author Christian Bargmann <christian.bargmann@haw-hamburg.de>
 * @version 29.01.2017
 * @see patterns.structural.decorator
 * @since 29.01.2017 , 17:08:03
 *
 */
public class ConcreteComponentA extends Component {

	/**
	 * Ueberschreiben der Methode operate in der Klasse ConcreteComponentA. Fuer
	 * Details zur Implementierung siehe:
	 * 
	 * @see patterns.structural.decorator.Component#operate()
	 */
	@Override
	public void operate() {
		System.out.println(this.getClass().getSimpleName() + " is operating.");

	}

}
