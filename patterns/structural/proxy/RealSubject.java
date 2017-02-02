package patterns.structural.proxy;

/**
 * @author Christian Bargmann <christian.bargmann@haw-hamburg.de>
 * @version 02.02.2017
 * @see patterns.structural.proxy
 * @since 02.02.2017 , 15:29:40
 *
 */
public class RealSubject implements Subject {

	/**
	 * Ueberschreiben der Methode operation in der Klasse RealSubject. Fuer
	 * Details zur Implementierung siehe:
	 * 
	 * @see patterns.structural.proxy.Subject#operation()
	 */
	@Override
	public void operation() {
		System.out.println("Fuehre Operation aus");

	}

}
