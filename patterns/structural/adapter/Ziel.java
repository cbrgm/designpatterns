package patterns.structural.adapter;

/**
 * Das Interface Ziel entspricht den Anforferungen des Clients. Dieses Interface
 * muss implementiert werden. Da das Interface Ziel nicht identisch mit der
 * Schnittstelle der ZuAdaptierendenKlasse ist, wird ein Adapter benoetigt.
 * 
 * @author Christian Bargmann <christian.bargmann@haw-hamburg.de>
 * @version 29.01.2017
 * @see patterns.structural.adapter
 * @since 29.01.2017 , 15:57:59
 *
 */
public interface Ziel {

	/**
	 * Operation die die Zielklasse anbieten muss.
	 */
	public void operationA();

}
