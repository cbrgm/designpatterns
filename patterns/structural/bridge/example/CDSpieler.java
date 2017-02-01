package patterns.structural.bridge.example;

/**
 * Konkreter Implementierer
 * 
 * @author Christian Bargmann <christian.bargmann@haw-hamburg.de>
 * @version 02.02.2017
 * @see patterns.structural.bridge
 * @since 02.02.2017 , 00:32:22
 *
 */
public class CDSpieler implements AbspielGeraetImplementierer {

	/**
	 * Ueberschreiben der Methode springeZuTrack in der Klasse CDSpieler. Fuer
	 * Details zur Implementierung siehe:
	 * 
	 * @see patterns.structural.bridge.example.AbspielGeraetImplementierer#springeZuTrack(int)
	 */
	@Override
	public void springeZuTrack(int liedNummer) {
		System.out.println("Durchsuche Inhaltsverzeichnis");
		System.out.println("Springe zu Lied " + liedNummer);
	}

	/**
	 * Ueberschreiben der Methode leseDaten in der Klasse CDSpieler. Fuer
	 * Details zur Implementierung siehe:
	 * 
	 * @see patterns.structural.bridge.example.AbspielGeraetImplementierer#leseDaten()
	 */
	@Override
	public AbspielDaten leseDaten() {
		return new AbspielDaten("CD-Daten");
	}

	/**
	 * Ueberschreiben der Methode ausschalten in der Klasse CDSpieler. Fuer
	 * Details zur Implementierung siehe:
	 * 
	 * @see patterns.structural.bridge.example.AbspielGeraetImplementierer#ausschalten()
	 */
	@Override
	public void ausschalten() {
		System.out.println(this.getClass().getSimpleName() + " wird ausgeschaltet.");

	}

}
