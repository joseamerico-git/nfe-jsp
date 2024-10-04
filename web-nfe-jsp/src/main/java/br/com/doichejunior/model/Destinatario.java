package br.com.doichejunior.model;

import java.util.Objects;

public class Destinatario {
    private String cpfCnpj;
    private String razaoSocial;
    private String email;
    private Endereco endereco;
    public Destinatario(){}

    public Destinatario(String cpfCnpj, String razaoSocial, String email, Endereco endereco) {
        this.cpfCnpj = cpfCnpj;
        this.razaoSocial = razaoSocial;
        this.email = email;
        this.endereco = endereco;
    }

    public String getCpfCnpj() {
        return cpfCnpj;
    }

    public void setCpfCnpj(String cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Destinatario that = (Destinatario) o;
        return Objects.equals(cpfCnpj, that.cpfCnpj) && Objects.equals(razaoSocial, that.razaoSocial) && Objects.equals(email, that.email) && Objects.equals(endereco, that.endereco);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpfCnpj, razaoSocial, email, endereco);
    }
}
