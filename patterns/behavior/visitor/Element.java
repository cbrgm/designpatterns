package patterns.behavior.visitor;

/**
 * @author Christian Bargmann <christian.bargmann@haw-hamburg.de>
 * @version 29.01.2017
 * @see patterns.behavior.visitor
 * @since 29.01.2017 , 18:07:33
 *
 */
public interface Element {
	
	public void accept(Visitor visitor);

}
