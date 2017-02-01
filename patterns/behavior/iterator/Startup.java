package patterns.behavior.iterator;

/**
 * @author Christian Bargmann <christian.bargmann@haw-hamburg.de>
 * @version 01.02.2017
 * @see patterns.behavior.iterator
 * @since 01.02.2017 , 20:59:15
 *
 */
public class Startup {

	public static void main(String[] args) {

		ItemArray array = new ItemArray(5);

		array.add(new Item("Item1"));
		array.add(new Item("Item2"));
		array.add(new Item("Item3"));
		array.add(new Item("Item4"));
		array.add(new Item("Item5"));

		Iterator iteratorInstance = array.createIterator();

		while (iteratorInstance.hasNext()) {
			Item element = (Item) iteratorInstance.next();
			System.out.println(element.get_name());
		}

	}

}
