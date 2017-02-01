package patterns.structural.facade;

/**
 * @author Christian Bargmann <christian.bargmann@haw-hamburg.de>
 * @version 01.02.2017
 * @see patterns.structural.facade
 * @since 01.02.2017 , 20:30:13
 *
 */
public class Startup {

	public static void main(String[] args) {

		Facade fassade = new Facade();

		System.out.println();
		fassade.doSubsystemAction1();

		System.out.println();
		fassade.doSubsystemAction2();

		System.out.println();
		fassade.doSubsystemAction3();
	}

}
