package br.com.menezo.factory.app.dbadapter;

import br.com.menezo.factory.app.dbadapter.db.DB;
import br.com.menezo.factory.app.dbadapter.factory.OracleDBFactory;
import br.com.menezo.factory.app.dbadapter.factory.PostgresDBFactory;

public class Client {

	public static void main(String[] args) {

		DB db = new PostgresDBFactory().getDatabase();
		db.query("SELECT * FROM users");
		db.update("INSERT INTO users VALUES ('User', 25)");

		DB db2 = new OracleDBFactory().getDatabase();
		db2.query("SELECT * FROM users");
		db2.update("INSERT INTO users VALUES ('User', 25)");
	}
}
