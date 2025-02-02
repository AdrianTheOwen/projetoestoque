package br.com.estoque.model;

public class ItemVenda {

    private int quantidade_itens;
    private Double valor_itens;

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
    public void calcularTotalitemVenda(){};

}
