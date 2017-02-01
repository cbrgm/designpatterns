package patterns.structural.facade.example;

/**
 * @author Christian Bargmann <christian.bargmann@haw-hamburg.de>
 * @version 01.02.2017
 * @see patterns.structural.facade
 * @since 01.02.2017 , 20:30:13
 *
 */
public class Startup {

	public static void main(String[] args) {

		LagerFassade fassade = new LagerFassade();
		
		fassade.alleLagerFuellen(10);
		fassade.TeileEntnehmen(3);
	}

}
