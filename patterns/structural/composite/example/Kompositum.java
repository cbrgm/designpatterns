package patterns.structural.composite.example;

/**
 * @author Christian Bargmann <christian.bargmann@haw-hamburg.de>
 * @version 01.02.2017
 * @see patterns.structural.composite.example
 * @since 01.02.2017 , 19:25:19
 *
 */
public class Kompositum extends Knoten {

	/**
	 * Konstruktor fuer neue Exemplare der Klasse Kompositum.
	 * 
	 * @param name
	 */
	public Kompositum(String name) {
		super(name);
	}

	/**
	 * Ueberschreiben der Methode operation in der Klasse Kompositum. Fuer
	 * Details zur Implementierung siehe:
	 * 
	 * @see patterns.structural.composite.example.Knoten#operation()
	 */
	@Override
	public void operation() {

		String formatString;

		// Berechnung fuer neue Ausgabe-Ebene
		_ebene++;

		// Berechnen des Formatstrings fuer die jeweilige Ebene.
		formatString = "%" + (_ebene * 2) + "s";

		// Ausgabe der Leerzeichen
		System.out.printf(formatString, "");

		// Ausgabe eines Pluszeichens gefolgt vom Namen der Komponente
		System.out.println("+ " + super.gibName() + "");

		// Aufruf der Operation fuer alle Kindelemente, rekursiv
		for (Knoten kindknoten : _kindelemente) {
			kindknoten.operation();
		}
		// Ausgabeebene wueder zuruecksetzen.
		--_ebene;

	}

	/**
	 * Fuegt einen KindKnoten hinzu.
	 * 
	 * @param komp
	 */
	@Override
	public void hinzufuegen(Knoten komp) {
		_kindelemente.add(komp);
	}

	/**
	 * Entfernt einen KindKnoten
	 * 
	 * @param komp
	 */
	@Override
	public void entfernen(Knoten komp) {
		for (Knoten kindknoten : _kindelemente) {
			if (kindknoten instanceof Kompositum) {
				((Kompositum) kindknoten).entfernen(komp);
			}
		}
		_kindelemente.remove(komp);
	}

}
