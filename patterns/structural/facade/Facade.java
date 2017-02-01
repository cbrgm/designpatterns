package patterns.structural.facade;

/**
 * Eine Fassade verringerte die Abhängigkeiten des Clients, da die Anzahl der
 * Objekte, die vom Client gehändelt werden müssen, signifikant gesenkt werden
 * kann.
 * 
 * Der Client kann ein komplexes System einfacher verwenden, ohne die Klassen
 * des Systems zu kennen und sich mit ihren mannigfaltigen Schnittstellen
 * auseinander zu setzen. Eine Auseinandersetzung mit der Komplexität des
 * Systems ist nicht mehr notwendig. Stattdessen kann eine einzige
 * wohldefinierte Schnittstelle der Fassade genutzt werden.
 * 
 * @author Christian Bargmann <christian.bargmann@haw-hamburg.de>
 * @version 01.02.2017
 * @see patterns.structural.facade
 * @since 01.02.2017 , 20:34:52
 *
 */
public class Facade {

	SubsystemComponentA _compA = new SubsystemComponentA();
	SubsystemComponentB _compB = new SubsystemComponentB();
	SubsystemComponentC _compC = new SubsystemComponentC();

	/**
	 * Einheitliche Schnittstelle fuer das Ausfuehren von Operation 1
	 * verschiedener Subcomponenten.
	 */
	public void doSubsystemAction1() {
		_compA.action1();
		_compB.action1();
		_compC.action1();

	}

	/**
	 * Einheitliche Schnittstelle fuer das Ausfuehren von Operation 2
	 * verschiedener Subcomponenten.
	 */
	public void doSubsystemAction2() {
		_compA.action2();
		_compB.action2();
		_compC.action2();

	}

	/**
	 * Einheitliche Schnittstelle fuer das Ausfuehren von Operation 3
	 * verschiedener Subcomponenten.
	 */
	public void doSubsystemAction3() {
		_compA.action3();
		_compB.action3();
		_compC.action3();

	}

}
