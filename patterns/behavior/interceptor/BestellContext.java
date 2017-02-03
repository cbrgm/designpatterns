package patterns.behavior.interceptor;

import java.util.Date;

/**
 * Mit diesem Objekt arbeitet der Interceptor. Es wird vom BestellFramework
 * erzeugt und spiegelt einfach die Bestellung wieder.
 * 
 * @author Christian Bargmann <christian.bargmann@haw-hamburg.de>
 * @version 03.02.2017
 * @see patterns.behavior.interceptor
 * @since 03.02.2017 , 18:04:05
 *
 */
public class BestellContext {

	private String bestelldaten;
	private Date dateTimeStamp;
	private boolean isVerschluesselt;

	public BestellContext(String bestelldaten, Date dateTimeStamp, boolean isVerschluesselt) {
		this.bestelldaten = bestelldaten;
		this.dateTimeStamp = dateTimeStamp;
		this.isVerschluesselt = isVerschluesselt;
	}

	/**
	 * Getter-Methode zu bestelldaten. Ermöglicht es einem Klienten, den Wert
	 * der Exemplarvariablen bestelldaten abzufragen.
	 *
	 * @return the bestelldaten
	 */
	public String getBestelldaten() {
		return bestelldaten;
	}

	/**
	 * Setter-Methode zu bestelldaten. Ermöglicht es dem Klienten, den Wert der
	 * Exemplarvariablen bestelldaten zu setzen.
	 *
	 * @param bestelldaten
	 *            the bestelldaten to set
	 */
	public void setBestelldaten(String bestelldaten) {
		assert bestelldaten != null : "Vorbedingung verletzt: bestelldaten != null!";

		this.bestelldaten = bestelldaten;
	}

	/**
	 * Getter-Methode zu dateTimeStamp. Ermöglicht es einem Klienten, den Wert
	 * der Exemplarvariablen dateTimeStamp abzufragen.
	 *
	 * @return the dateTimeStamp
	 */
	public Date getDateTimeStamp() {
		return dateTimeStamp;
	}

	/**
	 * Getter-Methode zu isVerschluesselt. Ermöglicht es einem Klienten, den
	 * Wert der Exemplarvariablen isVerschluesselt abzufragen.
	 *
	 * @return the isVerschluesselt
	 */
	public boolean benoetigtVerschluesselung() {
		return isVerschluesselt;
	}

}
