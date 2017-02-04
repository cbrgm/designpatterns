package datapatterns.unitofwork;

import java.util.ArrayList;
import java.util.List;

/**
 * Diese Klasse entspricht den Datenbank-Kontext. Sie verwaltet alle unsere
 * Entitaeten.
 * 
 * Diese Klasse verwaltet im wesentlichem drei Listen und prueft ob die
 * jeweiligen Vorbedingungen zutreffen. So kann eine Entitaet nur dann
 * hinzugefuegt werden, wenn sie nicht bereits geloescht werden soll. Ausserdem
 * darf sie nicht schon gespeichert worden sein.
 * 
 * @author Christian Bargmann <christian.bargmann@haw-hamburg.de>
 * @version 04.02.2017
 * @see datapatterns.unitofwork
 * @since 04.02.2017 , 16:27:13
 *
 */
public class UnitOfWork {

	private List<EntityBase> _zuLoeschendeObjekte;
	private List<EntityBase> _hinzugefuegteObjekte;
	private List<EntityBase> _zuAenderndeObjekte;

	/**
	 * Konstruktor fuer neue Exemplare der Klasse UnitOfWork.
	 */
	public UnitOfWork() {
		_zuLoeschendeObjekte = new ArrayList<EntityBase>();
		_hinzugefuegteObjekte = new ArrayList<EntityBase>();
		_zuLoeschendeObjekte = new ArrayList<EntityBase>();
	}

	/**
	 * Meldet eine neue, hinzuzufuegendeEntitaet an der UnitOfWork an.
	 * 
	 * @param entity
	 */
	public void registriereNeu(EntityBase entity) {
		assert entity != null : "Vorbedingung verletzt: entity != null";
		assert entity._id == -1 : "Entitaet ist bereits gespeichert worden!";
		assert !_zuAenderndeObjekte.contains(entity) : "Entity ist bereits in Aenderungsliste";
		assert !_hinzugefuegteObjekte.contains(entity) : "Entity ist bereits in Hinzufuegeliste";
		assert !_zuLoeschendeObjekte.contains(entity) : "Entity ist bereits in Loeschliste";

		_hinzugefuegteObjekte.add(entity);
	}

	/**
	 * Meldet eine zu loeschende Entitaet an der UnitOfWork an.
	 * 
	 * @param entity
	 */
	public void registriereGeloescht(EntityBase entity) {
		// Wurde noch gar nicht hinzugefuegt, muss daher nicht physisch
		// geloescht werden.

		if (_hinzugefuegteObjekte.remove(entity)) {
			return;
		}
		// Aenderung ueberfluessig, wird ohnehin geloescht.
		_zuAenderndeObjekte.remove(entity);

		assert entity._id != -1 : "Die Entitaet ist noch nicht gespeichert worden.";
		if (!_zuLoeschendeObjekte.contains(entity)) {
			_zuLoeschendeObjekte.add(entity);
		}
	}

	/**
	 * Meldet eine zu aendernde Entitaet an der UnitOfWork an.
	 * 
	 * @param entity
	 */
	public void registriereGeaendert(EntityBase entity) {
		assert !_zuLoeschendeObjekte.contains(entity) : "Entity ist bereits in Loeschliste";
		assert !_hinzugefuegteObjekte.contains(entity) : "Entity ist bereits in HinzufuegeListe";
		if (!_zuAenderndeObjekte.contains(entity)) {
			_zuAenderndeObjekte.add(entity);
		}
	}

	/**
	 * Fuehrt einen Rollback der UnitOfWork durch.
	 */
	public void rollback() {
		leereListen();
	}

	/**
	 * Der Datenbank-Treiber baut die Verbindung zur Datenbank auf und ueber die
	 * starteTransaktionMethode eine neue Transaktion starten. Dadurch wird das
	 * UnitOfWork-Pattern auf die Datenbank uebertragen.
	 * 
	 * Im Anschluss werden die Aktionen ausgefuehrt, wobei der Treiber jede
	 * Aktion in SQL uebersetzt und der Datenbank uebergibt.
	 * 
	 * Danach wird die Transaktion commited. Wenn es zu einem Fehler kommt wird
	 * die Transaktion abgebrochen (in manchen Faellen wird auch Rollback
	 * aufgerufen und sicherzustellen, dass die Transaktion nicht ein zweites
	 * mal ausgefuehrt wird). Ist es zu keinem Fehler gekommen (Commit
	 * erfolgreich) wird das UnitOfWork-Objekt geleert und kann neue
	 * Loeschungen, Aenderungen und Hinzufuegungen entgegennehmen.
	 */
	public void commit() {
		// DatenbankTreiber treiber = new DatenbankTreiber();
		// treiber.starteTransaktion();
		//
		// for (EntityBase entity : _hinzugefuegteObjekte) {
		// entity._id = treiber.entityHinzufuegen(entity);
		// }
		//
		// for (EntityBase entity : _zuLoeschendeObjekte) {
		// treiber.entityLoeschen(entity);
		// }
		//
		// for (EntityBase entity : _zuAenderndeObjekte) {
		// treiber.entityAendern(entity);
		// }
		//
		// treiber.commitTransaktion();
		// leereListen();
	}

	/**
	 * Listen leeren!
	 */
	private void leereListen() {
		_hinzugefuegteObjekte.clear();
		_zuLoeschendeObjekte.clear();
		_zuAenderndeObjekte.clear();
	}

}
