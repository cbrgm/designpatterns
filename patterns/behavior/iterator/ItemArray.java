package patterns.behavior.iterator;

/**
 * @author Christian Bargmann <christian.bargmann@haw-hamburg.de>
 * @version 01.02.2017
 * @see patterns.behavior.iterator
 * @since 01.02.2017 , 21:45:17
 *
 */
public class ItemArray implements DataStructure {

	int _index;
	Item[] _data;

	/**
	 * Konstruktor fuer neue Exemplare der Klasse ItemArray.
	 */
	public ItemArray(int size) {
		this._index = 0;
		this._data = new Item[size];
	}

	/**
	 * Fuegt ein neues Item in die Datenstruktur ein.
	 * 
	 * @param item
	 */
	public void add(Item item) {
		_data[_index++] = item;
	}

	/**
	 * Ueberschreiben der Methode createIterator in der Klasse ItemArray. Fuer
	 * Details zur Implementierung siehe:
	 * 
	 * @see patterns.behavior.iterator.DataStructure#createIterator()
	 */
	@Override
	public Iterator createIterator() {
		return new ItemIterator(_data);
	}

}
