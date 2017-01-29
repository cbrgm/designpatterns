package patterns.structural.adapter;

/**
 * Bietet ihre Operationen mit Schnittstellen an, die nicht kompatibel sind mit
 * den Schnittstellen, die der Client erwartet, um die Klasse benutzen zu
 * können.
 * 
 * @author Christian Bargmann <christian.bargmann@haw-hamburg.de>
 * @version 29.01.2017
 * @see patterns.structural.adapter
 * @since 29.01.2017 , 15:59:02
 *
 */
public class ZuAdaptierendeKlasse {

	public void operationB() {
		System.out.println(this.getClass().getSimpleName() + " fuehrt Operation B aus.");
	}

}
