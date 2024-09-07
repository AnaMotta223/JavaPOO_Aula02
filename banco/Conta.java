package banco;

public class Conta {
	//Simulação básica de uma conta bancária
	
	public Integer numero;
	public String titular;
	public Double saldo;
	
	public void deposito(Double valor) {
		if (valor <= 0) {
			System.out.println("Valor Inválido!");
		}
		else {
			saldo += valor;
		}
	}
	
	public boolean saque(Double valor) {
		if (saldo < valor) {
			System.out.println("Saldo insuficiente!");
			return false;
		}
		else {
			saldo -= valor;
			return true;
		}
	}
		
	public static void imprimir() {
		System.out.println("Teste static");
	}
		
	public static void main(String[] args) {
		Conta c = new Conta();
		c.saldo = 100.;
		c.deposito(200.);
		c.saque(500.);
		
	}
	
}

