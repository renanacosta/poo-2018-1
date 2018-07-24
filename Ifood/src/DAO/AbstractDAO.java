package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public abstract class AbstractDAO<T extends IEntity> implements IDAO<T> {

	private final String url = "jdbc:postgresql://localhost/Ifood";
	private final String username = "postgres";
	private final String password = "postgres";

	private Connection connection;

	public Connection openConnection() {
		try {
			connection = DriverManager.getConnection(url, username, password);
			return connection;

		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

}
