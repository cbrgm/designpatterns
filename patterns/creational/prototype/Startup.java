package patterns.creational.prototype;

import abstraction.ConcretePrototypeA;
import abstraction.PrototypeFactory;

/**
 * @author Christian Bargmann <christian.bargmann@haw-hamburg.de>
 * @version 08.12.2016
 * @see startup
 * @since 08.12.2016 , 03:08:01
 *
 */
public class Startup {

	public static void main(String[] args) {

		try {

			PrototypeFactory factory = new PrototypeFactory();
			ConcretePrototypeA prototype;
			prototype = (ConcretePrototypeA) factory.getInstance("A");

			System.out.println(prototype.get_attribute());

		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
