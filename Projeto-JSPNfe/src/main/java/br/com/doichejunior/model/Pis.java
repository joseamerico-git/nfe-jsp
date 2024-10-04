package br.com.doichejunior.model;

import java.util.Objects;

public class Pis {
    private String cst;
    private BaseCalculo baseCalculo;
    private double aliquota;

    public String getCst() {
        return cst;
    }

    public void setCst(String cst) {
        this.cst = cst;
    }

    public BaseCalculo getBaseCalculo() {
        return baseCalculo;
    }

    public void setBaseCalculo(BaseCalculo baseCalculo) {
        this.baseCalculo = baseCalculo;
    }

    public double getAliquota() {
        return aliquota;
    }

    public void setAliquota(double aliquota) {
        this.aliquota = aliquota;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    private double valor;

    public Pis(String cst, BaseCalculo baseCalculo, double aliquota, double valor) {
        this.cst = cst;
        this.baseCalculo = baseCalculo;
        this.aliquota = aliquota;
        this.valor = valor;
    }

    Pis(){}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pis pis = (Pis) o;
        return Double.compare(aliquota, pis.aliquota) == 0 && Double.compare(valor, pis.valor) == 0 && Objects.equals(cst, pis.cst) && Objects.equals(baseCalculo, pis.baseCalculo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cst, baseCalculo, aliquota, valor);
    }
}
