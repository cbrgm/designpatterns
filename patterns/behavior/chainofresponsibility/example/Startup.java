package patterns.behavior.chainofresponsibility.example;

/**
 * @author Christian Bargmann <christian.bargmann@haw-hamburg.de>
 * @version 02.02.2017
 * @see patterns.behavior.chainofresponsibility
 * @since 02.02.2017 , 16:29:08
 *
 */
public class Startup {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Devenv developmentEnviroment = new Devenv();
		developmentEnviroment.CommandInputHandler("build");
		developmentEnviroment.CommandInputHandler("debug");

	}

}
