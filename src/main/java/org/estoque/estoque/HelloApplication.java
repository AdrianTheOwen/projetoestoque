package org.estoque.estoque;

import javafx.application.Application;
import javafx.stage.Stage;
import org.estoque.estoque.conexao.Conexao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
       // FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
       // Scene scene = new Scene(fxmlLoader.load(), 320, 240);
      //  stage.setTitle("Hello!");
      //  stage.setScene(scene);
      //  stage.show();
    }

    public static void main(String[] args) {
        Conexao conexao = new Conexao();
        System.out.println(conexao.conectarComBancodeDados());

    }
}