package br.com.souzabankI.banco.modelo;

//br.com.souzabankI.banco.modelo.CalculadorDeImposto => FQN
public class CalculadorDeImposto {
	
private double totalImposto;
	
	public void registra(Tributavel t) {
		double valor = t.getValorImposto();
		this.totalImposto += valor;		
	}
	
	public double getTotalImposto() {
		return totalImposto;
	}

}
