package com.provas.Prova.exercicio9;


public class Pedido {

    private Integer codigoProduto;
    private Integer quantidade;

    public Integer getCodigoProduto() {
        return codigoProduto;
    }

    public void setCodigoProduto(Integer codigoProduto) {
        this.codigoProduto = codigoProduto;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Double calcularTotal() {
        double precoUnitario;

        switch (this.codigoProduto) {
            case 1:
                precoUnitario = 5.00;
                break;
            case 2:
                precoUnitario = 3.50;
                break;
            case 3:
                precoUnitario = 4.80;
                break;
            case 4:
                precoUnitario = 8.90;
                break;
            case 5:
                precoUnitario = 7.32;
                break;
            default:
                precoUnitario = 0.0;
                break;
        }

        return precoUnitario * this.quantidade;
    }
}
