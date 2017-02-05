package datapatterns.rowdatagateway;

import java.util.ArrayList;

/**
 * Die Methoden dieser Klasse sind statisch, haetten aber genauso gut
 * Instanzmethoden sein koennen.
 * 
 * @author Christian Bargmann <christian.bargmann@haw-hamburg.de>
 * @version 05.02.2017
 * @see datapatterns.rowdatagateway
 * @since 05.02.2017 , 22:35:42
 *
 */
public class DataSucher {

	public static RowDataGateway hole(int id) {
		RowDataGateway g = new RowDataGateway();
		// SELECT feldliste FROM produkt WHERE produktid = ?;
		// Parameter setzen auf die ID
		// SQL ausfuehren und Felder auf das Objekt mappen.

		return g;
	}

	public static ArrayList<RowDataGateway> suche(String text) {
		ArrayList<RowDataGateway> gateway = new ArrayList<RowDataGateway>();
		// SELECT feldliste FROM produkt WHERE Produkt like '%?%';
		// Parameter setzen auf text, oder gleich Volltextsuche
		// Results Zeile fuer Zeile durchgehen und Liste zusammenbauen.
		return gateway;
	}
}
