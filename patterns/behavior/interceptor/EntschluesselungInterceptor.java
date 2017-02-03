package patterns.behavior.interceptor;

/**
 * Konkreter Interceptor. Im Interceptor wird geprueft, ob eine Verschluesselung
 * ueberhaupt notwendig ist. Man haette aber diese Entscheidung genauso gut im
 * Dispatcher treffen und damit einen Aufruf sparen koennen...
 * 
 * @author Christian Bargmann <christian.bargmann@haw-hamburg.de>
 * @version 03.02.2017
 * @see patterns.behavior.interceptor
 * @since 03.02.2017 , 18:07:28
 *
 */
public class EntschluesselungInterceptor extends Interceptor {

	/**
	 * Ueberschreiben der Methode handleEvent in der Klasse
	 * EntschluesselungInterceptor. Fuer Details zur Implementierung siehe:
	 * 
	 * @see patterns.behavior.interceptor.Interceptor#handleEvent(patterns.behavior.interceptor.BestellContext)
	 */
	@Override
	public void handleEvent(BestellContext context) {
		if (context.benoetigtVerschluesselung()) {
			System.out.println("Chiffre: " + context.getBestelldaten());
			String klartext = new StringBuffer(context.getBestelldaten()).reverse().toString();
			context.setBestelldaten(klartext);
			System.out.println("Klartext: " + context.getBestelldaten());
		}

	}

}
