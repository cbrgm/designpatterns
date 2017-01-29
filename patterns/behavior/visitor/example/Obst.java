package patterns.behavior.visitor.example;

/**
 * @author Christian Bargmann <christian.bargmann@haw-hamburg.de>
 * @version 06.12.2016
 * @see
 * @since 06.12.2016 , 14:31:46
 *
 */
public class Obst implements ItemElement {

	private int pricePerKg;
	private int weight;
	private String name;

	public Obst(int priceKg, int wt, String nm) {
		this.pricePerKg = priceKg;
		this.weight = wt;
		this.name = nm;
	}

	public int getPricePerKg() {
		return pricePerKg;
	}

	public int getWeight() {
		return weight;
	}

	public String getName() {
		return this.name;
	}

	@Override
	public int accept(WarenkorbBesucher visitor) {
		return visitor.visit(this);
	}

}
