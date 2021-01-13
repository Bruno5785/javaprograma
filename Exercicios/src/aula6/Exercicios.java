package aula6;

import javax.swing.JOptionPane;

public class Exercicios {

	public static void main(String[] args) {
		//repeteNome();
		//calculadora();
		somaAteNumero();
		//somaAteNumeroComBreak();
		//somaAteNumeroWhile();
		
	}

	public static void repeteNome() {
	String nome = JOptionPane.showInputDialog("Nome: ");
	String  str = JOptionPane.showInputDialog("Quantidade: ");
	int qtde = Integer.parseInt(str);
	for (int cont = 1 ; qtde >= cont ; cont++) {
		System.out.println(cont + " nome ");
		}
	}

	
	
	
	

	public static void calculadora () {
		String  str = JOptionPane.showInputDialog("Imprimi a tabuada do numero: ");
		int num = Integer.parseInt(str);
		for (int cont = 0 ;  10 >= cont ; cont++) {
			System.out.println(num + " x " + cont + " = " + num*cont);
			
		}
	}
	
	
	
	
	
	
	public static void somaAteNumero() {
		String  str = JOptionPane.showInputDialog("Soma até: ");
		int num = Integer.parseInt(str);
		int soma = 0;
		
		for (int cont = 1 ; num >= cont ; cont++) {
			soma = soma + cont;	
			System.out.print(cont );
			if (cont<num) System.out.print(" + ");
		}
		System.out.println( " = " + soma);
		
	}
		
		
	public static void somaAteNumeroWhile() {
		String  str = JOptionPane.showInputDialog("Produto até");
		int num = Integer.parseInt(str);
		int total = 1; 
		int cont = 1 ; 
		while (num >= cont) {
			total = total * cont;
			System.out.print(cont);
			if (cont<num) System.out.print(" * ");
			cont++;
			
		}
		
		System.out.println(" = " + total);
			
			 
		
		
	}
	
	
	

}

