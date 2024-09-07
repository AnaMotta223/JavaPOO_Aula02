package exercicios_aula2;

import java.util.Scanner;

public class Tabuada {

	//Criar uma classe com o nome Tabuada que exiba o conteúdo conforme abaixo:
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira um número: ");
		Integer numero = sc.nextInt();
		
		System.out.println("+--Resultado--+");
		for(int i = 1; i <= 10; i++) {
			System.out.printf("|%2d x %2d = %3d|\n",numero,i,numero*i);
		}	
		System.out.println("+-------------+");
		sc.close();
	}

}
