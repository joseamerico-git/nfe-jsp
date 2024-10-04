package br.com.doichejunior.model;

public class Cofins {

    private String cst;

    private BaseCalculo baseCalculo;
    private double aliquota;
    private double valor;

    public Cofins(){}


    public Cofins(String cst, BaseCalculo baseCalculo, double valor, double aliquota) {
        this.cst = cst;
        this.baseCalculo = baseCalculo;
        this.valor = valor;
        this.aliquota = aliquota;
    }

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
}
