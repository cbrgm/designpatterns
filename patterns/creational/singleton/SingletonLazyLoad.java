package patterns.creational.singleton;

/**
 * @author Christian Bargmann <christian.bargmann@haw-hamburg.de>
 * @version 08.12.2016
 * @see singletonpattern
 * @since 08.12.2016 , 00:44:13
 *
 */
public class SingletonLazyLoad {

	// Field hält Referenz auf einzigartige Instanz
	private static SingletonLazyLoad instance;

	// Privater Konstruktur verhindert Instanziierung durch Client
	private SingletonLazyLoad() {
	}

	// Stellt Einzigartigkeit sicher. Liefert Exemplar an Client.
	// Hier: Unsynchronisierte Lazy-Loading-Variante
	public static SingletonLazyLoad getInstance() {
		if (instance == null) {
			instance = new SingletonLazyLoad();
		}
		return instance;
	}

	// logic code
}