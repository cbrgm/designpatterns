package patterns.behavior.interceptor;

/**
 * Abstrakte Basisklasse fuer Interceptoren.
 * 
 * @author Christian Bargmann <christian.bargmann@haw-hamburg.de>
 * @version 03.02.2017
 * @see patterns.behavior.interceptor
 * @since 03.02.2017 , 18:03:09
 *
 */
public abstract class Interceptor {

	public abstract void handleEvent(BestellContext context);

}
