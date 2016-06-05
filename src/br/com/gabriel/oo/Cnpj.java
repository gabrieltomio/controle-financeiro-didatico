package br.com.gabriel.oo;

public class Cnpj implements Documento {

	private String valor;

	public Cnpj(String valorInicial) {
		this.valor = valorInicial;
	}

	@Override
	public int hashCode() {
		return this.valor.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Cnpj)) {
			return false;
		}
		
		Cnpj outro = (Cnpj) obj;
		
		return this.valor.equals(outro.valor);
	}

	@Override
	public boolean ehValido() {
		return true;
	}

	@Override
	public String getValor() {
		return this.valor;
	}
	
	@Override
	public String toString() {
		return this.valor;
	}
}
