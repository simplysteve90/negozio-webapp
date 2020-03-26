package it.dstech.gestionedb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import it.dstech.gestioneprodotti.Prodotto;
import it.dstech.gestioneprodotti.ProdottoVenduto;

public class GestioneDataBase {
	public Connection connessione() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String password = "D4znUUYzIq";
		String username = "bBEWUdmqeI";
		String url = "jdbc:mysql://remotemysql.com:3306/bBEWUdmqeI?useUnicode=true&useLegacyDatetimeCode=false&serverTimezone=UTC&createDatabaseIfNotExist=true&allowPublicKeyRetrieval=true&useSSL=false";
		Connection connessione = DriverManager.getConnection(url, username, password);
		return connessione;

	}
public void stampaProdotti() {
	
	
}
}