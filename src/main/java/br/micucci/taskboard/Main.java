package br.micucci.taskboard;



import br.micucci.taskboard.persistence.migration.MigrationStrategy;

import java.sql.SQLException;


import static br.micucci.taskboard.persistence.config.ConnectionConfig.getConnection;


public class Main {

    public static void main(String[] args) throws SQLException {
        try(var connection = getConnection()){
            new MigrationStrategy(connection).executeMigration();
        }

    }

}