package br.com.doichejunior.model;

import java.util.Objects;

public class Emitente {
    public String getCpfCnpj() {
        return cpfCnpj;
    }

    private String cpfCnpj;

    public void setCpfCnpj(String cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }

    public Emitente(){}
    public Emitente(String cpfCnpj){
        this.cpfCnpj = cpfCnpj;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Emitente emitente = (Emitente) o;
        return Objects.equals(cpfCnpj, emitente.cpfCnpj);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(cpfCnpj);
    }




}
