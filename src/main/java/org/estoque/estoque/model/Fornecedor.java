package org.estoque.estoque.model;

public class Fornecedor extends Pessoas {

    private String nome_fantasia="";
    private String CNPJ="00000000000100";

    public String getCNPJ() {
        return CNPJ;
    }

    public String setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;


        // Verifica se está vazio ou nulo
        if (this.CNPJ == null || this.CNPJ.trim().isEmpty()) {
            System.out.println("CNPJ invalido incompleto ou vazio");
        }

        // Verifica se tem exatamente 11 dígitos e se são apenas números
        if (!this.CNPJ.matches("\\d{14}")) {
            System.out.println("CNPJ Invalido digitos errado e só pode ser números");
        }


        return this.CNPJ;
    }

    public String getNome_fantasia() {
        return nome_fantasia;
    }

    public void setNome_fantasia(String nome_fantasia) {
        this.nome_fantasia = nome_fantasia;
    }

    public void cadastroFornecedor(){};
    public void pesquisaFornecedor(){};
    public void alterarFornecedor(){};
    public void verificarStatus(){};

}
