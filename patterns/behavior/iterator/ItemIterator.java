package patterns.behavior.iterator;

/**
 * @author Christian Bargmann <christian.bargmann@haw-hamburg.de>
 * @version 01.02.2017
 * @see patterns.behavior.iterator
 * @since 01.02.2017 , 21:48:52
 *
 */
public class ItemIterator implements Iterator {

	int _index;
	Item[] _data;

	/**
	 * Konstruktor fuer neue Exemplare der Klasse ItemIterator.
	 */
	public ItemIterator(Item[] data) {
		this._index = 0;
		this._data = data;
	}

	/**
	 * Ueberschreiben der Methode hasNext in der Klasse ItemIterator. Fuer
	 * Details zur Implementierung siehe:
	 * 
	 * @see patterns.behavior.iterator.Iterator#hasNext()
	 */
	@Override
	public boolean hasNext() {
		return _index < _data.length;
	}

	/**
	 * Ueberschreiben der Methode next in der Klasse ItemIterator. Fuer Details
	 * zur Implementierung siehe:
	 * 
	 * @see patterns.behavior.iterator.Iterator#next()
	 */
	@Override
	public Item next() {
		return _data[_index++];
	}

}
