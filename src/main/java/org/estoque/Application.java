package org.estoque;

import javafx.stage.Stage;
import org.estoque.dao.FornecedorDAO;
import org.estoque.model.Fornecedor;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Date;

public class Application extends javafx.application.Application {
    @Override
    public void start(Stage stage) throws IOException {
       // FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
       // Scene scene = new Scene(fxmlLoader.load(), 320, 240);
      //  stage.setTitle("Hello!");
      //  stage.setScene(scene);
      //  stage.show();
    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        //Funcionario funcionario = new Funcionario();
        //FuncionarioDAO dao = new FuncionarioDAO();

        //funcionario.setData_cadastro(new Date());
        //funcionario.setNome("A vigança do Sifis");
        //funcionario.setCPF("78458745880");
        //funcionario.setMatricula("7654327");

        //dao.cadastroFuncionario(funcionario);

        Fornecedor fornecedor = new Fornecedor();
        FornecedorDAO fornecedorDAO = new FornecedorDAO();
        fornecedor.setData_cadastro(new Date());
        fornecedor.setCNPJ("00000000000300");
        fornecedor.setNome_fantasia("Star wars fantasma");
        fornecedorDAO.cadastroFornecedor(fornecedor);



    }
}