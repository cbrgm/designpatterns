package patterns.structural.bridge;

/**
 * @author Christian Bargmann <christian.bargmann@haw-hamburg.de>
 * @version 02.02.2017
 * @see patterns.structural.bridge
 * @since 02.02.2017 , 13:46:26
 *
 */
public class ConcreteImplB implements AbstractionImpl {

	/**
	 * Ueberschreiben der Methode operationImpl in der Klasse ConcreteImplA.
	 * Fuer Details zur Implementierung siehe:
	 * 
	 * @see patterns.structural.bridge.AbstractionImpl#operationImpl()
	 */
	@Override
	public void operationImpl() {
		System.out.println(this.getClass().getSimpleName() + " fuerht Operation aus!");

	}

}
