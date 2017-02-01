package patterns.structural.composite;

/**
 * @author Christian Bargmann <christian.bargmann@haw-hamburg.de>
 * @version 01.02.2017
 * @see patterns.structural.composite
 * @since 01.02.2017 , 18:26:20
 *
 */
public class Startup {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		// Baum aufbauen
		Composite composite = new Composite();
		composite.add(new Leaf());
		composite.add(new Leaf());
		composite.add(new Leaf());
		composite.add(new Leaf());

		Composite otherComposite = new Composite();
		composite.add(otherComposite);

		otherComposite.add(new Leaf());
		otherComposite.add(new Leaf());
		otherComposite.add(new Leaf());
		otherComposite.add(new Leaf());

		// Nutzung der Struktur ueber eine gemeinsame Schnittstelle Operate
		composite.operation();
	}

}
