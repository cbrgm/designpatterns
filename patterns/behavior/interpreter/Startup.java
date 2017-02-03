package patterns.behavior.interpreter;

/**
 * @author Christian Bargmann <christian.bargmann@haw-hamburg.de>
 * @version 03.02.2017
 * @see patterns.behavior.interpreter
 * @since 03.02.2017 , 19:49:23
 *
 */
public class Startup {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Kontext kontext = new Kontext();
		kontext.getVariablen().put("ort", "Muenchen");

		String testdaten = "Ort:<ort> Telefonnummer: +4989[4,#]-[5,#]-[3,#]";

		Parser parser = new Parser();

		TestdatenAusdruck ausdruck = parser.parse(testdaten);
		System.out.println(ausdruck.interpretiere(kontext));
		ausdruck.interpretiere(kontext);

	}

}
