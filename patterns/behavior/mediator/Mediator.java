package patterns.behavior.mediator;

/**
 * @author Christian Bargmann <christian.bargmann@haw-hamburg.de>
 * @version 01.02.2017
 * @see patterns.behavior.mediator
 * @since 01.02.2017 , 22:19:04
 *
 */
public interface Mediator {
	
	public void send(String message, Colleague originator);

}
