package patterns.structural.adapter.example.objectadapter;

/**
 * @author Christian Bargmann <christian.bargmann@haw-hamburg.de>
 * @version 29.01.2017
 * @see patterns.structural.adapter.example.objectadapter
 * @since 29.01.2017 , 16:39:45
 *
 */
public class EnemyTank implements EnemyAttacker {

	private String driver = "";

	/**
	 * Ueberschreiben der Methode fireWeapon in der Klasse EnemyTank. Fuer
	 * Details zur Implementierung siehe:
	 * 
	 * @see patterns.structural.adapter.example.objectadapter.EnemyAttacker#fireWeapon()
	 */
	@Override
	public void fireWeapon() {
		System.out.println(this.getClass().getSimpleName() + " Weapon fired!");

	}

	/**
	 * Ueberschreiben der Methode driveForward in der Klasse EnemyTank. Fuer
	 * Details zur Implementierung siehe:
	 * 
	 * @see patterns.structural.adapter.example.objectadapter.EnemyAttacker#driveForward()
	 */
	@Override
	public void driveForward() {
		System.out.println(this.getClass().getSimpleName() + " Drive forward!");

	}

	/**
	 * Ueberschreiben der Methode assingDriver in der Klasse EnemyTank. Fuer
	 * Details zur Implementierung siehe:
	 * 
	 * @see patterns.structural.adapter.example.objectadapter.EnemyAttacker#assingDriver(java.lang.String)
	 */
	@Override
	public void assingDriver(String driver) {
		System.out.println(this.getClass().getSimpleName() + " " + driver + " is driving now!");

	}

}
