package org.estoque.estoque.conexao;

import java.sql.*;

public class Conexao {

    public String conectarComBancodeDados(){
        String mensagem ="";
        String url = "jdbc:mysql://localhost:3306/estoque?serverTimezone=UTC";
        String usuario = "root";
        String senha = "root";

        // Tentativa de conexão
        try {
            // Carrega o driver atualizado
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Estabelece a conexão
            try (Connection conexao = DriverManager.getConnection(url, usuario, senha);
                 Statement stmt = conexao.createStatement();
                 ResultSet rsCliente = stmt.executeQuery("SELECT * FROM Pessoa")) {

                // Exibir os resultados do banco
                while (rsCliente.next()) {
                    mensagem = "ID: " + rsCliente.getInt("id") +
                            ", Nome: " + rsCliente.getString("nome");
                }

                mensagem =  "Conexão bem-sucedida!";

            } catch (SQLException e) {
                mensagem =  "Erro ao conectar ao banco de dados: " + e.getMessage();
                e.printStackTrace(); // Exibe detalhes do erro
            }
        } catch (ClassNotFoundException e) {
            mensagem = "Driver do MySQL não encontrado!";
            e.printStackTrace();
        }
        return mensagem;
    }

}
