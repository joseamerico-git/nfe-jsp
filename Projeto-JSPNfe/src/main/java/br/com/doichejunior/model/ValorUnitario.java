package br.com.doichejunior.model;

import java.util.Objects;

public class ValorUnitario {
    private double comercial;
    private double tributavel;

    public ValorUnitario(){}

    public ValorUnitario(double comercial, double tributavel) {
        this.comercial = comercial;
        this.tributavel = tributavel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ValorUnitario that = (ValorUnitario) o;
        return Double.compare(comercial, that.comercial) == 0 && Double.compare(tributavel, that.tributavel) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(comercial, tributavel);
    }
}
