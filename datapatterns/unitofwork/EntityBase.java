package datapatterns.unitofwork;

/**
 * Typsichere Implementierung fuer beliebige Objekte. Objekte die Mittels des
 * Unit Of Work Patterns verwaltet werden erben von dieser abstrakten
 * Basisklasse.
 * 
 * Die Klasse enthaelt lediglich eine einfache ID zur uebergreifenden
 * Kennzeichnung von Entitaeten, die z.B. dem Primaerschluessel entsprechen
 * kann. Neue Entitaeten erhalten einen Primaerschluessel von -1, was bedeutet,
 * dass sie noch nicht gespeichert wurden.
 * 
 * @author Christian Bargmann <christian.bargmann@haw-hamburg.de>
 * @version 04.02.2017
 * @see datapatterns.unitofwork
 * @since 04.02.2017 , 16:20:07
 *
 */
public abstract class EntityBase {
	public int _id;

	public EntityBase() {
		_id = -1;
	}
}
