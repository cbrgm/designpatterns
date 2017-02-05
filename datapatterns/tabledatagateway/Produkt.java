package datapatterns.tabledatagateway;

/**
 * Fachliche Klasse des TableDataGateways. Sie besteht aus einigen Feldern und
 * den zugehoerigen Setter- und Getter- Methoden.
 * 
 * @author Christian Bargmann <christian.bargmann@haw-hamburg.de>
 * @version 05.02.2017
 * @see datapatterns.tabledatagateway
 * @since 05.02.2017 , 01:17:28
 *
 */
public class Produkt {

	private int produktid;
	private String produkt;
	private int lagerNo;
	private float preis;
	private String beschreibung;

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
	 * Getter-Methode zu lagerNo. Ermöglicht es einem Klienten, den Wert der
	 * Exemplarvariablen lagerNo abzufragen.
	 *
	 * @return the lagerNo
	 */
	public int getLagerNo() {
		return lagerNo;
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
	 * Getter-Methode zu produkt. Ermöglicht es einem Klienten, den Wert der
	 * Exemplarvariablen produkt abzufragen.
	 *
	 * @return the produkt
	 */
	public String getProdukt() {
		return produkt;
	}

	/**
	 * Getter-Methode zu produktid. Ermöglicht es einem Klienten, den Wert der
	 * Exemplarvariablen produktid abzufragen.
	 *
	 * @return the produktid
	 */
	public int getProduktid() {
		return produktid;
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

	/**
	 * Setter-Methode zu lagerNo. Ermöglicht es dem Klienten, den Wert der
	 * Exemplarvariablen lagerNo zu setzen.
	 *
	 * @param lagerNo
	 *            the lagerNo to set
	 */
	public void setLagerNo(int lagerNo) {
		assert lagerNo != null : "Vorbedingung verletzt: lagerNo != null!";

		this.lagerNo = lagerNo;
	}

	/**
	 * Setter-Methode zu preis. Ermöglicht es dem Klienten, den Wert der
	 * Exemplarvariablen preis zu setzen.
	 *
	 * @param preis
	 *            the preis to set
	 */
	public void setPreis(float preis) {
		assert preis != null : "Vorbedingung verletzt: preis != null!";

		this.preis = preis;
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
	 * Setter-Methode zu produktid. Ermöglicht es dem Klienten, den Wert der
	 * Exemplarvariablen produktid zu setzen.
	 *
	 * @param produktid
	 *            the produktid to set
	 */
	public void setProduktid(int produktid) {
		assert produktid != null : "Vorbedingung verletzt: produktid != null!";

		this.produktid = produktid;
	}

}
