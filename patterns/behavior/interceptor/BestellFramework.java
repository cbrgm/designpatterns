package patterns.behavior.interceptor;

import java.util.Date;

/**
 * Das Framework verarbeitet das eingehende Event entlang der
 * Verarbeitungskette. Woher das Event kommt ist nicht weiter wichtig,
 * vermutlich lauscht ein Listener an einem Port und informiert diese Klasse
 * beim Eintreffen einer neuen Nachricht.
 * 
 * @author Christian Bargmann <christian.bargmann@haw-hamburg.de>
 * @version 03.02.2017
 * @see patterns.behavior.interceptor
 * @since 03.02.2017 , 18:25:43
 *
 */
public class BestellFramework {

	private Dispatcher dispatcher;

	public BestellFramework() {
		dispatcher = new Dispatcher();
	}

	public void bestellEvent(String bestellDaten, boolean isVerschluesselt) {
		BestellContext context = new BestellContext(bestellDaten, new Date(), isVerschluesselt);
		dispatcher.dispatch(context);
	}

	public Dispatcher getDispatcher() {
		return this.dispatcher;
	}

}
