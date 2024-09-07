package oo;

public class TesteCliente {
	public static void main(String[] args) {		
		//Cria o objeto em memoria e preenche os atributos
		
		Cliente c = new Cliente();
		c.nome = "Maria";
		c.cpf = "123";
		c.telefone = "223456789";
		
		System.out.println(c.nome + c.cpf + c.telefone);
				
	}
}
