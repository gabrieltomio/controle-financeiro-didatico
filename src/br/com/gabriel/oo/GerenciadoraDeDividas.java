package br.com.gabriel.oo;

public class GerenciadoraDeDividas {
	
	public void efetua(Divida divida, Pagamento pagamento) {
		divida.registra(pagamento);
	}
}
