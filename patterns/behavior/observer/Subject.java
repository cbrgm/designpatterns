package patterns.behavior.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Abstrakte Klasse fuer ein beobachtbares Subjekt. Ein beobachtbares Subjekt kann Beobachter registrieren, entfernen und ueber Aenderungen informieren.
 * 
 * @author Christian Bargmann <christian.bargmann@haw-hamburg.de>
 * @version 01.02.2017
 * @see patterns.behavior.observer
 * @since 01.02.2017 , 17:45:28
 *
 */
public abstract class Subject {

	private final List<Observer> _observerlist = new ArrayList<Observer>();

	/**
	 * Registriert neue Beobachter an dem Subjekt.
	 * @param newObserver
	 */
	public void register(Observer newObserver) {
		_observerlist.add(newObserver);
	}

	/**
	 * Meldet Beobachter an dem Subjekt ab.
	 * @param newObserver
	 */
	public void unregister(Observer newObserver) {
		_observerlist.remove(newObserver);
	}
	
	/**
	 * Informiert die Beobachter des Subjekts bei Aenderung eines Zustandes.
	 */
	protected void notifyObservers(int state)
	{
		for(Observer observer : _observerlist)
		{
			observer.update(state);
		}
	}

}
