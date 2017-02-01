package patterns.behavior.templatemethod;

/**
 * Statup-Klasse fuer die beispielhafte Benutzung des vorgestellten Patterns
 * durch den Clienten.
 * 
 * @author Christian Bargmann <christian.bargmann@haw-hamburg.de>
 * @version 01.02.2017
 * @see patterns.behavior.templatemethod
 * @since 01.02.2017 , 20:12:10
 *
 */
public class Startup {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		// Instanziierung der AbstraktenKlasse mit einer Implementation von
		// ConcreteClass1
		AbstractClass abstractClass = new ConcreteClass1();

		// Ausfuehrung
		abstractClass.templateMethod();

		// Instanziierung der AbstraktenKlasse mit einer Implementation von
		// ConcreteClass1
		abstractClass = new ConcreteClass2();

		// Ausfuehrung
		abstractClass.templateMethod();

	}

}
