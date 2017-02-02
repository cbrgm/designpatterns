package patterns.behavior.chainofresponsibility;

/**
 * @author Christian Bargmann <christian.bargmann@haw-hamburg.de>
 * @version 02.02.2017
 * @see patterns.behavior.chainofresponsibility
 * @since 02.02.2017 , 16:35:42
 *
 */
public class Startup {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Handler handler1 = new ConcreteHandler1();
		Handler handler2 = new ConcreteHandler2();

		handler1.setNextHandler(handler2);

		handler1.handleRequest("hello");
		handler1.handleRequest("my");
		handler1.handleRequest("friend");

	}

}
