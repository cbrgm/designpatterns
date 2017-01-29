package patterns.behavior.visitor.example;

/**
 * @author Christian Bargmann <christian.bargmann@haw-hamburg.de>
 * @version 06.12.2016
 * @see
 * @since 06.12.2016 , 14:30:43
 *
 */
public interface WarenkorbBesucher {

	/**
	 * Visitor-Pattern für Buecher
	 * @param buch
	 * @return
	 */
	int visit(Buch buch);

	/**
	 * Visitor-Pattern für Obst
	 * @param buch
	 * @return
	 */
	int visit(Obst frucht);
}
