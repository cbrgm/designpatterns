package patterns.behavior.interceptor;

import java.util.ArrayList;
import java.util.List;

/**
 * Fuer jeden Typ an Nachrichten gibt es einen eigenen Dispatcher. Da das
 * Beispiel nur Bestellungen verarbeitet, gibt es also folglich auch nur einen
 * Dispatcher. Wichtig ist, dass alle Interceptor-Objekte zum Dispatcher
 * kompatibel sein muessen. In einer Verarbeitungskette koennte ein Dispatcher
 * zum Beispiel einen Dispatcher fuer die Authentifizierung und einen anderen
 * fuer das Filtern von Nachrichten geben. Die Interceptor-Objekte bilden dann
 * verschiedene Authentifizierungsverfahren ab bzw. implementieren die
 * verschiedenen Arten von Filtern.
 * 
 * @author Christian Bargmann <christian.bargmann@haw-hamburg.de>
 * @version 03.02.2017
 * @see patterns.behavior.interceptor
 * @since 03.02.2017 , 18:11:30
 *
 */
public class Dispatcher {

	private List<Interceptor> interceptors;

	/**
	 * Konstruktor fuer neue Exemplare der Klasse Dispatcher.
	 */
	public Dispatcher() {
		interceptors = new ArrayList<Interceptor>();
	}

	/**
	 * Registriert neue Interceptor-Instanzen an dem Dispatcher.
	 * 
	 * @param interceptor
	 */
	public void registriere(Interceptor interceptor) {
		if (!interceptors.contains(interceptor)) {
			interceptors.add(interceptor);
		}
	}

	/**
	 * Meldet neue Interceptor-Instanzen von den Dispatcher ab.
	 * 
	 * @param interceptor
	 */
	public void entferne(Interceptor interceptor) {
		if (interceptors.contains(interceptor)) {
			interceptors.remove(interceptor);
		}
	}

	/**
	 * Verteilt den Context an die Interceptor-Instanzen zur Verarbeitung.
	 * 
	 * @param context
	 */
	public void dispatch(BestellContext context) {
		for (Interceptor interceptor : interceptors) {
			interceptor.handleEvent(context);
		}
	}

}
