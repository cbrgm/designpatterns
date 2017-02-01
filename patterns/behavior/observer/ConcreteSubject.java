package patterns.behavior.observer;

/**
 * @author Christian Bargmann <christian.bargmann@haw-hamburg.de>
 * @version 01.02.2017
 * @see patterns.behavior.observer
 * @since 01.02.2017 , 17:52:38
 *
 */
public class ConcreteSubject extends Subject {

	private int _state;

	/**
	 * Eine Methode zum setzen des Status bei einem konkreten Subjekt. Durch
	 * notifyObservers (geerbt durch die abstrakte Klasse Subjekt), werden bei
	 * Aenderungen alle Beobachter ueber den neuen State informiert.
	 * 
	 * @param state
	 */
	public void setState(int state) {
		this._state = state;
		notifyObservers(_state);
	}

	/**
	 * Getter-Methode fuer das liefernd es aktuellen Status.
	 * 
	 * @return
	 */
	public int getState() {
		return _state;

	}

}
