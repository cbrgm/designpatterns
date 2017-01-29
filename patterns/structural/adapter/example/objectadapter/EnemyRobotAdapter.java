package patterns.structural.adapter.example.objectadapter;

/**
 * @author Christian Bargmann <christian.bargmann@haw-hamburg.de>
 * @version 29.01.2017
 * @see patterns.structural.adapter.example.objectadapter
 * @since 29.01.2017 , 16:37:44
 *
 */
public class EnemyRobotAdapter implements EnemyAttacker {

	EnemyRobot robot;

	/**
	 * Konstruktor fuer neue Exemplare der Klasse EnemyRobotAdapter.
	 */
	public EnemyRobotAdapter(EnemyRobot robot) {
		this.robot = robot;
	}

	/**
	 * Ueberschreiben der Methode fireWeapon in der Klasse EnemyAttacker. Fuer
	 * Details zur Implementierung siehe:
	 * 
	 * @see patterns.structural.adapter.example.objectadapter.EnemyAttacker#fireWeapon()
	 */
	@Override
	public void fireWeapon() {
		robot.smashWithHand();

	}

	/**
	 * Ueberschreiben der Methode driveForward in der Klasse EnemyAttacker. Fuer
	 * Details zur Implementierung siehe:
	 * 
	 * @see patterns.structural.adapter.example.objectadapter.EnemyAttacker#driveForward()
	 */
	@Override
	public void driveForward() {
		robot.walkForward();

	}

	/**
	 * Ueberschreiben der Methode assingDriver in der Klasse EnemyAttacker. Fuer
	 * Details zur Implementierung siehe:
	 * 
	 * @see patterns.structural.adapter.example.objectadapter.EnemyAttacker#assingDriver(java.lang.String)
	 */
	@Override
	public void assingDriver(String driver) {
		robot.reactToHuman(driver);

	}

}
