package patterns.behavior.strategy;

/**
 * @author Christian Bargmann <christian.bargmann@haw-hamburg.de>
 * @version 29.01.2017
 * @see patterns.behavior.strategy
 * @since 29.01.2017 , 17:47:20
 *
 */
public class Startup {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Context context = new Context();

		context.executeA();
		context.setBehaviorA(new ConcreteStrategyA2());
		context.executeA();

		context.executeB();
		context.setBehaviorB(new ConcreteStrategyB2());
		context.executeB();

	}

}
