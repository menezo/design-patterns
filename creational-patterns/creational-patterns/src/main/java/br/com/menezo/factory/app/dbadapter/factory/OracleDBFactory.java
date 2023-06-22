package br.com.menezo.factory.app.dbadapter.factory;

import br.com.menezo.factory.app.dbadapter.db.DB;
import br.com.menezo.factory.app.dbadapter.db.OracleDB;

public class OracleDBFactory implements DBFactory {
    @Override
    public DB getDatabase() {
        return new OracleDB();
    }
}
