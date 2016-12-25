package patterns.creational.builder;

/**
 * @author Christian Bargmann <christian.bargmann@haw-hamburg.de>
 * @version 08.12.2016
 * @see builderpattern
 * @since 08.12.2016 , 01:36:29
 *
 */
public class Director {

	// Attribute sind unveränderbar!
	private final int _requiredIntAttribute1;
	private final String _requiredStringAttribute2;

	private final int _optionalIntAttribute1;
	private final String _optionalStringAttribute2;

	/**
	 * Konstruktor fuer neue Exemplare der Klasse Director.
	 * 
	 * @param builder
	 */
	private Director(Builder builder) {
		this._requiredIntAttribute1 = builder._requiredIntAttribute1;
		this._requiredStringAttribute2 = builder._requiredStringAttribute2;
		this._optionalIntAttribute1 = builder._optionalIntAttribute1;
		this._optionalStringAttribute2 = builder._optionalStringAttribute2;
	}

	/**
	 * Getter-Methode zu _requiredIntAttribute1. Ermöglicht es einem Klienten,
	 * den Wert der Exemplarvariablen _requiredIntAttribute1 abzufragen.
	 *
	 * @return the _requiredIntAttribute1
	 */
	public int get_requiredIntAttribute1() {
		return _requiredIntAttribute1;
	}

	/**
	 * Getter-Methode zu _requiredStringAttribute2. Ermöglicht es einem
	 * Klienten, den Wert der Exemplarvariablen _requiredStringAttribute2
	 * abzufragen.
	 *
	 * @return the _requiredStringAttribute2
	 */
	public String get_requiredStringAttribute2() {
		return _requiredStringAttribute2;
	}

	/**
	 * Getter-Methode zu _optionalIntAttribute1. Ermöglicht es einem Klienten,
	 * den Wert der Exemplarvariablen _optionalIntAttribute1 abzufragen.
	 *
	 * @return the _optionalIntAttribute1
	 */
	public int get_optionalIntAttribute1() {
		return _optionalIntAttribute1;
	}

	/**
	 * Getter-Methode zu _optionalStringAttribute2. Ermöglicht es einem
	 * Klienten, den Wert der Exemplarvariablen _optionalStringAttribute2
	 * abzufragen.
	 *
	 * @return the _optionalStringAttribute2
	 */
	public String get_optionalStringAttribute2() {
		return _optionalStringAttribute2;
	}

	/**
	 * Ueberschreiben der Methode toString in der Klasse Director. Fuer Details
	 * zur Implementierung siehe:
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return " Objekt 1: " + _requiredIntAttribute1 + " " + _requiredStringAttribute2 + " " + _optionalIntAttribute1
				+ " " + _optionalStringAttribute2;

	}

	/**
	 * Innere Builder-Klasse zum dynamischen erzeugen von Director-Elementen
	 * 
	 * @author Christian Bargmann <christian.bargmann@haw-hamburg.de>
	 * @version 08.12.2016
	 * @see builderpattern
	 * @since 08.12.2016 , 01:55:05
	 *
	 */
	public static class Builder {

		// Erforderliche Attribute als Final im Builder-Konstruktor
		private final int _requiredIntAttribute1;
		private final String _requiredStringAttribute2;

		// Optionale Attrbute nicht als Final
		private int _optionalIntAttribute1;
		private String _optionalStringAttribute2;

		/**
		 * Konstruktor fuer neue Exemplare der Klasse Builder.
		 * 
		 * @param requiredIntAttribute
		 * @param requiredStringAttribute
		 */
		public Builder(int requiredIntAttribute, String requiredStringAttribute) {
			this._requiredIntAttribute1 = requiredIntAttribute;
			this._requiredStringAttribute2 = requiredStringAttribute;
		}

		public Builder withOptionalInt(int optional) {
			_optionalIntAttribute1 = optional;
			return this;
		}

		public Builder withOptionalString(String optional) {
			_optionalStringAttribute2 = optional;
			return this;
		}

		public Director build() {
			Director director = new Director(this);
			validateDirectorObject(director);
			return director;
		}

		/**
		 * @param director
		 */
		public void validateDirectorObject(Director director) {
			// Code zum pruefen, ob alle Attributwerte gueltig sind und das
			// Programm nicht verletzt.

		}
	}

}
