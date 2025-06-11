package com.provas.Prova.exercicio5;

public class TrocoFalta {

    public Double valorProduto;

    public Double quantidadeComprada;

    public Double valorRecebido;

    public Double getValorProduto() {
        return valorProduto;
    }

    public void setValorProduto(Double valorProduto) {
        this.valorProduto = valorProduto;
    }

    public Double getQuantidadeComprada() {
        return quantidadeComprada;
    }

    public void setQuantidadeComprada(Double quantidadeComprada) {
        this.quantidadeComprada = quantidadeComprada;
    }

    public Double getValorRecebido() {
        return valorRecebido;
    }

    public void setValorRecebido(Double valorRecebido) {
        this.valorRecebido = valorRecebido;
    }

    public Double verificarTroco(Double valorProduto, Double quantidadeComprada, Double valorRecebido){
        return (valorProduto*quantidadeComprada)-valorRecebido;
    }
}
