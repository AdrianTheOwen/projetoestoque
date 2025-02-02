package br.com.estoque.model;

public class Funcionario {

    private String matricula= "00";
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

    public void cadastroFuncionario (){};
    public void peqsuisaFuncionario (){};
    public void alterarFuncionario (){};
    public void validarCPF (){};
    public void verificarStatus(){};


}
