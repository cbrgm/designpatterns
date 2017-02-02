package patterns.behavior.chainofresponsibility;

/**
 * @author Christian Bargmann <christian.bargmann@haw-hamburg.de>
 * @version 02.02.2017
 * @see patterns.behavior.chainofresponsibility
 * @since 02.02.2017 , 16:37:29
 *
 */
public interface Handler {

	public void handleRequest(String request);

	public void setNextHandler(Handler handler);

}
