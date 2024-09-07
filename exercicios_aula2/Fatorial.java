package exercicios_aula2;

public class Fatorial {
	/*Liste os fatoriais de 1 a 10. Deve ser exibido da seguinte maneira:

	O Fatorial de 1 é : 1

	O Fatorial de 2 é : 2

	O Fatorial de 3 é : 6*/
	
	public static void main(String[] args) {
		
		for(int i = 1; i<=10; i++) {
			System.out.println("O fatorial de " + i + " é: " + fatorial(i));
		}
		
	}
	
	public static int fatorial(int numero) {
		if (numero == 0 || numero == 1) {
			return 1;
		}
			return numero * fatorial(numero-1);
	}

}
