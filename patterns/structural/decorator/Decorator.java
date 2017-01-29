package patterns.structural.decorator;

/**
 * @author Christian Bargmann <christian.bargmann@haw-hamburg.de>
 * @version 29.01.2017
 * @see patterns.structural.decorator
 * @since 29.01.2017 , 17:09:19
 *
 */
public abstract class Decorator extends Component {

	protected Component _component;

	// Konstruktor zum initiieren an der Clientenklasse
	public Decorator(Component component) {
		this._component = component;
	}

	// Operate-Methode wird erst in den konkreten Componentklassen
	// implementiert.

}
