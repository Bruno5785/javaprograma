package aula7;

import java.util.Scanner;

public class Exercicios {

	public static void main(String[] args) {
		//media();
		maiorValor()
;
		
	}
	
	public static void maiorValor() {
		int tamanho = 20;
		double v[]= new double [tamanho];
		for (int i=0 ; i<v.length ; i++) {
			v[i] = Math.random() * 100;	
			System.out.printf("%.0f - " , v[i] );
		}
		double maior = v[0];
		for (int i=1 ; i<v.length ; i++) {
			if (v[i] > maior ) maior = v[i];
		}
	
		System.out.printf("\nMaior = %.0f " , maior );
		
		
	}
	
	public static void media() {
	Scanner sc = new Scanner(System.in);
	int tamanho = 5;
	double v[]= new double [tamanho];
	System.out.print("Digite a Sequencia de 5 Numeros: ");
	for (int i=0 ; i<v.length ; i++) {
		v[i] = sc.nextDouble();		
	}
	double soma = 0;
	for (double n: v) {
	soma += n;
	System.out.println("Soma =" + soma);
		}
	}
}
	
	


