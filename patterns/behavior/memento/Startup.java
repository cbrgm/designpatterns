package patterns.behavior.memento;

/**
 * @author Christian Bargmann <christian.bargmann@haw-hamburg.de>
 * @version 01.02.2017
 * @see patterns.behavior.memento
 * @since 01.02.2017 , 22:42:38
 *
 */
public class Startup {

	public static void main(String[] args) {
		Originator object = new Originator(0, 0);
		Caretaker storedSaves = new Caretaker();

		object.process();
		System.out.printf("X-Koordinate ist: %d, Y-Koordinate ist: %d \n", object.getxCoordinate(),
				object.getyCoordinate());

		storedSaves.createSnapshot(object.getMemento());

		object.process();
		System.out.printf("X-Koordinate ist: %d, Y-Koordinate ist: %d \n", object.getxCoordinate(),
				object.getyCoordinate());

		storedSaves.createSnapshot(object.getMemento());

		object.process();
		System.out.printf("X-Koordinate ist: %d, Y-Koordinate ist: %d \n", object.getxCoordinate(),
				object.getyCoordinate());

		storedSaves.createSnapshot(object.getMemento());
		
		System.out.println();
		
		object.setMemento(storedSaves.loadLastSnapshot());

		System.out.printf("X-Koordinate ist: %d, Y-Koordinate ist: %d \n", object.getxCoordinate(),
				object.getyCoordinate());

		object.setMemento(storedSaves.loadLastSnapshot());

		System.out.printf("X-Koordinate ist: %d, Y-Koordinate ist: %d \n", object.getxCoordinate(),
				object.getyCoordinate());

		object.setMemento(storedSaves.loadLastSnapshot());

		System.out.printf("X-Koordinate ist: %d, Y-Koordinate ist: %d \n", object.getxCoordinate(),
				object.getyCoordinate());

	}

}
