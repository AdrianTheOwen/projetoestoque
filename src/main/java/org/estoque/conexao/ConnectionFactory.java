package org.estoque.conexao;

import java.sql.*;

public class ConnectionFactory {
    private static final String USERNAME ="root";
    private static final String PASSWORD = "root";
    private static final  String DATABASE_URL = "jdbc:mysql://localhost:3306/estoque?serverTimezone=UTC";

    public static Connection createConnectionToMySQL() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection connection =  DriverManager.getConnection(DATABASE_URL,USERNAME,PASSWORD);

        return connection;

    }


}
