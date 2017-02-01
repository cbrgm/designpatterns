package patterns.behavior.memento;

import java.util.Random;

/**
 * @author Christian Bargmann <christian.bargmann@haw-hamburg.de>
 * @version 01.02.2017
 * @see patterns.behavior.memento
 * @since 01.02.2017 , 23:12:01
 *
 */
public class Originator {

	private int _xCoordinate;
	private int _yCoordinate;

	public Originator(int x, int y) {
		_xCoordinate = x;
		_yCoordinate = y;
	}

	/**
	 * Getter-Methode zu _xCoordinate. Ermöglicht es einem Klienten, den Wert
	 * der Exemplarvariablen _xCoordinate abzufragen.
	 *
	 * @return the _xCoordinate
	 */
	public int getxCoordinate() {
		return _xCoordinate;
	}

	/**
	 * Getter-Methode zu _yCoordinate. Ermöglicht es einem Klienten, den Wert
	 * der Exemplarvariablen _yCoordinate abzufragen.
	 *
	 * @return the _yCoordinate
	 */
	public int getyCoordinate() {
		return _yCoordinate;
	}

	public void process() {
		_xCoordinate = _xCoordinate + new Random().nextInt(5);
		_yCoordinate = _yCoordinate + new Random().nextInt(5);
	}

	/**
	 * Erstellt ein Abbild des internen Zustands des Objektes (Originator).
	 * 
	 * @return
	 */
	public Memento getMemento() {

		MementoInternal state = new MementoInternal();

		state.setxCoordinate(_xCoordinate);
		state.setyCoordinate(_yCoordinate);

		return state;

	}

	/**
	 * Setzt den Zustand zurueck auf das zuvor gespeicherte Abbild des Objektes
	 * (Memento)
	 * 
	 * @param memento
	 */
	public void setMemento(Memento memento) {

		MementoInternal state = (MementoInternal) memento;

		this._xCoordinate = state.getxCoordinate();
		this._yCoordinate = state.getyCoordinate();

	}

	/**
	 * Implementierung der Memento-Klasse als private, statische, interne
	 * Klasse.
	 * 
	 * @author Christian Bargmann <christian.bargmann@haw-hamburg.de>
	 * @version 01.02.2017
	 * @see patterns.behavior.memento
	 * @since 01.02.2017 , 23:19:04
	 *
	 */
	private static class MementoInternal implements Memento {
		private int xCoordinate;
		private int yCoordinate;

		/**
		 * Getter-Methode zu xCoordinate. Ermöglicht es einem Klienten, den Wert
		 * der Exemplarvariablen xCoordinate abzufragen.
		 *
		 * @return the xCoordinate
		 */
		public int getxCoordinate() {
			return xCoordinate;
		}

		/**
		 * Setter-Methode zu xCoordinate. Ermöglicht es dem Klienten, den Wert
		 * der Exemplarvariablen xCoordinate zu setzen.
		 *
		 * @param xCoordinate
		 *            the xCoordinate to set
		 */
		public void setxCoordinate(int xCoordinate) {

			this.xCoordinate = xCoordinate;
		}

		/**
		 * Getter-Methode zu yCoordinate. Ermöglicht es einem Klienten, den Wert
		 * der Exemplarvariablen yCoordinate abzufragen.
		 *
		 * @return the yCoordinate
		 */
		public int getyCoordinate() {
			return yCoordinate;
		}

		/**
		 * Setter-Methode zu yCoordinate. Ermöglicht es dem Klienten, den Wert
		 * der Exemplarvariablen yCoordinate zu setzen.
		 *
		 * @param yCoordinate
		 *            the yCoordinate to set
		 */
		public void setyCoordinate(int yCoordinate) {

			this.yCoordinate = yCoordinate;
		}
	}

}
