import br.com.estoque.model.*;
import br.com.estoque.util.Util;

import java.util.Date;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
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
    }
}