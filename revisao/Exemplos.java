package revisao;

public class Exemplos {

	public static void main(String[] args) {
		int i = 1;
		int par = 0,impar = 0;
		String[] times = {"Vasco","Flamengo", "Botafogo", "Fluminense"};
				
		
		//Contador de números impares e pares de 1 a 20
		for(int k = 1; k<=20; k++) {
			if(k%2 == 0) {
				System.out.println("O número " + k + " é par");
				par += 1;
			}
			else
			{
				System.out.println("O número " + k + " é impar");
				impar += 1;
			}
		}
		System.out.println("Pares: "+ par + " Impares: " + impar + "\n");
		
		
		//percorrendo a lista com for
		for (int j = 0; j < times.length; j++) {
			if (j >=1 && j<=2) {
				continue;  //não para o contador, força a contagem a continuar pelo for
			}
			System.out.println(times[j]);
		}
		
		System.out.println("\n*******Foreach********");
		
		//outro jeito de usar o for para percorrer lista 
		for (String t : times) {
			System.out.println(t);
		}
			
		
		//estrutura de repeticao while
		while (i <= 10) {
			System.out.println(i);
			i++;
		}

		//estrutura de repeticao dowhile
		do {
			System.out.println(i);
			i++;
		} while (i<=10);
		
		for (int j = 1; j<= 10; j++) {
			System.out.println(j);
		}
	}

}
