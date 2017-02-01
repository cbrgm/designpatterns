package patterns.structural.bridge.example;

import java.util.List;

/**
 * Spezielle Abstraktion
 * 
 * @author Christian Bargmann <christian.bargmann@haw-hamburg.de>
 * @version 02.02.2017
 * @see patterns.structural.bridge
 * @since 02.02.2017 , 00:25:48
 *
 */
public class ListenAbspielGeraet extends AbspielGeraet {

	/**
	 * Konstruktor fuer neue Exemplare der Klasse ListenAbspielGeraet.
	 * 
	 * @param impl
	 */
	public ListenAbspielGeraet(AbspielGeraetImplementierer impl, List<Integer> liste) {
		super(impl);
		this._trackliste = liste;
	}

	private List<Integer> _trackliste;

	/**
	 * Neue Funktion
	 * 
	 * @return
	 */
	public void abspielenUndAusschalten() {
		for (int i : _trackliste) {
			_impl.springeZuTrack(i);
			AbspielDaten daten = _impl.leseDaten();
			System.out.println(daten);
		}
		_impl.ausschalten();
	}

}
