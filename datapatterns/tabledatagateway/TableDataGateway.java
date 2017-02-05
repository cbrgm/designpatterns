package datapatterns.tabledatagateway;

import java.util.List;

/**
 * Das TableDataGateway verwaltet die Verbindung zu einer Datenbanktabelle eins
 * zu eins. Diese einzige Instanz verwaltet auf diese Weise auch alle
 * Datensaetze dieser Tabelle.
 * 
 * Statt dem TableDataGateway koennten wir auch SQL direkt in unseren Code
 * einbetten. Das hat jedoch erhebliche Nachteile denn so wuerde eine Klasse
 * sich um die Verarbeitung der Daten und gleichzeitig auch um den Datenzugriff
 * kuemmern. Das ist dem Single-Responsibility-Prinzip zuwider.
 * 
 * Besser ist es die Verarbeitung und den Datenzugriff zu trennen. Das
 * TableDataGateway kapselt dabei die CRUD-Operationen (Create, Read, Update,
 * Delete) in einer Klasse. Ein TableDataGateway muss NICHT immer alle
 * CRUD-Operationen anbieten z.B. dann nicht, wenn eine View nicht updatefaehig
 * ist!
 * 
 * Gleichzeitig eignet sich das TableDataGateway auch fuer Stored Procedures,
 * Funktionen, Tabellenwertfunktionen, Views o.a.
 * 
 * Das TableDataGateway kann nach belieben ergaenzt werden z.B. mit dem
 * UnitOfWork-Pattern, Lese- oder Schreibcaches wenn es der Kontext erfordert.
 * 
 * Methoden muessen nicht streng an CRUD angelehnt sein und koennen auch
 * geschaeftlicher Natur sein, solange keine Geschaeftslogik (Verarbeitung) in
 * das Gateway wandert.
 * 
 * Eine Tabelle = Ein TableDataGateway? In der Regel ja. Erlaubt ist was Sinn
 * macht. Z.B. kann eine View Daten aus drei Tabellen zurueckgeben. Hier macht
 * nur ein TableDataGateway Sinn.
 * 
 * @author Christian Bargmann <christian.bargmann@haw-hamburg.de>
 * @version 05.02.2017
 * @see datapatterns.tabledatagateway
 * @since 05.02.2017 , 01:21:26
 *
 */
public interface TableDataGateway {

	/**
	 * Sucht anhand der ID einen relevanten Datensatz in der Datenquelle und
	 * gibt diesen als Objekt zurueck.
	 * 
	 * @param id
	 * @return
	 */
	public Object hole(int id);

	/**
	 * Fuehrt eine SQL-Anweisung oder Suchbefehl an der Datenquelle aus und
	 * liefert die relevanten Datensaetze als Liste mit Objekten zurueck.
	 * 
	 * @param sqlstring
	 * @return
	 */
	public List<?> suche(String sqlstring);

	/**
	 * Fuegt einen neuen Datensatz in die Datenquelle ein. Diese Methode kann in
	 * den implementierenden Klassen ggf. ueberladen werden, sodass das die
	 * Objektattribute z.B. Preis, Beschreibung etc. direkt im Methodenkopf
	 * angegeben werden koennen.
	 * 
	 * @param object
	 */
	public void hinzufuegen(Object object);

	/**
	 * Loescht einen Datensatz aus der Datenquelle unter Angabe der ID.
	 * 
	 * @param id
	 */
	public void loeschen(int id);

	/**
	 * Aktualisiert einen Datensatz in der Datenquelle. Diese Methode kann in
	 * den implementierenden Klassen ggf. ueberladen werden, sodass das die
	 * Objektattribute z.B. Preis, Beschreibung etc. direkt im Methodenkopf
	 * angegeben werden koennen.
	 * 
	 * @param object
	 */
	public void aktualisieren(Object object);

}
