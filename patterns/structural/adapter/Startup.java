package patterns.structural.adapter;

/**
 * Beispielklasse fuer einen Clienten. der Client möchte die bereits vorhandene
 * (zu adaptierende Klasse) nutzen, hat aber auf Grund seiner Anforderungen eine
 * fuer die Nutzung der zu adaptierenden Klasse inkompatible Schnittstelle.
 * 
 * @author Christian Bargmann <christian.bargmann@haw-hamburg.de>
 * @version 29.01.2017
 * @see patterns.structural.adapter
 * @since 29.01.2017 , 15:43:22
 *
 */
public class Startup {

	/**
	 * Beispielnutzung durch den Clienten.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		// Zu Adapatierende Klasse bietet eine Operation B an, die unsere
		// Zielklasse nicht verwenden kann.
		ZuAdaptierendeKlasse adaptierbareKlasse = new ZuAdaptierendeKlasse();

		// Wir uebergeben die Referenz an unsere erstellte Adapterklasse, welche
		// die Schnittstelle von B kapselt und fuer unsere Zwecke (wir wollen
		// eine Methode A ausfuehren) nutzbar macht.
		Ziel zielklasse = new Adapter(adaptierbareKlasse);

		zielklasse.operationA();

	}

}
