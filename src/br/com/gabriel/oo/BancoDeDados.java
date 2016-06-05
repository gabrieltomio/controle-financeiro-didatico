package br.com.gabriel.oo;
import java.util.HashMap;
import java.util.Map;

public class BancoDeDados implements ArmazenadorDeDivida {
	
	private final Map<Documento, Divida> dividas = new HashMap<>();
	
	public void conecta() {
		System.out.println("Conectado");
	}
	
	public void desconecta() {
		System.out.println("Desconectado");
	}
	
	@Override
	public void grava(Divida divida) {
		this.dividas.put(divida.getDocumentoCredor(), divida);
	}
	
	@Override
	public Divida recupera(Documento documento) {
		return this.dividas.get(documento);
	}
}
