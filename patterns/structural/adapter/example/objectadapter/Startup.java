package patterns.structural.adapter.example.objectadapter;

/**
 * @author Christian Bargmann <christian.bargmann@haw-hamburg.de>
 * @version 29.01.2017
 * @see patterns.structural.adapter.example.objectadapter
 * @since 29.01.2017 , 16:36:06
 *
 */
public class Startup {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		EnemyRobot robot = new EnemyRobot();
		EnemyAttacker tank = new EnemyTank();
		EnemyAttacker adapter = new EnemyRobotAdapter(robot);

		tank.assingDriver("Paul");
		tank.driveForward();
		tank.fireWeapon();

		adapter.assingDriver("Mark");
		adapter.driveForward();
		adapter.fireWeapon();

	}

}
