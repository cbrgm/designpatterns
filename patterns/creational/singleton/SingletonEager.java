package patterns.creational.singleton;

/**
 * @author Christian Bargmann <christian.bargmann@haw-hamburg.de>
 * @version 08.12.2016
 * @see singletonpattern
 * @since 08.12.2016 , 00:44:13
 *
 */
public class SingletonEager {

	// Field hält Referenz auf einzigartige Instanz
	private static SingletonEager instance = new SingletonEager();

	// Privater Konstruktur verhindert Instanziierung durch Client
	private SingletonEager() {
	}

	// Stellt Einzigartigkeit sicher. Liefert Exemplar an Client.
	// Hier: Synchronisierte Eager-Loading-Variante
	public static SingletonEager getInstance() {
		return instance;
	}

	// logic code
}