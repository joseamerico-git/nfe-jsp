package br.com.doichejunior.model.veiculo;

public class Veiculo {
	
	private Integer tipoOperacao;

	public Integer getTipoOperacao() {
		return tipoOperacao;
	}

	public void setTipoOperacao(Integer tipoOperacao) {
		this.tipoOperacao = tipoOperacao;
	}
	
	
	
	/*
	 * 
	 * Authorizations:
      tipoOperacao	
number
1=Venda concessionária 2=Faturamento direto para consumidor final 3=Venda direta para grandes consumidores (frotista, governo, ...) 0=Outros

chassi	
string
VIN (código-identificação-veículo)

codigoCor	
string
Código de cada montadora

descricaoCor	
string
Descrição da Cor

potenciaMotor	
number
Potência máxima do motor do veículo em cavalo vapor (CV). (potência-veículo)

cilindradas	
number
Capacidade voluntária do motor expressa em centímetros cúbicos (CC). (cilindradas)

pesoLiquido	
number
Em toneladas - 4 casas decimais

pesoBruto	
number
Peso Bruto Total - em tonelada - 4 casas decimais

numeroSerie	
string
Serial (série)

tipoCombustivel	
number
Utilizar Tabela RENAVAM: 01=Álcool 02=Gasolina 03=Diesel (...) 16=Álcool/Gasolina 17=Gasolina/Álcool/GNV 18=Gasolina/Elétrico

numeroMotor	
string
Número de Motor

capacidadeTracao	
number
CMT-Capacidade Máxima de Tração - em Toneladas 4 casas decimais

distanciaEixos	
string
Distância entre eixos

anoModelo	
number
Ano Modelo de Fabricação

anoFabricacao	
number
Ano de Fabricação

tipoPintura	
string
Tipo de Pintura

tipo	
number
Utilizar Tabela RENAVAM, conforme exemplos abaixo: 02=CICLOMOTO 03=MOTONETA 04=MOTOCICLO 05=TRICICLO 06=AUTOMÓVEL 07=MICROÔNIBUS 08=ÔNIBUS 10=REBOQUE 11=SEMIRREBOQUE 13=CAMINHONETA 14=CAMINHÃO 17=C. TRATOR 22=ESP / ÔNIBUS 23=MISTO / CAM 24=CARGA/CAM

especie	
number
Utilizar Tabela RENAVAM: 1=PASSAGEIRO 2=CARGA 3=MISTO 4=CORRIDA 5=TRAÇÃO 6=ESPECIAL

condicaoVin	
string
Informa-se o veículo tem VIN (chassi) remarcado. R=Remarcado; N=Normal

condicao	
number
1=Acabado; 2=Inacabado; 3=Semiacabado

codigoModelo	
string
Utilizar Tabela RENAVAM

codigoCorDenatran	
number
Segundo as regras de pré-cadastro do DENATRAN: 01=AMARELO 02=AZUL 03=BEGE 04=BRANCA 05=CINZA 06=DOURADA 07=GRENÁ 08=LARANJA 09=MARROM 10=PRATA 11=PRETA 12=ROSA 13=ROXA 14=VERDE 15=VERMELHA 16=FANTASIA

lotacaoMaxima	
number
Quantidade máxima permitida de passageiros sentados, inclusive o motorista.

restricao	
number
0=Não há; 1=Alienação Fiduciária; 2=Arrendamento Mercantil; 3=Reserva de Domínio; 4=Penhor de Veículos; 9=Outras.
	 */

}
