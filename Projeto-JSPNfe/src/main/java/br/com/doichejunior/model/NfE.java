package model;

import java.util.ArrayList;

public class Nfe{
    public String idIntegracao;
    public String presencial;
    public boolean consumidorFinal;
    public String natureza;
    public Emitente emitente;
    public Destinatario destinatario;
    public ArrayList<Iten> itens;
    public ArrayList<Pagamento> pagamentos;
    public ResponsavelTecnico responsavelTecnico;
}

