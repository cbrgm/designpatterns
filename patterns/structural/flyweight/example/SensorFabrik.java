package patterns.structural.flyweight.example;

import java.util.HashMap;
import java.util.Map;

/**
 * Fliegengewicht-Fabrik
 * 
 * @author Christian Bargmann <christian.bargmann@haw-hamburg.de>
 * @version 02.02.2017
 * @see patterns.structural.flyweight.example
 * @since 02.02.2017 , 14:48:19
 *
 */
public class SensorFabrik {

	private Map<String, Sensor> sensoren = new HashMap<String, Sensor>();

	public Sensor gibSensor(String id) {
		if (!sensoren.containsKey(id)) {
			Sensor sensor = null;
			switch (id) {
			case "TE":
				sensor = new TemperaturSensor(1.012);
				break;

			case "L":
				sensor = new LuftdruckSensor(0.9912);
				break;
			}

			if (sensor == null) {
				throw new RuntimeException("Sensor ID ist unbekannt.");
			}
			sensoren.put(id, sensor);
		}
		return sensoren.get(id);
	}

}
