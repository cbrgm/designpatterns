package patterns.structural.proxy;

/**
 * @author Christian Bargmann <christian.bargmann@haw-hamburg.de>
 * @version 02.02.2017
 * @see patterns.structural.proxy
 * @since 02.02.2017 , 15:13:36
 *
 */
public class Startup {

	public static void main(String[] args) {
		Proxy proxy = new Proxy(new RealSubject());

		proxy.operation();
		proxy.operation();

		proxy.printLog();

		proxy.operation();
		proxy.operation(); // Ab hier Ausfuehrung nicht mehr moeglich.
		proxy.operation();

		proxy.printLog();

	}

}
