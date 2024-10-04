package br.com.doichejunior.model;

import java.util.Objects;

public class Endereco {
    private String tipoLogradouro;
    private String logradouro;
    private String bairro;
    private String codigoCidade;
    private String descricaoCidade;
    private String estado;
    private String numero;
    private String cep;

    public Endereco(String tipoLogradouro, String logradouro, String bairro, String codigoCidade, String descricaoCidade, String estado, String numero, String cep) {
        this.tipoLogradouro = tipoLogradouro;
        this.logradouro = logradouro;
        this.bairro = bairro;
        this.codigoCidade = codigoCidade;
        this.descricaoCidade = descricaoCidade;
        this.estado = estado;
        this.numero = numero;
        this.cep = cep;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Endereco(){}




    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getDescricaoCidade() {
        return descricaoCidade;
    }

    public void setDescricaoCidade(String descricaoCidade) {
        this.descricaoCidade = descricaoCidade;
    }

    public String getCodigoCidade() {
        return codigoCidade;
    }

    public void setCodigoCidade(String codigoCidade) {
        this.codigoCidade = codigoCidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getTipoLogradouro() {
        return tipoLogradouro;
    }

    public void setTipoLogradouro(String tipoLogradouro) {
        this.tipoLogradouro = tipoLogradouro;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Endereco endereco = (Endereco) o;
        return Objects.equals(tipoLogradouro, endereco.tipoLogradouro) && Objects.equals(logradouro, endereco.logradouro) && Objects.equals(bairro, endereco.bairro) && Objects.equals(codigoCidade, endereco.codigoCidade) && Objects.equals(descricaoCidade, endereco.descricaoCidade) && Objects.equals(estado, endereco.estado) && Objects.equals(numero, endereco.numero) && Objects.equals(cep, endereco.cep);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tipoLogradouro, logradouro, bairro, codigoCidade, descricaoCidade, estado, numero, cep);
    }
}


