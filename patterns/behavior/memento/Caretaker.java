package patterns.behavior.memento;

import java.util.Stack;

/**
 * @author Christian Bargmann <christian.bargmann@haw-hamburg.de>
 * @version 01.02.2017
 * @see patterns.behavior.memento
 * @since 01.02.2017 , 23:06:17
 *
 */
public class Caretaker {

	Stack<Memento> states = new Stack<Memento>();

	/**
	 * Speichert ein Abbild des internen Zustandes eines Objektes (Originator)
	 * 
	 * @param memento
	 */
	public void createSnapshot(Memento memento) {
		System.out.println("Speichere Zustand");
		states.push(memento);
	}

	/**
	 * Laedt den letzten Speicherzustand eines Objektes (Originator)
	 * 
	 * @return memento
	 */
	public Memento loadLastSnapshot() {
		System.out.println("Lade letzten Speicherpunkt.");
		return states.pop();

	}

}
