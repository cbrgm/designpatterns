package patterns.structural.composite.example;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Christian Bargmann <christian.bargmann@haw-hamburg.de>
 * @version 01.02.2017
 * @see patterns.structural.composite.example
 * @since 01.02.2017 , 19:19:54
 *
 */
public abstract class Knoten {

	private String _name = "";
	static int _ebene = 0;
	List<Knoten> _kindelemente = new ArrayList<Knoten>();

	/**
	 * Konstruktor fuer neue Exemplare der Klasse Knoten.
	 * 
	 * @param name
	 */
	public Knoten(String name) {
		this._name = name;
	}

	/**
	 * Abstrakte Operation, die die Komposita und Blaetter individuell
	 * implementieren muessen.
	 */
	public abstract void operation();

	/**
	 * Fuegt einen KindKnoten hinzu.
	 * 
	 * @param komp
	 */
	public void hinzufuegen(Knoten komp) {
		// Leere Defaultimplementierung
	}

	/**
	 * Entfernt einen KindKnoten
	 * 
	 * @param komp
	 */
	public void entfernen(Knoten komp) {
		// Leere Defaultimplementierung
	}

	/**
	 * Liefert den Namen des jeweiligen Knotens zurueck.
	 * 
	 * @return
	 */
	public String gibName() {
		return this._name;
	}

}
