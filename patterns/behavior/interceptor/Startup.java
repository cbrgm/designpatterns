package patterns.behavior.interceptor;

/**
 * @author Christian Bargmann <christian.bargmann@haw-hamburg.de>
 * @version 03.02.2017
 * @see patterns.behavior.interceptor
 * @since 03.02.2017 , 18:02:28
 *
 */
public class Startup {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BestellFramework framework = new BestellFramework();

		// Interceptoren fuer die Bearbeitung
		Interceptor interceptor = new EntschluesselungInterceptor();

		// Registrieren am Dispatcher
		framework.getDispatcher().registriere(interceptor);

		// Ausfuehren bei Eventeintritt
		framework.bestellEvent("Eine Bestellung", true);
		framework.bestellEvent("Eine Bestellung", false);

	}

}
