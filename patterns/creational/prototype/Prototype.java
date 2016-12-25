package patterns.creational.prototype;

/**
 * @author Christian Bargmann <christian.bargmann@haw-hamburg.de>
 * @version 08.12.2016
 * @see abstraction
 * @since 08.12.2016 , 02:47:22
 *
 */
public interface Prototype extends Cloneable {

	/**
	 * Interface fuer Objekte die im Cache gespeichert werden können.
	 * 
	 * @return Protoype
	 * @throws CloneNotSupportedException
	 */
	public Prototype clone() throws CloneNotSupportedException;

}
