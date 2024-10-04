package br.com.doichejunior.model;

import java.util.Objects;

public class Item {
    private String codigo;
    private String descricao;
    private String ncm;
    private String cest;
    private String cfop;
    private ValorUnitario valorUnitario;
    private double valor;
    private Tributos tributos;
    public Item(){}
    public Item(Tributos tributos, double valor, ValorUnitario valorUnitrio, String cfop, String cest, String ncm, String descricao, String codigo) {
        this.tributos = tributos;
        this.valor = valor;
        this.valorUnitario = valorUnitrio;
        this.cfop = cfop;
        this.cest = cest;
        this.ncm = ncm;
        this.descricao = descricao;
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getNcm() {
        return ncm;
    }

    public void setNcm(String ncm) {
        this.ncm = ncm;
    }

    public String getCest() {
        return cest;
    }

    public void setCest(String cest) {
        this.cest = cest;
    }

    public String getCfop() {
        return cfop;
    }

    public void setCfop(String cfop) {
        this.cfop = cfop;
    }

    public ValorUnitario getValorUnitrio() {
        return valorUnitario;
    }

    public void setValorUnitrio(ValorUnitario valorUnitrio) {
        this.valorUnitario = valorUnitrio;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Tributos getTributos() {
        return tributos;
    }

    public void setTributos(Tributos tributos) {
        this.tributos = tributos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return Double.compare(valor, item.valor) == 0 && Objects.equals(codigo, item.codigo) && Objects.equals(descricao, item.descricao) && Objects.equals(ncm, item.ncm) && Objects.equals(cest, item.cest) && Objects.equals(cfop, item.cfop) && Objects.equals(valorUnitario, item.valorUnitario) && Objects.equals(tributos, item.tributos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo, descricao, ncm, cest, cfop, valorUnitario, valor, tributos);
    }
}
