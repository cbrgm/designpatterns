package patterns.structural.bridge;

/**
 * @author Christian Bargmann <christian.bargmann@haw-hamburg.de>
 * @version 02.02.2017
 * @see patterns.structural.bridge
 * @since 02.02.2017 , 00:48:58
 *
 */
public class Startup {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Abstraction object = new Abstraction(new ConcreteImplA());
		object.operation();

		object = new Abstraction(new ConcreteImplB());
		object.operation();

		System.out.println();

		SpecialAbstraction specObject = new SpecialAbstraction(new ConcreteImplA());
		specObject.loopOperation(5);

	}

}
