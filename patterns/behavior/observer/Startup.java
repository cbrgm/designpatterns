package patterns.behavior.observer;

/**
 * Beispielklasse fuer die Benutzung durch den Klienten.
 * 
 * @author Christian Bargmann <christian.bargmann@haw-hamburg.de>
 * @version 01.02.2017
 * @see patterns.behavior.observer
 * @since 01.02.2017 , 17:40:50
 *
 */
public class Startup {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Beobachtbares Subjekt erstellen
		ConcreteSubject subject = new ConcreteSubject();

		// Beobachter registrieren am Subjekt
		subject.register(new ConcreteObserverA());
		subject.register(new ConcreteObserverB());

		// Aenderung am Subjekt durchfuehren.
		subject.setState(50);
		subject.setState(75);
	}

}
