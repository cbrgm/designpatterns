package patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

import patterns.structural.composite.Component;

/**
 * @author Christian Bargmann <christian.bargmann@haw-hamburg.de>
 * @version 01.02.2017
 * @see patterns.structural.composite
 * @since 01.02.2017 , 18:31:09
 *
 */
public class Composite extends Component {

	// Components werden als Liste gespeichert.
	private List<Component> _childComponents = new ArrayList<Component>();

	/**
	 * Ueberschreiben der Methode operation in der Klasse Component. Fuer
	 * Details zur Implementierung siehe:
	 * 
	 * @see patterns.structural.composite.Component#operation()
	 */
	@Override
	public void operation() {
		System.out.println(this.getClass().getSimpleName() + " Ich bin ein Composite. Hier folgen meine Kinder:");
		for (Component children : _childComponents) {
			// Rekursiver Aufruf in den Leafs
			children.operation();
		}

	}

	/**
	 * Ueberschreiben der Methode add in der Klasse Composite. Fuer Details zur
	 * Implementierung siehe:
	 * 
	 * @see patterns.structural.composite.Component#add(patterns.structural.composite.Component)
	 */
	@Override
	public void add(Component comp) {
		_childComponents.add(comp);
	}

	/**
	 * Ueberschreiben der Methode remove in der Klasse Composite. Fuer Details
	 * zur Implementierung siehe:
	 * 
	 * @see patterns.structural.composite.Component#remove(patterns.structural.composite.Component)
	 */
	@Override
	public void remove(Component comp) {
		_childComponents.remove(comp);
	}

	/**
	 * Ueberschreiben der Methode getChild in der Klasse Composite. Fuer Details
	 * zur Implementierung siehe:
	 * 
	 * @see patterns.structural.composite.Component#getChild(int)
	 */
	@Override
	public Component getChild(int index) {
		return _childComponents.get(index);
	}

}
