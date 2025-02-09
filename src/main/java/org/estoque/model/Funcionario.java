package org.estoque.model;

public class Funcionario extends  Pessoas{

    private String matricula= "0000000";
    private boolean status= false;

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    //public void cadastroFuncionario (){}; foi criado na classe FuncionarioDAO
    public void peqsuisaFuncionario (){};
    public void alterarFuncionario (){};
    public void validarCPF (){};
    public void verificarStatus(){};


}
