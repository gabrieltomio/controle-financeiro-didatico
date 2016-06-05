package br.com.gabriel.oo;

public interface ArmazenadorDeDivida {
	void grava(Divida divida);
	Divida recupera(Documento documento);
}
