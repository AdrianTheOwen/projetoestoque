package org.estoque.estoque;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.estoque.estoque.model.*;
import org.estoque.estoque.util.Util;

import java.io.IOException;

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
        Pessoas pessoas= new Pessoas();
        Compra compra= new Compra();
        Fornecedor fornecedor= new Fornecedor();
        ItemCompra itemCompra= new ItemCompra();
        Produto produto= new Produto();
        ItemVenda itemVenda= new ItemVenda();
        Venda venda= new Venda();
        Util util= new Util();



        System.out.println("Coloque seu CPF"+pessoas.getCPF() );
        System.out.println("Coloque seu CNPJ"+fornecedor.getCNPJ());
      //  launch();
    }
}