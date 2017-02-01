package patterns.behavior.templatemethod.example;

/**
 * @author Christian Bargmann <christian.bargmann@haw-hamburg.de>
 * @version 01.02.2017
 * @see patterns.behavior.templatemethod.example
 * @since 01.02.2017 , 20:23:45
 *
 */
public abstract class Spiel {

	abstract void initiiere();

	abstract void starteSpiel();

	abstract void beendeSpiel();

	// Template-Methode
	public final void spiele() {
		initiiere();
		starteSpiel();
		beendeSpiel();
	}

}
