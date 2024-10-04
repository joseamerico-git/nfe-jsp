package br.com.doichejunior.model;

import java.util.Objects;

public class ValorUnitario {
    private double comercial;
    private double tributario;

    public ValorUnitario(){}

    public ValorUnitario(double comercial, double tributario) {
        this.comercial = comercial;
        this.tributario = tributario;
    }

    public double getComercial() {
        return comercial;
    }

    public void setComercial(double comercial) {
        this.comercial = comercial;
    }

    public double getTributario() {
        return tributario;
    }

    public void setTributario(double tributario) {
        this.tributario = tributario;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ValorUnitario that = (ValorUnitario) o;
        return Double.compare(comercial, that.comercial) == 0 && Double.compare(tributario, that.tributario) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(comercial, tributario);
    }
}
