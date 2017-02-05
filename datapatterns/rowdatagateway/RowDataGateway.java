package datapatterns.rowdatagateway;

import java.sql.SQLException;

/**
 * Ein RowDataGateway steht fuer einen Datensatz. Falls der Datensatz Spalten
 * besitzt, enthaelt das Gateway die entsprechenden Felder, eines fuer jede
 * Spalte. Im Gegensatz zu einem Data-Transder-Objekt ist es aber ein Gateway,
 * kuemmert sich also um die Kommunikation mit der Datenbank.
 * 
 * Man sieht, der Datensatz verwaltet sich selbst, aktualisiert und loescht sich
 * also selbst. Sobald er geloescht wurde, laesst er sich nicht noch einmal
 * aktualisieren oder erneut loeschen, wir wuerden ohnehin eine SQL-Exception
 * erhalten.
 * 
 * Wir haetten die Methoden zum Loeschen und Hinzufuegen auch in der
 * Finder-Klasse unterbringen koennen, die dann aber zweckmaessig umbenannt
 * werden sollte und auf diese Weise schon fast wieder zu einem TableDataGateway
 * wird.
 * 
 * Ein natuerlicher Nachteil dieses Musters ist es, dass Operationen auf mehrere
 * Datensaetze nicht im Row Data Gateway abgebildet werden koennen, weil ein
 * Objekt eben nur fuer einen Datensatz steht.
 * 
 * Ein Beispiel fuer dieses Muster sind Suchfunktionen, die daher ueblicherweise
 * eine eigene Klasse, einen Finder, spendiert bekommen.
 * 
 * @author Christian Bargmann <christian.bargmann@haw-hamburg.de>
 * @version 05.02.2017
 * @see datapatterns.rowdatagateway
 * @since 05.02.2017 , 22:15:39
 *
 */
public class RowDataGateway {

	private boolean isDeleted = false;

	private int produktId;
	private String produkt;
	private int lagerNo;
	private float preis;
	private String beschreibung;

	/**
	 * Statische Methode, die eine neue Instanz eines RowDataGateways
	 * zurueckgibt.
	 * 
	 * @param produkt
	 * @param lagerNo
	 * @param preis
	 * @param beschreibung
	 * @return
	 */
	public static RowDataGateway hinzufuegen(String produkt, int lagerNo, float preis, String beschreibung) {
		// INSERT INTO produkt ausfuehren.
		// produktid abholen, wenn sie ueber ein Autoincrement-Feld erzeugt
		// wurde.
		int produktId = 1;
		// Gateway erzeugen oder alternativ Finder benutzen um Datensatz zu
		// lesen.
		RowDataGateway g = new RowDataGateway();
		g.setProdukt(produkt);
		g.setBeschreibung(beschreibung);
		g.setLagerNo(lagerNo);
		g.setPreis(preis);
		g.setProduktId(produktId);

		return g;
	}

	/**
	 * Loescht den aktuellen Datensatz.
	 * 
	 * @throws SQLException
	 */
	public void loeschen() throws SQLException {
		if (isDeleted) {
			throw new SQLException("Der Datensatz ist bereits geloescht und kann nicht erneut geloescht werden.");
		}

		// DELETE FROM produkt WHERE produktId = getProduktId();
		isDeleted = true;
	}

	/**
	 * Aktualisiert den aktuellen Datensatz.
	 * 
	 * @throws SQLException
	 */
	public void aktualisieren() throws SQLException {
		if (isDeleted) {
			throw new SQLException("Der Datensatz ist schon geloescht und kannn nicht mehr veraendert werden.");
		}

		// UPDATE produkt set Produkt=?, LagerNo=?, Preis=?,Beschreibung=? WHERE
		// ProduktId =?

		// Parameter aus dem aktuellen Datensatz setzen und ausfuehren.
	}

	/**
	 * Getter-Methode zu produktId. Ermöglicht es einem Klienten, den Wert der
	 * Exemplarvariablen produktId abzufragen.
	 *
	 * @return the produktId
	 */
	public int getProduktId() {
		return produktId;
	}

	/**
	 * Setter-Methode zu produktId. Ermöglicht es dem Klienten, den Wert der
	 * Exemplarvariablen produktId zu setzen.
	 *
	 * @param produktId
	 *            the produktId to set
	 */
	public void setProduktId(int produktId) {

		this.produktId = produktId;
	}

	/**
	 * Getter-Methode zu produkt. Ermöglicht es einem Klienten, den Wert der
	 * Exemplarvariablen produkt abzufragen.
	 *
	 * @return the produkt
	 */
	public String getProdukt() {
		return produkt;
	}

	/**
	 * Setter-Methode zu produkt. Ermöglicht es dem Klienten, den Wert der
	 * Exemplarvariablen produkt zu setzen.
	 *
	 * @param produkt
	 *            the produkt to set
	 */
	public void setProdukt(String produkt) {
		assert produkt != null : "Vorbedingung verletzt: produkt != null!";

		this.produkt = produkt;
	}

	/**
	 * Getter-Methode zu lagerNo. Ermöglicht es einem Klienten, den Wert der
	 * Exemplarvariablen lagerNo abzufragen.
	 *
	 * @return the lagerNo
	 */
	public int getLagerNo() {
		return lagerNo;
	}

	/**
	 * Setter-Methode zu lagerNo. Ermöglicht es dem Klienten, den Wert der
	 * Exemplarvariablen lagerNo zu setzen.
	 *
	 * @param lagerNo
	 *            the lagerNo to set
	 */
	public void setLagerNo(int lagerNo) {

		this.lagerNo = lagerNo;
	}

	/**
	 * Getter-Methode zu preis. Ermöglicht es einem Klienten, den Wert der
	 * Exemplarvariablen preis abzufragen.
	 *
	 * @return the preis
	 */
	public float getPreis() {
		return preis;
	}

	/**
	 * Setter-Methode zu preis. Ermöglicht es dem Klienten, den Wert der
	 * Exemplarvariablen preis zu setzen.
	 *
	 * @param preis
	 *            the preis to set
	 */
	public void setPreis(float preis) {

		this.preis = preis;
	}

	/**
	 * Getter-Methode zu beschreibung. Ermöglicht es einem Klienten, den Wert
	 * der Exemplarvariablen beschreibung abzufragen.
	 *
	 * @return the beschreibung
	 */
	public String getBeschreibung() {
		return beschreibung;
	}

	/**
	 * Setter-Methode zu beschreibung. Ermöglicht es dem Klienten, den Wert der
	 * Exemplarvariablen beschreibung zu setzen.
	 *
	 * @param beschreibung
	 *            the beschreibung to set
	 */
	public void setBeschreibung(String beschreibung) {
		assert beschreibung != null : "Vorbedingung verletzt: beschreibung != null!";

		this.beschreibung = beschreibung;
	}

}
