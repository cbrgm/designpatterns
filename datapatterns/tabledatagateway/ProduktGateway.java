package datapatterns.tabledatagateway;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * @author Christian Bargmann <christian.bargmann@haw-hamburg.de>
 * @version 05.02.2017
 * @see datapatterns.tabledatagateway
 * @since 05.02.2017 , 01:20:56
 *
 */
public class ProduktGateway implements TableDataGateway {

	/**
	 * Ueberschreiben der Methode hole in der Klasse TableDataGateway. Fuer
	 * Details zur Implementierung siehe:
	 * 
	 * @see datapatterns.tabledatagateway.TableDataGateway#hole(int)
	 */
	@Override
	public Produkt hole(int id) {
		String connectionString = "jdbc:sqlserver://localhost:1433;databaseName=NAMEHIER;integratedSecurity=true;"; // Verbindungsstring
																													// abaendern.
		String sql = "SELECT * FROM produkt WHERE ProduktId =?";
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;

		try {
			// JDBC Treibername abaendern je nach verwendeter Datenbank

			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			conn = DriverManager.getConnection(connectionString);
			stmt.setInt(1, id);
			rs = stmt.executeQuery();
			return getProduktFromResultSet(rs);

		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			if (rs != null)
				try {
					rs.close();
				} catch (Exception e2) {
					e2.printStackTrace();
				}

			if (stmt != null)
				try {
					stmt.close();
				} catch (Exception e2) {
					e2.printStackTrace();
				}

			if (conn != null)
				try {
					conn.close();
				} catch (Exception e2) {
					e2.printStackTrace();
				}
		}
		return null;
	}

	/**
	 * Private Hilfsmethode zum erzeugen von Objekten aus dem Resultset der
	 * Datenquelle.
	 * 
	 * @param rs
	 * @return
	 * @throws SQLException
	 */
	private Produkt getProduktFromResultSet(ResultSet rs) throws SQLException {
		if (rs.next()) {
			Produkt p = new Produkt();
			p.setProduktid(rs.getInt("ProduktId"));
			p.setProdukt(rs.getString("Produkt"));
			p.setPreis(rs.getFloat("Preis"));
			p.setLagerNo(rs.getInt("LagerNo"));
			p.setBeschreibung(rs.getString("Beschreibung"));
			return p;
		} else {
			throw new RuntimeException("Id nicht gefunden!");
		}
	}

	/**
	 * Ueberschreiben der Methode suche in der Klasse TableDataGateway. Fuer
	 * Details zur Implementierung siehe:
	 * 
	 * @see datapatterns.tabledatagateway.TableDataGateway#suche(java.lang.String)
	 */
	@Override
	public ArrayList<Produkt> suche(String sqlstring) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * Ueberschreiben der Methode hinzufuegen in der Klasse TableDataGateway.
	 * Fuer Details zur Implementierung siehe:
	 * 
	 * @see datapatterns.tabledatagateway.TableDataGateway#hinzufuegen(java.lang.Object)
	 */
	@Override
	public void hinzufuegen(Object object) {
		// TODO Auto-generated method stub

	}

	/**
	 * Ueberschreiben der Methode loeschen in der Klasse TableDataGateway. Fuer
	 * Details zur Implementierung siehe:
	 * 
	 * @see datapatterns.tabledatagateway.TableDataGateway#loeschen(int)
	 */
	@Override
	public void loeschen(int id) {
		// TODO Auto-generated method stub

	}

	/**
	 * Ueberschreiben der Methode aktualisieren in der Klasse TableDataGateway.
	 * Fuer Details zur Implementierung siehe:
	 * 
	 * @see datapatterns.tabledatagateway.TableDataGateway#aktualisieren(java.lang.Object)
	 */
	@Override
	public void aktualisieren(Object object) {
		// TODO Auto-generated method stub

	}

}
