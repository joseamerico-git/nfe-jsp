package br.com.doichejunior.model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Teste {

    public static void main(String[] args) {
        //Lista de notas
        List<Item> itens = new ArrayList<Item>();
        Item item = new Item();
        item.setCodigo("1");
        item.setDescricao("NOTA FISCAL EMITIDA EM AMBIENTE DE HOMOLOGACAO - SEM VALOR FISCAL");
        item.setNcm("06029090");
        item.setCest("0123456");
        item.setCfop("5101");
        item.setValorUnitrio(new ValorUnitario(4.6, 4.6));

        itens.add(item);

        //buscar cep
        Endereco endereco = new Endereco();
        endereco.setTipoLogradouro("Avenida");
        endereco.setLogradouro("AVENIDA DUQUE DE CAXIAS");
        endereco.setNumero("882");
        endereco.setBairro("CENTRO");
        endereco.setCodigoCidade("4115200");
        endereco.setDescricaoCidade("MARINGA");
        endereco.setEstado("PR");
        endereco.setCep("87020025");

        // Get destinatário
        Destinatario destinatario = new Destinatario();

        destinatario.setCpfCnpj("08114280956");
        destinatario.setRazaoSocial("NF-E EMITIDA EM AMBIENTE DE HOMOLOGACAO - SEM VALOR FISCAL");
        destinatario.setEmail("contato@tecnospeed.com.br");
        destinatario.setEndereco(endereco);

        //Get emitente
        Emitente emitente = new Emitente();
        emitente.setCpfCnpj("08187168000160");

        //Bean da nota
        NfE nfE = new NfE();
        nfE.setIdIntegracao("XXXYY99999");
        nfE.setPresencial('1');
        nfE.setConsumidorFinal(true);
        nfE.setNatureza("OPERAÇÃO INTERNA");
        nfE.setEmitente(emitente);
        nfE.setDestinatario(destinatario);

        nfE.setItens(itens);
       System.out.println(nfE.toString());

/*
        try {

            BufferedReader br = new BufferedReader(new FileReader("c:\\file.json"));

            //Converte String JSON para objeto Java
            Informacoes obj = gson.fromJson(br, Informacoes.class);

            System.out.println(obj);

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
*/
    }
}