package br.com.doichejunior.model;

public class BaseCalculo {
    private double modalidadeDeterminacao;
    private double valor;
    private Integer quantidade;

    public BaseCalculo(){}

    public BaseCalculo(double modalidadeDeterminacao, double valor, Integer quantidade) {
        this.modalidadeDeterminacao = modalidadeDeterminacao;
        this.valor = valor;
        this.quantidade = quantidade;
    }

    public BaseCalculo(double modalidadeDeterminacao, double valor) {
        this.modalidadeDeterminacao = modalidadeDeterminacao;
        this.valor = valor;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public double getModalidadeDeterminacao() {
        return modalidadeDeterminacao;
    }

    public void setModalidadeDeterminacao(double modalidadeDeterminacao) {
        this.modalidadeDeterminacao = modalidadeDeterminacao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
