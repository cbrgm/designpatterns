package patterns.structural.composite.example;

/**
 * @author Christian Bargmann <christian.bargmann@haw-hamburg.de>
 * @version 01.02.2017
 * @see patterns.structural.composite.example
 * @since 01.02.2017 , 19:19:26
 *
 */
public class Startup {

	public static void main(String[] args) {

		System.out.println("Testen des Kompositum-Patterns");
		System.out.println("");

		// Aufbau der Objektstruktur
		Kompositum komp = new Kompositum("Kompositum Ebene 1");
		Kompositum komp11 = new Kompositum("Kompositum Ebene 1 1");
		Kompositum komp12 = new Kompositum("Kompositum Ebene 1 2");
		Kompositum komp121 = new Kompositum("Kompositum Ebene 1 2 1");

		komp.hinzufuegen(komp11);
		komp.hinzufuegen(komp12);

		komp12.hinzufuegen(komp121);

		komp11.hinzufuegen(new Blatt("Blatt-Element"));
		komp11.hinzufuegen(new Blatt("Blatt-Element"));
		komp11.hinzufuegen(new Blatt("Blatt-Element"));
		komp11.hinzufuegen(new Blatt("Blatt-Element"));

		komp12.hinzufuegen(new Blatt("Blatt-Element"));
		komp12.hinzufuegen(new Blatt("Blatt-Element"));
		komp12.hinzufuegen(new Blatt("Blatt-Element"));

		komp121.hinzufuegen(new Blatt("Blatt-Element"));
		komp121.hinzufuegen(new Blatt("Blatt-Element"));

		// Aufruf der Operation fuer das Kompositum
		System.out.println("Erste Ausgabe des Kompositums");
		System.out.println();
		komp.operation();
		System.out.println();

		// Modifikation des Kompositums
		komp12.entfernen(komp121);

		// Aufruf der Operation fuer das Kompositum
		System.out.println("Zweite Ausgabe des Kompositums");
		System.out.println();
		komp.operation();
		System.out.println();

	}

}
