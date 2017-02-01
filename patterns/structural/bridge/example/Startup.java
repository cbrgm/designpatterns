package patterns.structural.bridge.example;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Christian Bargmann <christian.bargmann@haw-hamburg.de>
 * @version 02.02.2017
 * @see patterns.structural.bridge
 * @since 02.02.2017 , 00:17:18
 *
 */
public class Startup {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		AbspielGeraet geraet1 = new AbspielGeraet(new CDSpieler());
		geraet1.spieleAb(2);

		AbspielGeraet geraet2 = new AbspielGeraet(new BlueRayPlayer());
		geraet2.spieleAb(5);

		List<Integer> abspielliste = new ArrayList<Integer>();
		abspielliste.add(5);
		abspielliste.add(3);
		abspielliste.add(6);
		abspielliste.add(2);

		ListenAbspielGeraet listengeraet = new ListenAbspielGeraet(new CDSpieler(), abspielliste);
		listengeraet.abspielenUndAusschalten();

	}

}
