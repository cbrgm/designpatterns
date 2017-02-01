package patterns.behavior.iterator;

/**
 * DataStructure definiert die Schnittstelle fuer eine iterierbare
 * Datenstruktur.
 * 
 * @author Christian Bargmann <christian.bargmann@haw-hamburg.de>
 * @version 01.02.2017
 * @see patterns.behavior.iterator
 * @since 01.02.2017 , 21:12:29
 *
 */
public interface DataStructure {

	/**
	 * Liefert eine neue Iterator-Instanz an den Clienten zurueck.
	 * 
	 * @return
	 */
	public Iterator createIterator();

}
