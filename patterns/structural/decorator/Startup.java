package patterns.structural.decorator;

/**
 * @author Christian Bargmann <christian.bargmann@haw-hamburg.de>
 * @version 29.01.2017
 * @see patterns.structural.decorator
 * @since 29.01.2017 , 17:01:14
 *
 */
public class Startup {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Component componentA = new ConcreteComponentA();
		componentA.operate();

		componentA = new ConcreteDecoratorA(componentA);

		Component componentB = new ConcreteDecoratorA(
				new ConcreteDecoratorC(new ConcreteDecoratorB(new ConcreteComponentA())));
		componentB.operate();
	}

}
