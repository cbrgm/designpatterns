package patterns.behavior.iterator;

/**
 * @author Christian Bargmann <christian.bargmann@haw-hamburg.de>
 * @version 01.02.2017
 * @see patterns.behavior.iterator
 * @since 01.02.2017 , 21:09:10
 *
 */
public interface Iterator {

	/**
	 * Prueft ob die Datenstruktur ueber die iteriert wird ein weiteres Element
	 * beinhaltet.
	 * 
	 * @return
	 */
	boolean hasNext();

	/**
	 * Liefert die Referenz auf das naechste Element in der Datenstruktur
	 * zurueck.
	 * 
	 * @return
	 */
	Object next();

}
