package patterns.behavior.templatemethod.example;

/**
 * Statup-Klasse fuer die beispielhafte Benutzung des vorgestellten Patterns
 * durch den Clienten.
 * 
 * @author Christian Bargmann <christian.bargmann@haw-hamburg.de>
 * @version 01.02.2017
 * @see patterns.behavior.templatemethod
 * @since 01.02.2017 , 20:12:10
 *
 */
public class Startup {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		Spiel spiel = new Tennisspiel();
		spiel.spiele();

		spiel = new Fussballspiel();
		spiel.spiele();

	}

}
