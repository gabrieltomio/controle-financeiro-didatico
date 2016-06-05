package br.com.gabriel.oo;

public class Divida {
	
	private double total;
	private String credor;
	private Documento documentoCredor;
	private Pagamentos pagamentos = new Pagamentos();

	public Documento getDocumentoCredor() {
		return this.documentoCredor;
	}

	public void setCnpjCredor(Documento documento) {
		this.documentoCredor = documento;
	}

	public String getCredor() {
		return this.credor;
	}

	public double getTotal() {
		return this.total;
	}

	public void registra(Pagamento pagamento) {
		this.pagamentos.registra(pagamento);
	}

	public double valorAPagar() {
		return this.total - this.pagamentos.getValorPago();
	}

	public void setCredor(String credor) {
		this.credor = credor;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public double getValorPago() {
		return this.pagamentos.getValorPago();
	}

}