package patterns.creational.prototype;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Christian Bargmann <christian.bargmann@haw-hamburg.de>
 * @version 08.12.2016
 * @see abstraction
 * @since 08.12.2016 , 03:01:38
 *
 */
public class PrototypeFactory {
	private static Map<String, Prototype> _prototypeCache = new HashMap<String, Prototype>();

	static {
		_prototypeCache.put("A", new ConcretePrototypeA("CacheObjektA"));
		_prototypeCache.put("B", new ConcretePrototypeB("CacheObjektB"));
	}

	public static Prototype getInstance(final String s) throws CloneNotSupportedException {
		return (Prototype) _prototypeCache.get(s).clone();
	}
}
