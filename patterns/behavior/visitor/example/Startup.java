package patterns.behavior.visitor.example;

/**
 * @author Christian Bargmann <christian.bargmann@haw-hamburg.de>
 * @version 06.12.2016
 * @see
 * @since 06.12.2016 , 14:28:33
 *
 */
public class Startup {

	/**
	 * Testprogramm
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		ItemElement[] items = new ItemElement[] { new Buch(20, "1234"), new Buch(100, "5678"),
				new Obst(10, 2, "Banana"), new Obst(5, 5, "Apple") };

		int total = calculatePrice(items);
		System.out.println("Gesamtkosten = " + total);
	}

	/**
	 * Preiskalkulation
	 * 
	 * @param items
	 * @return
	 */
	private static int calculatePrice(ItemElement[] items) {
		WarenkorbBesucher visitor = new WarenkorbBesucherImpl();
		int sum = 0;
		for (ItemElement item : items) {
			sum = sum + item.accept(visitor);
		}
		return sum;
	}

}
