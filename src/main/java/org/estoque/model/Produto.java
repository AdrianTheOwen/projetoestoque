package org.estoque.model;

public class Produto {

    private String descrição="";
    private int quantidade_itens;
    private Double valor_itens;
    private int quantidade_minima;
    private Double valor_compra;
    private Double valor_venda;
    private Boolean status;

    public String getDescrição() {
        return descrição;
    }

    public void setDescrição(String descrição) {
        this.descrição = descrição;
    }

    public Double getValor_itens() {
        return valor_itens;
    }

    public void setValor_itens(Double valor_itens) {
        this.valor_itens = valor_itens;
    }

    public int getQuantidade_itens() {
        return quantidade_itens;
    }

    public void setQuantidade_itens(int quantidade_itens) {
        this.quantidade_itens = quantidade_itens;
    }

    public Double getValor_compra() {
        return valor_compra;
    }

    public void setValor_compra(Double valor_compra) {
        this.valor_compra = valor_compra;
    }

    public int getQuantidade_minima() {
        return quantidade_minima;
    }

    public void setQuantidade_minima(int quantidade_minima) {
        this.quantidade_minima = quantidade_minima;
    }

    public Double getValor_venda() {
        return valor_venda;
    }

    public void setValor_venda(Double valor_venda) {
        this.valor_venda = valor_venda;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public void cadastraProduto(){};
    public void pesquisarProduto(){};
    public void alterarProduto(){};
    public void verificarStatus(){};

}
