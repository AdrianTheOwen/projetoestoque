package br.com.estoque.model;

import java.util.Date;

public class Venda {
    private Date data_venda;
    private Date data_pagamento;
    private Double valor_total;

    public Date getData_venda() {
        return data_venda;
    }

    public void setData_venda(Date data_venda) {
        this.data_venda = data_venda;
    }

    public Date getData_pagamento() {
        return data_pagamento;
    }

    public void setData_pagamento(Date data_pagamento) {
        this.data_pagamento = data_pagamento;
    }

    public Double getValor_total() {
        return valor_total;
    }

    public void setValor_total(Double valor_total) {
        this.valor_total = valor_total;
    }
    public void confirmarVenda(){};
    public void calcularTotalVenda(){};
}
