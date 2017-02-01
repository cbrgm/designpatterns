package patterns.structural.facade;

/**
 * SubsystemComponent repraesentiert eine Komponente in einem zusammenhaengenden
 * Subsystem, welche verschiedene Operationen anbietet und durch die Fassade
 * fuer den Clienten leichter nutzbar gemacht werden kann.
 * 
 * @author Christian Bargmann <christian.bargmann@haw-hamburg.de>
 * @version 01.02.2017
 * @see patterns.structural.facade
 * @since 01.02.2017 , 20:36:48
 *
 */
public class SubsystemComponentB {

	/**
	 * Beispieloperation von einer Komponente eines zusammenhaengenden
	 * Subsystems.
	 */
	public void action1() {
		System.out.println(this.getClass().getSimpleName() + " Fuehre Operation1 aus");
	}

	/**
	 * Beispieloperation von einer Komponente eines zusammenhaengenden
	 * Subsystems.
	 */
	public void action2() {
		System.out.println(this.getClass().getSimpleName() + " Fuehre Operation2 aus");
	}

	/**
	 * Beispieloperation von einer Komponente eines zusammenhaengenden
	 * Subsystems.
	 */
	public void action3() {
		System.out.println(this.getClass().getSimpleName() + " Fuehre Operation3 aus");
	}

}
