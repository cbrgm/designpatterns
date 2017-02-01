package patterns.structural.composite;

/**
 * Definiert die gemeinsame Schnittstelle von den Leafs und Composites
 * 
 * @author Christian Bargmann <christian.bargmann@haw-hamburg.de>
 * @version 01.02.2017
 * @see patterns.structural.composite
 * @since 01.02.2017 , 18:26:48
 *
 */
public abstract class Component {

	// Gemeinsame Methode
	public abstract void operation();

	public void add(Component comp) {
		// Leere Defaultimplementierung. Ist fuer die einzelnen Leafs nicht
		// sinnvoll und werden von Composites ueberschrieben.
	}

	public void remove(Component comp) {
		// Leere Defaultimplementierung.
	}

	public Component getChild(int index) {
		// Leere Defaultimplementierung.
		return null;
	}

}
