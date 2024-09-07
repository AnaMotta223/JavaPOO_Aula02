package testes;

//importado pq estao em pacotes diferentes
import banco.Conta;

public class TesteConta {

	public static void main(String[] args) {
		Conta conta1 = new Conta();
		conta1.numero = 123;
		conta1.titular = "Roni";
		conta1.saldo = 1000.0; //sempre que e double tem ponto
		
		conta1.deposito(500.0);
		conta1.saque(200.0);
		System.out.println(conta1.saldo);
		
		if(conta1.saque(200.)) {
			System.out.println("Saque efetuado com sucesso!");
		}
		else {
			System.out.println("Erro");
		}
	Conta.imprimir();	

	
	}

}
