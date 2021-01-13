package aula6;

import javax.swing.JOptionPane;

public class Repeticao {

	public static void main(String[] args) {
		//mostraNumeros();
		//calculadoraWhile ();
		calculadoraDoWhile();
		
	}
	
	
	/*
	 * ler um inteiro qtde e imprimir de 1 até qtde
	 * Exemplo
	 * 	in: imprimir ate: 6
	 * out: 1 - 2 - 3 - 4 - 5 - 6
	 */
	
	public static void mostraNumeros() {
		String str = JOptionPane.showInputDialog("Imprimir até: ");
		int qtde = Integer.parseInt(str);
		for (int cont = 1 ; qtde >= cont ; cont++) {
			System.out.print(cont + " - ");
			
		}
	}
	
	
	public static void calculadoraFor () {
		String  str = JOptionPane.showInputDialog("Imprimi a tabuada do numero: ");
		int num = Integer.parseInt(str);
		for (int cont = 0 ; 10 >= cont ; cont++) { 
			System.out.println(num + " x " + cont + " = " + num*cont);
			
		}
	}
	
	
	public static void calculadoraWhile () {
		String  str = JOptionPane.showInputDialog("Imprimi a tabuada do numero: ");
		int num = Integer.parseInt(str);
		int cont = 0 ; 
		while (10 >= cont) { 
			System.out.println(num + " x " + cont + " = " + num*cont);
			 cont++;
		}
		
	}
	
	public static void calculadoraDoWhile () {
		String  str = JOptionPane.showInputDialog("Imprimi a tabuada do numero: ");
		int num = Integer.parseInt(str);
		int cont = 0 ; 
		do {
			System.out.println(num + " x " + cont + " = " + num*cont);
			 cont++;
		} while (10 >= cont);
		
		
	}
}
