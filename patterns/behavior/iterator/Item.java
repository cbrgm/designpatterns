package patterns.behavior.iterator;

/**
 * @author Christian Bargmann <christian.bargmann@haw-hamburg.de>
 * @version 01.02.2017
 * @see patterns.behavior.iterator
 * @since 01.02.2017 , 21:45:47
 *
 */
public class Item {

	private String _name;

	public Item(String name) {
		this._name = name;
	}

	/**
	 * Getter-Methode zu _name. Ermöglicht es einem Klienten, den Wert der
	 * Exemplarvariablen _name abzufragen.
	 *
	 * @return the _name
	 */
	public String get_name() {
		return _name;
	}

	/**
	 * Setter-Methode zu _name. Ermöglicht es dem Klienten, den Wert der
	 * Exemplarvariablen _name zu setzen.
	 *
	 * @param _name
	 *            the _name to set
	 */
	public void set_name(String _name) {
		assert _name != null : "Vorbedingung verletzt: _name != null!";

		this._name = _name;
	}

}
