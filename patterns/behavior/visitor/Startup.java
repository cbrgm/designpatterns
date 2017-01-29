package patterns.behavior.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Christian Bargmann <christian.bargmann@haw-hamburg.de>
 * @version 29.01.2017
 * @see patterns.behavior.visitor
 * @since 29.01.2017 , 18:00:35
 *
 */
public class Startup {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Element> elementList = new ArrayList<Element>();

		elementList.add(new ConcreteElementA());
		elementList.add(new ConcreteElementB());

		Visitor visitor = new ConcreteVisitor();

		for (Element e : elementList) {
			e.accept(visitor);
		}

	}

}
