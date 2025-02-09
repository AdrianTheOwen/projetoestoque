package org.estoque.estoque.dao;

import org.estoque.estoque.model.Funcionario;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.estoque.estoque.conexao.ConnectionFactory;
import org.estoque.estoque.model.Pessoas;
import org.estoque.estoque.util.Util;

public class FuncionarioDAO extends Pessoas {
    Util util = new Util();

    public void cadastroFuncionario(Funcionario funcionario) throws SQLException {
        String sql = "INSERT INTO funcionario (dataEntrada,nome,CPF,matricula) VALUES (?,?,?,?)";
        Connection connection = null;
        PreparedStatement pstm = null;
        try {
            try {
                //Cria a conexão com o Banco de dados
                connection = ConnectionFactory.createConnectionToMySQL();
                //Cria uma preparação para executar QUERY SQL
                pstm = connection.prepareStatement(sql);
                //Adiciona valores no banco
                pstm.setDate(1,util.formatarData(new Date(funcionario.getData_cadastro().getTime())));
                pstm.setString(2,funcionario.getNome());
                pstm.setString(3,funcionario.getCPF());
                pstm.setString(4,funcionario.getMatricula());

                //Executa o comando no Banco
                pstm.execute();

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
