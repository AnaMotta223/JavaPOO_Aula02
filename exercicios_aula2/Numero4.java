package exercicios_aula2;

import javax.swing.JOptionPane;

public class Numero4 {
	/*Usando a classe JOptionPane, leia nome, telefone, email e salário do teclado e exiba 
	 as informações digitadas na tela com salário com acréscimo de 10%.*/
	
	public static void main(String[] args) {

		String nome = JOptionPane.showInputDialog("Insira seu nome: "); 
		String telefone = JOptionPane.showInputDialog("\nInsira seu telefone: "); 
		String email = JOptionPane.showInputDialog("\nInsira seu email: ");
		Double salario = Double.parseDouble(JOptionPane.showInputDialog("Insira seu salário: "));
		
		JOptionPane.showMessageDialog(null, "Nome: "+nome+"\nTelefone: "+telefone+"\nEmail: "+email+"\nSalário: "+(salario += salario*0.1));
	}
	
}
