package patterns.structural.bridge.example;

/**
 * Abstraktion
 * 
 * @author Christian Bargmann <christian.bargmann@haw-hamburg.de>
 * @version 02.02.2017
 * @see patterns.structural.bridge
 * @since 02.02.2017 , 00:20:04
 *
 */
public class AbspielGeraet {

	protected AbspielGeraetImplementierer _impl;

	public AbspielGeraet(AbspielGeraetImplementierer impl) {
		this._impl = impl;
	}

	public void spieleAb(int liedNummer) {
		_impl.springeZuTrack(liedNummer);
		AbspielDaten dat = _impl.leseDaten();

		// Daten ausgeben
		System.out.println(dat);
	}

	public void ausschalten() {
		_impl.ausschalten();
	}

}
