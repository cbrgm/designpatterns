package patterns.structural.flyweight.example;

/**
 * @author Christian Bargmann <christian.bargmann@haw-hamburg.de>
 * @version 02.02.2017
 * @see patterns.structural.flyweight.example
 * @since 02.02.2017 , 14:41:19
 *
 */
public class Startup {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MessStation station = new MessStation();

		station.ladeMessWerteVonCSV("src/patterns/structural/flyweight/example/messwerte.csv");

	}

}
