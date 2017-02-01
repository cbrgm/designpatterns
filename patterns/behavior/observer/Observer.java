package patterns.behavior.observer;

/**
 * Diese Klasse repraesentiert einen Beobachter, der ein Subjekt auf Aenderungen
 * beobachten kann.
 * 
 * @author Christian Bargmann <christian.bargmann@haw-hamburg.de>
 * @version 01.02.2017
 * @see patterns.behavior.observer
 * @since 01.02.2017 , 17:49:09
 *
 */
public interface Observer {

	/**
	 * Methode zum aktualisieren eines Status bei einem Beobachter.
	 * 
	 * @param state
	 */
	public void update(int state);

}
