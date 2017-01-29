package patterns.behavior.visitor.example;

/**
 * @author Christian Bargmann <christian.bargmann@haw-hamburg.de>
 * @version 06.12.2016
 * @see
 * @since 06.12.2016 , 14:31:10
 *
 */
public class Buch implements ItemElement {

	private int price;
	private String isbnNumber;

	public Buch(int cost, String isbn) {
		this.price = cost;
		this.isbnNumber = isbn;
	}

	public int getPrice() {
		return price;
	}

	public String getIsbnNumber() {
		return isbnNumber;
	}

	@Override
	public int accept(WarenkorbBesucher visitor) {
		return visitor.visit(this);
	}

}