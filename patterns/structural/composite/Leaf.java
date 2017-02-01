package patterns.structural.composite;

import patterns.structural.composite.Component;

/**
 * @author Christian Bargmann <christian.bargmann@haw-hamburg.de>
 * @version 01.02.2017
 * @see patterns.structural.composite
 * @since 01.02.2017 , 18:30:02
 *
 */
public class Leaf extends Component {

	/**
	 * Ueberschreiben der Methode operate in der Klasse Leaf. Fuer Details zur
	 * Implementierung siehe:
	 * 
	 * @see patterns.structural.decorator.Component#operate()
	 */
	@Override
	public void operation() {
		System.out.println(this.getClass().getSimpleName() + " Ich bin ein Leaf-Objekt.");

	}

}
