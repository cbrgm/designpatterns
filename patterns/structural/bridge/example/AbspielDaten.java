package patterns.structural.bridge.example;

/**
 * Diese Klasse gehoert nicht zum Bridge-Pattern, sondern dient lediglich als
 * Hilfsklasse.
 * 
 * @author Christian Bargmann <christian.bargmann@haw-hamburg.de>
 * @version 02.02.2017
 * @see patterns.structural.bridge
 * @since 02.02.2017 , 00:17:48
 *
 */
public class AbspielDaten {

	public String _daten;

	public AbspielDaten(String daten) {
		this._daten = daten;
	}

	public String toString() {
		return _daten;
	}

}
