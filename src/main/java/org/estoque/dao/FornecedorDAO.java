package org.estoque.dao;

import org.estoque.conexao.ConnectionFactory;
import org.estoque.model.Fornecedor;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import org.estoque.util.Util;
public class FornecedorDAO {
    Util util = new Util();
    public void cadastroFornecedor(Fornecedor fornecedor) throws SQLException {
        String sql = "INSERT INTO Fornecedor (dataCadastro,CNPJ,nomeFantasia) VALUES (?,?,?)";
        Connection connection = null;
        PreparedStatement pstm = null;
        try {
            try {
                //Cria a conexão com o Banco de dados
                connection = ConnectionFactory.createConnectionToMySQL();
                //Cria uma preparação para executar QUERY SQL
                pstm = connection.prepareStatement(sql);
                //Adiciona valores no banco
                pstm.setDate(1,util.formatarData(new Date(fornecedor.getData_cadastro().getTime())));
                pstm.setString(2,fornecedor.getCNPJ());
                pstm.setString(3,fornecedor.getNome_fantasia());

                //Executa o comando no Banco
                pstm.execute();
                System.out.println("Dados salvos com sucesso!!!");

            } catch (SQLException e) {
                System.out.println("Execução não salvos no banco.");
                throw new RuntimeException(e);
            } catch (ClassNotFoundException e) {
                System.out.println("Daos não salvos no banco.");
                throw new RuntimeException(e);
            }
        } finally {
            try{
                if(pstm!=null){
                    pstm.close();
                }
                if (connection!=null){
                    connection.close();
                }
            }catch (Exception e){
                e.printStackTrace();
            }

        }

    }
}
