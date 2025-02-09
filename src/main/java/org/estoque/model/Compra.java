package org.estoque.model;

import java.util.Date;

public class Compra {

    private Date data_compra;
    private Date data_pagamento;
    private Double valor_total;

    public Date getData_compra() {
        return data_compra;
    }

    public void setData_compra(Date data_compra) {
        this.data_compra = data_compra;
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

    public void confirmarCompra(){};
    public void calcularTotalComnpra(){};

}
