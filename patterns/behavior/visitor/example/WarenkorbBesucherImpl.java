package patterns.behavior.visitor.example;

/**
 * @author Christian Bargmann <christian.bargmann@haw-hamburg.de>
 * @version 06.12.2016
 * @see
 * @since 06.12.2016 , 14:34:04
 *
 */
public class WarenkorbBesucherImpl implements WarenkorbBesucher {

	/**
	 * Ueberschreiben der Methode visit in der Klasse WarenkorbBesucherImpl.
	 * Fuer Details zur Implementierung siehe:
	 * 
	 * @see visitor.WarenkorbBesucher#visit(implementation.Buch)
	 */
	@Override
	public int visit(Buch book) {
		int cost = 0;
		// 5€ Rabatt wenn der Preis grösser als 50 ist
		if (book.getPrice() > 50) {
			cost = book.getPrice() - 5;
		} else
			cost = book.getPrice();
		System.out.println("Buch ISBN:" + book.getIsbnNumber() + " Kosten =" + cost);
		return cost;
	}

	/**
	 * Ueberschreiben der Methode visit in der Klasse WarenkorbBesucherImpl.
	 * Fuer Details zur Implementierung siehe:
	 * 
	 * @see visitor.WarenkorbBesucher#visit(implementation.Obst)
	 */
	@Override
	public int visit(Obst frucht) {
		int cost = frucht.getPricePerKg() * frucht.getWeight();
		System.out.println(frucht.getName() + " Kosten = " + cost);
		return cost;
	}

}
