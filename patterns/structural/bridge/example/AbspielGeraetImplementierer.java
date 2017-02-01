package patterns.structural.bridge.example;

/**
 * Implementierer als Interface
 * 
 * @author Christian Bargmann <christian.bargmann@haw-hamburg.de>
 * @version 02.02.2017
 * @see patterns.structural.bridge
 * @since 02.02.2017 , 00:21:18
 *
 */
public interface AbspielGeraetImplementierer {

	public void springeZuTrack(int liedNummer);

	public AbspielDaten leseDaten();

	public void ausschalten();

}
