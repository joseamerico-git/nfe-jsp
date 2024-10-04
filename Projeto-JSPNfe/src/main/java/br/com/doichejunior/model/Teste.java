package br.com.doichejunior.model;

import java.util.ArrayList;
import java.util.List;

public class Teste {
    public static void main(String[] args) {

        Item item = new Item();
        //item
        List<Item> itens = new ArrayList<Item>();


        Endereco endereco = new Endereco();
        endereco.setTipoLogradouro("Avenida");
        endereco.setLogradouro("AVENIDA DUQUE DE CAXIAS");
        endereco.setNumero("882");
        endereco.setBairro("CENTRO");
        endereco.setCodigoCidade("4115200");
        endereco.setDescricaoCidade("MARINGA");
        endereco.setEstado("PR");
        endereco.setCep("87020025");

        Destinatario destinatario = new Destinatario();

        destinatario.setCpfCnpj("08114280956");
        destinatario.setRazaoSocial("NF-E EMITIDA EM AMBIENTE DE HOMOLOGACAO - SEM VALOR FISCAL");
        destinatario.setEmail("contato@tecnospeed.com.br");
        destinatario.setEndereco(endereco);

        Emitente emitente = new Emitente("08187168000160");

        NfE nfE = new NfE();
        nfE.setIdIntegracao("XXXYY99999");
        nfE.setPresencial('1');
        nfE.setConsumidorFinal(true);
        nfE.setNatureza("OPERAÇÃO INTERNA");
        nfE.setEmitente(emitente);
        nfE.setDestinatario(destinatario);
        //nfE.setItens();

    }

}
