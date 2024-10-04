package br.com.doichejunior.model;

import java.util.List;
import java.util.Objects;

public class NfE {
    private String idIntegracao;
    private char presencial;
    private boolean consumidorFinal;
    private String natureza;
    private Emitente emitente;
    private Destinatario destinatario;
    private List<Item> itens;
    private List<Pagamento> pagametnos;
    private ResponsavelTecnico responsavelTecnico;
    public NfE(){}

    public NfE(String idIntegracao, char presencial, boolean consumidorFinal, String natureza, Emitente emitente, Destinatario destinatario, List<Item> itens, List<Pagamento> pagametnos, ResponsavelTecnico responsavelTecnico) {
        this.idIntegracao = idIntegracao;
        this.presencial = presencial;
        this.consumidorFinal = consumidorFinal;
        this.natureza = natureza;
        this.emitente = emitente;
        this.destinatario = destinatario;
        this.itens = itens;
        this.pagametnos = pagametnos;
        this.responsavelTecnico = responsavelTecnico;
    }

    public String getIdIntegracao() {
        return idIntegracao;
    }

    public void setIdIntegracao(String idIntegracao) {
        this.idIntegracao = idIntegracao;
    }

    public char getPresencial() {
        return presencial;
    }

    public void setPresencial(char presencial) {
        this.presencial = presencial;
    }

    public boolean isConsumidorFinal() {
        return consumidorFinal;
    }

    public void setConsumidorFinal(boolean consumidorFinal) {
        this.consumidorFinal = consumidorFinal;
    }

    public String getNatureza() {
        return natureza;
    }

    public void setNatureza(String natureza) {
        this.natureza = natureza;
    }

    public Emitente getEmitente() {
        return emitente;
    }

    public void setEmitente(Emitente emitente) {
        this.emitente = emitente;
    }

    public Destinatario getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(Destinatario destinatario) {
        this.destinatario = destinatario;
    }

    public List<Item> getItens() {
        return itens;
    }

    public void setItens(List<Item> itens) {
        this.itens = itens;
    }

    public List<Pagamento> getPagametnos() {
        return pagametnos;
    }

    public void setPagametnos(List<Pagamento> pagametnos) {
        this.pagametnos = pagametnos;
    }

    public ResponsavelTecnico getResponsavelTecnico() {
        return responsavelTecnico;
    }

    public void setResponsavelTecnico(ResponsavelTecnico responsavelTecnico) {
        this.responsavelTecnico = responsavelTecnico;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NfE nfE = (NfE) o;
        return presencial == nfE.presencial && consumidorFinal == nfE.consumidorFinal && Objects.equals(idIntegracao, nfE.idIntegracao) && Objects.equals(natureza, nfE.natureza) && Objects.equals(emitente, nfE.emitente) && Objects.equals(destinatario, nfE.destinatario) && Objects.equals(itens, nfE.itens) && Objects.equals(pagametnos, nfE.pagametnos) && Objects.equals(responsavelTecnico, nfE.responsavelTecnico);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idIntegracao, presencial, consumidorFinal, natureza, emitente, destinatario, itens, pagametnos, responsavelTecnico);
    }
}


