
//Gerente eh um Funcionario ou Gerente herda da classe do funcionario, assina o contrato Autenticável, eh um autenticavel.
public class Gerente extends Funcionario implements Autenticavel {
	
	private AutenticaUtil autenticador;

	public Gerente() {
		this.autenticador = new AutenticaUtil();
	}			
		
	public double getBonificacao() {
		System.out.println("Chamando o metodo bonificacao do Gerente");
		return super.getSalario();
	}
	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);		
	}

	@Override
	public boolean autentica(int senha) {		
		return this.autenticador.autentica(senha);	
		}	
}
