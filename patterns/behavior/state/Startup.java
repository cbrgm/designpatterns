package patterns.behavior.state;

/**
 * @author Christian Bargmann <christian.bargmann@haw-hamburg.de>
 * @version 25.12.2016
 * @see patterns.behavior.state
 * @since 25.12.2016 , 23:56:22
 *
 */
public class Startup {

	public static void main(String[] args) {
		Context context = new Context();

		context.operate();
		context.operate();
		context.operate();

		context.operate();
		context.operate();
		context.operate();

		context.operate();
	}

}
