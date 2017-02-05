package datapatterns.identitymap;

import java.util.HashMap;
import java.util.Map;

import datapatterns.rowdatagateway.RowDataGateway;

/**
 * Die Indentity Map ist eine eigene Klasse, die nur dafuer da ist Objekte und
 * Schluessel zu verwalten und zu speichern.
 * 
 * Der Aufbau einer Datenbankverbindung und das Verpacken des Datensatzes in ein
 * Objekt + Mapping sind weitaus langsamer, als ein Objekt direkt vom
 * In-Memory-Speicher zu laden.
 * 
 * Wir muessen also den Speicher nur noch befragen, ob ein bestimmtes Objekt mit
 * dem gewuenschten Schluessel (hier ProduktId) schon vorhanden ist, oder nicht.
 * Falls ja, koennen wir es aus dem Speicher entnehmen, ansonsten muessen wir
 * den langsamen Umweg ueber die Datenbank nehmen und das gewonnene Objekt fuer
 * die naechste Verbindung dort ablegen.
 * 
 * Die IdentityMap lohnt sich, wenn: Das Erzeugen der zu speichernden Objekte
 * aufwendig ist z.B. weil die Daten vorher aus einer Datenquelle gelesen werden
 * muessen. Wenn Objekte haeufig wiederverwendet (gelesen) werden muessen, oder
 * es notwendig ist, dass ein assoziativer Speicher zum Einsatz kommt, es also
 * nicht zwei Objekte desselben Datensatzes geben soll.
 * 
 * Die IdentityMap wird dort implementiert, wo ohnehin die Daten abgerufen
 * werden, also beispielsweise in einem TableDataGateway, RowDataGateway oder in
 * der UnitOfWork. Wer eine Identity Map bekommt ergibt sich aus den fachlichen
 * Anforderungen => Eine Identity Map pro Anwendung, Thread, Sitzung,
 * Transaktion?
 * 
 * In der IdentityMap werden Objekte verwaltet. Z.B. Datensaetze einer Tabelle,
 * sodass es pro Tabelle eine eigene IdentityMap geben kann. Man koennte aber
 * auch alle Objekte in einer grossen IdentityMap verpacken, solange sie anhand
 * eines eindeutigen Schluessels identifizierbar sind.
 * 
 * @author Christian Bargmann <christian.bargmann@haw-hamburg.de>
 * @version 05.02.2017
 * @see datapatterns.identitymap
 * @since 05.02.2017 , 23:32:58
 *
 */
public class IdentityMap {

	private static Map<Integer, RowDataGateway> map = new HashMap<Integer, RowDataGateway>();

	public static RowDataGateway hole(int produktId) {
		return map.get(produktId); // falls nicht vorhanden, hinzufuegen.
	}

	public static void fuegeHinzu(RowDataGateway rdg) {
		if (!map.containsKey(rdg.getProduktId())) {
			map.put(rdg.getProduktId(), rdg);
		}
	}

	public static void ueberschreibe(RowDataGateway rdg) {
		map.put(rdg.getProduktId(), rdg);
	}

	public static void loesche(RowDataGateway rdg) {
		map.remove(rdg.getProduktId());
	}

	public static void loesche(int produktId) {
		map.remove(produktId);
	}

}
