package patterns.behavior.state;

/**
 * @author Christian Bargmann <christian.bargmann@haw-hamburg.de>
 * @version 25.12.2016
 * @see patterns.behavior.state
 * @since 25.12.2016 , 23:59:19
 *
 */
public class ConcreteState3 implements State {

	private Context _context;

	/**
	 * Konstruktor fuer neue Exemplare der Klasse ConcreteState1.
	 */
	public ConcreteState3(Context context) {
		this._context = context;
	}

	/**
	 * Ueberschreiben der Methode operate in der Klasse ConcreteState1. Fuer
	 * Details zur Implementierung siehe:
	 * 
	 * @see patterns.behavior.state.State#operate()
	 */
	@Override
	public void operate() {
		// Spezifisches Verhalten im Zustand3
		System.out.println("Kontext befindet sich in Status 3");
		_context.setState(new ConcreteState1(_context));
	}

}
