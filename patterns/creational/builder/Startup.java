package patterns.creational.builder;

import builderpattern.Director;

/**
 * @author Christian Bargmann <christian.bargmann@haw-hamburg.de>
 * @version 08.12.2016
 * @see startup
 * @since 08.12.2016 , 02:02:36
 *
 */
public class Startup {

	public static void main(String[] args) {
		Director element = new Director.Builder(10, "Test").withOptionalInt(50).withOptionalString("Zweite Option")
				.build();

		System.out.println(element.toString());
	}

}
