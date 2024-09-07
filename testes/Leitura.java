package testes;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Leitura {

	//tudo que é static nao precisa criar objeto; pode ser chamada a qualquer momento
	
	public static void main(String[] args) {
		//leitura de dados com o scanner
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira seu nome: ");
		String nome = sc.next();
		System.out.println("Boa noite, "+nome);
		
		
		System.out.println("Insira sua idade: ");
		Integer idade = sc.nextInt(); //next p int
		
		System.out.println("Insira seu salário: ");
		Double salario = sc.nextDouble(); //next p double	
		sc.close(); //quando usa o scanner tem que fechar - leitura de arquivos
		
		
		String nome2 = JOptionPane.showInputDialog("Digite seu nome: ");
		//%s formata p string %d formata pra int %.numf formata pra double com n casas
		

	}

}
