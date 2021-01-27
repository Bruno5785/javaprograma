package aula06;

import javax.swing.JOptionPane;

public class Exercicios {

	public static void main(String[] args) {
		//repeteNome();
		//tabuada();
		//somaAteNumero();
		//somaAteNumeroComBreak();
		produtoAteNumero();
	}

	/*
	 * leia um nome e uma qtde e imprima o nome qtde vezes 
	 * Exemplo: in: Nome: Linus Torvalds 
	 *          in: Quantidade: 3 
	 *          out: Linus Torvalds 
	 *               Linus Torvalds 
	 *               Linus Torvalds
	 */
	public static void repeteNome() {
		// ler nome
		String nome = JOptionPane.showInputDialog("Nome:");
		// ler qtde
		String str = JOptionPane.showInputDialog("Quantidade: ");
		int qtde = Integer.parseInt(str);
		// imprimir o nome a quantidade de vezes solicitada
		for (int cont=1 ; cont<=qtde ; cont++) {
			System.out.println(cont + ") " + nome);
		} 		
	}
	
	/*
	 * ler 1 n�mero inteiro e imprimir sua tabuada.
	 * Exemplo: in: Imprimir tabuada de qual n�mero: 3
	 * 			out: 3 X 0 = 0
	 * 				 3 X 1 = 3
	 * 				 3 X 2 = 6
	 * 				 3 X 10 = 10
	 */
	public static void tabuada() {
		String str = JOptionPane.showInputDialog("Imprimir a tabuada do n�mero: ");
		int num = Integer.parseInt(str);
		for (int cont=0 ; cont<=10 ; cont++) {
			System.out.println(num + " X " + cont + " = " + num*cont);
		} 	
	}
	
	/*
	 * leia um inteiro e informe a soma de 1 at� o valor digitado
	 * Exemplo: in: N�mero: 5
	 			out: 1 + 2 + 3 + 4 + 5 = 15
	 */
	public static void somaAteNumero() {
		// ler inteiro
		String str = JOptionPane.showInputDialog("Soma At�: ");
		int num = Integer.parseInt(str);
		// calcular somat�ria de 1 at� o n�mero
		int soma = 0;
		for (int cont=1 ; cont<=num ; cont++) {
			soma = soma + cont;
			System.out.print(cont);
			if (cont<num) System.out.print(" + ");
		}
		System.out.println(" = " + soma);
	}

	/*
	 * leia um inteiro e informe a soma de 1 at� o valor digitado utilizando o break
	 * Exemplo: in: N�mero: 5
	 			out: 1 + 2 + 3 + 4 + 5 = 15
	 */
	public static void somaAteNumeroComBreak() {
		// ler inteiro
		String str = JOptionPane.showInputDialog("Soma At�: ");
		int num = Integer.parseInt(str);
		// calcular somat�ria de 1 at� o n�mero
		int soma = 0;
		for (int cont=1 ; cont<=num ; cont++) {
			soma = soma + cont;
			System.out.print(cont);
			if (cont == num) break;  // encerra o la�o de repeti��o
			System.out.print(" + ");
		}
		System.out.println(" = " + soma);
	}

	/*
	 * ler um inteiro e informar a produto de 1 at� o n�mero utilizando o while
	 * Exemplo: in: N�mero: 5
	 			out: 1 * 2 * 3 * 4 * 5 = 120 = 5!
	 */
	public static void produtoAteNumero() {
		// ler inteiro
		String str = JOptionPane.showInputDialog("Produto At�: ");
		int num = Integer.parseInt(str);
		// calcular produt�rio de 1 at� o n�mero
		int total = 1;
		int cont = 1;
		while (cont<=num) {
			total = total * cont;
			System.out.print(cont);
			if (cont<num) System.out.print(" * ");
			cont++;
		}
		System.out.println(" = " + total);
	}
	
}

