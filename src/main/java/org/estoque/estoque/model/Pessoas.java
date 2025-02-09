package org.estoque.estoque.model;

import org.estoque.estoque.util.Util;

import java.util.Date;

public class Pessoas {
       private int ID ;
       private Date data_cadastro ;
       private String nome="não informado";
       private String CPF= "07083242070";
       public Util formatarData= new Util();


       public int getID() {
              return ID;
       }

       public void setID(int ID) {
              this.ID = ID;
       }

       public Date getData_cadastro() {
              return data_cadastro;
       }

       public void setData_cadastro(Date data_cadastro) {
              this.data_cadastro = data_cadastro;
       }

       public String getNome() {
              return nome;
       }

       public void setNome(String nome) {
              this.nome = nome;
       }
       //ter 11 digitos
       // não aceitar branco vazio e texto
       public String getCPF() {

              return CPF;
       }

       public String setCPF(String CPF) {
              this.CPF = CPF;

                     // Verifica se está vazio ou nulo
                     if (this.CPF == null || this.CPF.trim().isEmpty()) {
                        System.out.println("CPF invalido incompleto ou vazio");
                     }

                     // Verifica se tem exatamente 11 dígitos e se são apenas números
                     if (!this.CPF.matches("\\d{11}")) {
                        System.out.println("CPF Invalido digitos errado e só pode ser números");
                     }


             return this.CPF;

       }

       public void pequisarCliente(){
       };
       public void alterarCliente(){};
       public void cadastradaCPF(){};



}
