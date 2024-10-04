package br.com.doichejunior.model;

import java.util.Objects;

public class Pagamento {
    private boolean aVista;
    private String meio;
    private double valor;

    public Pagamento(boolean aVista, String meio, double valor) {
        this.aVista = aVista;
        this.meio = meio;
        this.valor = valor;
    }
    public Pagamento(){}


    public boolean isaVista() {
        return aVista;
    }

    public void setaVista(boolean aVista) {
        this.aVista = aVista;
    }

    public String getMeio() {
        return meio;
    }

    public void setMeio(String meio) {
        this.meio = meio;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pagamento pagamento = (Pagamento) o;
        return aVista == pagamento.aVista && Double.compare(valor, pagamento.valor) == 0 && Objects.equals(meio, pagamento.meio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(aVista, meio, valor);
    }
}
