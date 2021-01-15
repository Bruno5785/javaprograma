package aula6;

import java.util.Scanner;

public class Mat {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite 2 Inteiros");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(" O MDC é " + mdc (a,b));
		//JOptionPane.showMessageDialog(null," O MDC é "  + mdc(a,b));
		System.out.println(" O MMC é " + mmc (a,b));
		
	}

	public static double maior (double v[]) {
		double maior = v[0];
		for (int i=1 ; i<v.length ; i++) {
			if (v[i] > maior ) maior = v[i];
		}
		return maior;
		
	}
	
	
	public static double menor(double v[]) {
		double menor = v[0];
		for (int i=1 ; i<v.length ; i++) {
			if (v[i] > menor ) menor = v[i];
		
		
		}
		return menor;
	}
	
	public static double soma(double v[]) {
		double soma = 0;
		for (double n: v) {
		soma += n;	
		}
		return soma;
	}
	

	
	public static double media(double v[]) {
		double soma = soma(v);
		return(soma/v.length);
		
	}

	
	
	public static double fat (int num) {
		double total = 1;
		int cont = 1;
		while (cont<=num) {
			total = total * cont;
			cont++;
		}
		return total;
		
		
	}
	
	
	public static double pow(double b , int e) {
		double total = 1;
		for (int cont = 1 ;cont<=e ; cont++) {
			total = total * b; 
			
		}
		return total;
		
		
		
		
	}
	
	
	/*
	 * cálcule o máximo divisor comum entre 2 números
	 * para: a, b: long - os números a serem competentes
	 * retornar o mdc entre os números
	 */
	public static long mdc (long a, long b) {
		long resp;
		if (a<b) resp = a;
		else resp = b;
		while (true) {
		if ((a%resp==0) && (b%resp==0))  return resp;
		
		else resp--;
	}
		
		
}
	
	/*
	 * cálcule o mínimo múltiplo comum entre 2 números
	 * param: a, b: long - os números a serem competentes
	 * retornar o mmc entre os números
	 */	
	public  static  long  mmc ( long  a , long  b ) {
		long resp;
		if (a>b) resp =a;
		else resp = b;
		while (true) {
			if ((resp%a==0) &&(resp%b==0)) return resp;
			else resp++;
		}
	}
}
	
	