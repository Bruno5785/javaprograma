package aula7;

import java.util.Scanner;

import aula6.Mat;

public class Exercicios {

	public static void main(String[] args) {
		//media();
		maiorValor();
		//maior();
		
		
	}
	
	public static void maiorValor() {
		int tamanho = 20;
		double v[]= new double [tamanho];
		for (int i=0 ; i<v.length ; i++) {
			v[i] = Math.random() * 100;	
			System.out.printf("%.0f - " , v[i] );
		}
		double menor = v[0];
		for (int i=1 ; i<v.length ; i++) {
			if (v[i] > menor ) menor = v[i];
		}
	
		System.out.printf("\nMenor aqui no metodo = %.0f " , menor );
		
		System.out.printf("\nMaior com o metodo da classe mat = %.0f " ,Mat.maior(v));
		
		System.out.printf("\nMenor com o metodo da classe mat = %.0f " ,Mat.menor(v));
		
	}
	
	public static void media() {
	Scanner sc = new Scanner(System.in);
	int tamanho = 5;
	double v[]= new double [tamanho];
	System.out.printf("Digite a Sequencia de 5 Numeros: ");
	for (int i=0 ; i<v.length ; i++) {
		v[i] = sc.nextDouble();		
	}
	double soma = 0;
	for (double n: v) {
	soma += n;
	}
	System.out.println(" Média = "  + (soma / tamanho));
		
	}
}
	
	


