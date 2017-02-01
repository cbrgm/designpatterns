package patterns.structural.facade.example;

/**
 * @author Christian Bargmann <christian.bargmann@haw-hamburg.de>
 * @version 01.02.2017
 * @see patterns.structural.facade.example
 * @since 01.02.2017 , 20:48:32
 *
 */
public class FahrwerkLager {

	private int _fahrwerkAnzahl = 0;

	public void lagerFuellen(int anzahl) {
		_fahrwerkAnzahl = _fahrwerkAnzahl + anzahl;
		System.out.println(this.getClass().getSimpleName() + " wurde um " + anzahl + " Einheiten aufgestockt");
	}

	public void fahrwerkEntnehmen(int anzahl) {
		_fahrwerkAnzahl = _fahrwerkAnzahl - anzahl;
		System.out.println(this.getClass().getSimpleName() + " wurde um " + anzahl + " Einheiten aufgestockt");
	}

}
