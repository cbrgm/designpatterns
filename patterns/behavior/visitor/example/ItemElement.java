package patterns.behavior.visitor.example;

/**
 * @author Christian Bargmann <christian.bargmann@haw-hamburg.de>
 * @version 06.12.2016
 * @see
 * @since 06.12.2016 , 14:30:11
 *
 */
public interface ItemElement {

	/**
	 * Accept-Methode für Warenelemente
	 * 
	 * @param visitor
	 * @return
	 */
	public int accept(WarenkorbBesucher visitor);

}
