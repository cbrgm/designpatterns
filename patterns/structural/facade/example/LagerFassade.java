package patterns.structural.facade.example;

/**
 * @author Christian Bargmann <christian.bargmann@haw-hamburg.de>
 * @version 01.02.2017
 * @see patterns.structural.facade.example
 * @since 01.02.2017 , 20:48:32
 *
 */
public class LagerFassade {

	private FahrwerkLager _fahrwerklager = new FahrwerkLager();
	private GetriebeLager _getriebeLager = new GetriebeLager();
	private MotorLager _motorLager = new MotorLager();

	public void alleLagerFuellen(int anzahl) {
		System.out.println("Fuelle alle Lager auf");
		_fahrwerklager.lagerFuellen(anzahl);
		_getriebeLager.lagerFuellen(anzahl);
		_motorLager.lagerFuellen(anzahl);
	}

	public void TeileEntnehmen(int anzahl) {
		System.out.println("Entnehme Teile fuer die Produktion");
		_fahrwerklager.fahrwerkEntnehmen(anzahl);
		_getriebeLager.getriebeEntnehmen(anzahl);
		_motorLager.motorEntnehmen(anzahl);

	}

}
