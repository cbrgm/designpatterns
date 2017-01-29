package patterns.structural.adapter.example.objectadapter;

/**
 * @author Christian Bargmann <christian.bargmann@haw-hamburg.de>
 * @version 29.01.2017
 * @see patterns.structural.adapter.example.objectadapter
 * @since 29.01.2017 , 16:38:21
 *
 */
public class EnemyRobot {

	public void smashWithHand() {

		System.out.println(this.getClass().getSimpleName() + " Smashing with hands!");
	}

	public void walkForward() {

		System.out.println(this.getClass().getSimpleName() + " walking forward!");
	}

	public void reactToHuman(String human) {

		System.out.println(this.getClass().getSimpleName() + " reacts to " + human);
	}

}
