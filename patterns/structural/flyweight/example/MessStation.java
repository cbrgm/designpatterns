package patterns.structural.flyweight.example;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Christian Bargmann <christian.bargmann@haw-hamburg.de>
 * @version 02.02.2017
 * @see patterns.structural.flyweight.example
 * @since 02.02.2017 , 14:57:20
 *
 */
public class MessStation {

	public void ladeMessWerteVonCSV(String csvDateiname) {
		try {
			BufferedReader br = new BufferedReader(new FileReader(csvDateiname));
			String line = "";
			SensorFabrik sensorFabrik = new SensorFabrik();

			while ((line = br.readLine()) != null) {
				String[] messwertEintrag = line.split(";");
				Sensor sensor = sensorFabrik.gibSensor(messwertEintrag[0]);
				sensor.schreibe(Double.parseDouble(messwertEintrag[1]));
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
