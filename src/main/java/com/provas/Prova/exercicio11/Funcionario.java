package com.provas.Prova.exercicio11;


public class Funcionario {

    private Double salarioAtual;
    private Double novoSalario;
    private Double valorAumento;
    private Integer porcentagemAumento;

    public void setSalarioAtual(Double salarioAtual) {
        this.salarioAtual = salarioAtual;
    }

    public Double getNovoSalario() {
        return novoSalario;
    }

    public Double getValorAumento() {
        return valorAumento;
    }

    public Integer getPorcentagemAumento() {
        return porcentagemAumento;
    }

    public void calcularAumento() {
        if (this.salarioAtual <= 1000.00) {
            this.porcentagemAumento = 20;
        } else if (this.salarioAtual <= 3000.00) {
            this.porcentagemAumento = 15;
        } else if (this.salarioAtual <= 8000.00) {
            this.porcentagemAumento = 10;
        } else {
            this.porcentagemAumento = 5;
        }

        this.valorAumento = this.salarioAtual * (this.porcentagemAumento / 100.0);
        this.novoSalario = this.salarioAtual + this.valorAumento;
    }
}
