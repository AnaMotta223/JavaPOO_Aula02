package exercicios_aula2;

import javax.swing.JOptionPane;

public class Numero5 {
	//Crie um programa que leia um número inteiro e imprima o seu antecessor e seu sucessor.
	
	public static void main(String[] args) {
		Integer numero;
		
		numero = Integer.parseInt(JOptionPane.showInputDialog("Insira um número: "));
		JOptionPane.showMessageDialog(null, "O antecessor do número é "+(numero-1)+" e o sucessor é "+(numero+1));

	}

}
