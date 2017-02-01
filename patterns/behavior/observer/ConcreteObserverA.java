package patterns.behavior.observer;

/**
 * @author Christian Bargmann <christian.bargmann@haw-hamburg.de>
 * @version 01.02.2017
 * @see patterns.behavior.observer
 * @since 01.02.2017 , 17:58:45
 *
 */
public class ConcreteObserverA implements Observer {

	/**
	 * Ueberschreiben der Methode update in der Klasse ConcreteObserverA. Fuer
	 * Details zur Implementierung siehe:
	 * 
	 * @see patterns.behavior.observer.Observer#update(int)
	 */
	@Override
	public void update(int state) {
		System.out.println("Konkreter Observer A wurde aktualisiert aufgrund einer Aenderung am Subjekt " + state);

	}

}
