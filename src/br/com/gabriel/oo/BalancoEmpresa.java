package br.com.gabriel.oo;
public class BalancoEmpresa {
	
    private ArmazenadorDeDivida armazenador;

    public BalancoEmpresa(ArmazenadorDeDivida armazenador) {
    	this.armazenador = armazenador;
    }
    
    public void registra(Divida divida) {
        this.armazenador.grava(divida);
    }

	public void pagaDivida(Documento documentoCredor, Pagamento pagamento) {
        Divida divida = this.armazenador.recupera(documentoCredor);
        
        if (divida != null) {
            divida.registra(pagamento);
        }
        
        throw new RuntimeException("Dívida não encontrada");
    }
}
