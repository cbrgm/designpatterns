package patterns.structural.adapter;

/**
 * Die Klasse Adapter uebernimmt die Anpassung an die vom Client benoetigte
 * Schnittstelle, indem sie die Schnittstelle des Clients auf die Schnittstelle
 * der zu adaptierenden Klasse bildet. Ein Objekt der Klasse Adapter ermoeglicht
 * die Kommunikation zwischen dem Client und einem Objekt der zu adaptierenden
 * Klasse.
 * 
 * @author Christian Bargmann <christian.bargmann@haw-hamburg.de>
 * @version 29.01.2017
 * @see patterns.structural.adapter
 * @since 29.01.2017 , 15:58:43
 *
 */
public class Adapter implements Ziel {

	private ZuAdaptierendeKlasse _adaptierendeKlasse;

	/**
	 * 
	 * Konstruktor fuer neue Exemplare der Klasse Adapter.
	 * 
	 * @param adaptierendeKlasse
	 */
	public Adapter(ZuAdaptierendeKlasse adaptierendeKlasse) {
		this._adaptierendeKlasse = adaptierendeKlasse;
	}

	/**
	 * Ueberschreiben der Methode operationA in der Klasse Ziel. Fuer Details
	 * zur Implementierung siehe:
	 * 
	 * @see patterns.structural.adapter.Ziel#operationA()
	 */
	@Override
	public void operationA() {
		_adaptierendeKlasse.operationB();

	}

}
