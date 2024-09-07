package exercicios_aula2;

import java.util.Scanner;

public class LeDados {
	/*Ler dados de 4 pessoas contendo nome
	  peso e altura e pegar o nome da pessoa com maior
	  peso, altura, media do peso e altura*/
	
	public static void main(String[] args) {
		String nomes[] = {"","","",""};
		Integer pesos[] = {0,0,0,0};
		Double alturas[] = {0.0,0.0,0.0,0.0};
		Double alturamax = 0.0,mediaalt = 0.0,mediapeso = 0.0;
		Integer pesomax = 0;
		Integer indicepeso = 0, indicealtura = 0;
		
		Scanner sc = new Scanner(System.in);
		
		for(int j = 0; j<4; j++) {
			
			System.out.println("Dados pessoa "+ (j+1) + ":\n");
			System.out.println("Insira o nome: ");
			nomes[j] = sc.next();
			
			System.out.println("\nInsira o peso: ");
			pesos[j] = sc.nextInt();
			
			System.out.println("\nInsira a altura: ");
			alturas[j] = sc.nextDouble();
			
		}
		sc.close();
		
		for(int i = 0; i < 4; i++) {
			if(alturas[i] > alturamax) {
				alturamax = alturas[i];
			} 
			if(pesos[i] > pesomax){
				pesomax = pesos[i];
			}
			mediaalt += alturas[i];
			mediapeso += pesos[i];
			
		}
		
		for(int j = 0; j<4; j++) {
			if (pesos[j] == pesomax) {
				indicepeso = j;
				break;
			}
		}
		
		for(int k = 0; k<4; k++) {
			if (alturas[k] == alturamax) {
				indicealtura = k;
				break;
			}
		}

		System.out.println("\nO maior peso é: "+ pesomax + " e pertence a " + nomes[indicepeso]);
		System.out.println("\nA maior altura é: "+ alturamax + " e pertence a " + nomes[indicealtura]);
		System.out.println("\nA média dos pesos é: "+ mediapeso/4);
		System.out.println("\nA média das alturas é: "+ mediaalt/4);
	}
		
	
}
