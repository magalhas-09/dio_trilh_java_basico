package entities;

public class conta {

	public int numero;
	public String agencia;
	public String nome;
	public double saldo;
	
	
	public String toString() {
		return
			 "Olá "
			+ nome
			+ ", obrigado por criar uma conta em nosso banco, sua agência é "
			+ agencia
			+ ", conta "
			+ numero
			+ " e seu saldo "
			+ String.format("%.2f", saldo)
			+ " já está disponível para saque.";
			
	}
	
}
