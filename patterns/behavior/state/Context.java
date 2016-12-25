package patterns.behavior.state;

/**
 * @author Christian Bargmann <christian.bargmann@haw-hamburg.de>
 * @version 25.12.2016
 * @see patterns.behavior.state
 * @since 25.12.2016 , 23:57:59
 *
 */
public class Context {

	private State _state;

	public Context() {
		// Initialer Zustand und weiterer contextabhaengiger Code...
		_state = new ConcreteState1(this);
	}

	/**
	 * Fuehrt eine Operation aus, dessen Verhalten im Status gekapselt ist.
	 */
	public void operate() {
		_state.operate();
	}

	/**
	 * Ueberfuehrt den Context in einen anderen Status
	 * 
	 * @param state
	 */
	public void setState(State state) {
		this._state = state;
	}
}
