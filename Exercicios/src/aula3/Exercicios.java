package aula3;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Exercicios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ordemCrescente();
		// valorAbsoluto();
		// sinalDoNumero();
		//NumerosMultiplos();
		multiplos();
		//diferença();
		//comSwitch();
		//mesDoAno();


	}

	
	public static void mesDoAno() {
		Scanner sc = new Scanner (System.in);
		System.out.print("Digite um numero entre 1 e 12: ");
		int mes = sc.nextInt();
		switch (mes) {
		case 1: System.out.print(" Janeiro ");
		break;
		case 2: System.out.print(" Fevereiro");
		break;
		case 3: System.out.print(" Março");
		break;
		case 4: System.out.print(" Abril");
		break;
		case 5: System.out.print(" Maio");
		break;
		case 6 : System.out.print(" Junho");
		break;
		case 7: System.out.print(" Julho");
		break;
		case 8: System.out.print(" Agosto ");
		break;
		case 9: System.out.print(" Setembro");
		break;
		case 10: System.out.print(" Outubro");
		break;
		case 11: System.out.print(" Novembro");
		break;
		case 12: System.out.print(" Dezembro");
		break;
		default: System.out.print("Número invalido. digite numero que deve estar entra 1 e 12 ");
		break;
		
		}
	}
		
	
	
	

	public static void comSwitch() {
		Scanner sc = new Scanner (System.in);
		System.out.print("Digite um numero entre 1 e 7: ");
		int dia = sc.nextInt();
		switch (dia) {
		case 1: System.out.print(" Domingo ");
		break;
		case 2:System.out.print(" Segunda-Feira");
		break;
		case 3: System.out.print(" Terça-Feiraa");
		break;
		case 4: System.out.print(" Quarta-Feira");
		break;
		case 5: System.out.print(" Quinta-Feira");
		break;
		case 6 : System.out.print(" Sexta-Feira");
		break;
		case 7: System.out.print(" Sábado");
		break;
		default: System.out.print("Número invalido. deve estar entra 1 e 7 ");
		break;
		
		
		}
	}
	
	
	
	
	/*
	 * ler 2 numeros e infomer a diferença entre eles.
	 * Exemplo:
	 * 		in: Primeiro numero: 3
	 * 		in: Segundo numero: 7
	 * out: A diferença E 4.
	 */
	 
	
	public static void diferença() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Primeiro numero ");
		int n1 = sc.nextInt();
		System.out.print("Segundo numero ");
		int n2 = sc.nextInt();
		int dif;
		if (n1 > n2) dif = n1 - n2;
		else 
			dif = n2 - n1;
		System.out.print("A diferença é " + dif);
		
	}
	
	public static void multiplos() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Primeiro numero");
		int n1 = sc.nextInt();
		System.out.print("Segundo numero ");
		int n2 = sc.nextInt();
		if (n1 % n2 == 0)
			System.out.print(n1 + " E multiplo de " + n2);
		else if (n2 % n1 == 0)
			System.out.print(n2 + " é multiplo de " + n1);
		else
			System.out.print("Não são multiplos!");
		
	}
	
	
	public static void NumerosMultiplos() {
		String num1 = JOptionPane.showInputDialog(" Digite p primeiro numero:" );
		String num2 = JOptionPane.showInputDialog("Digite o segundo numero:" );
		int n1 = Integer.parseInt(num1);
		int n2 = Integer.parseInt(num2);		
		 if (n1 % n2 == 0 ) {
			 JOptionPane.showMessageDialog(null, " O numero" + n1 + " `multiplo de " + n2);
		 }else {
			 JOptionPane.showMessageDialog(null, "O numro" + n1 +  " não é multiplo de " + n2);
			 
		 }
		
	}
	
			
	
	public static void sinalDoNumero() {
		String s;
		s = JOptionPane.showInputDialog("Número ");
		int n1 = Integer.parseInt(s);
		if (n1 > 0)
			JOptionPane.showMessageDialog(null, "Sinal positivo");
		else if (n1 < 0)
			JOptionPane.showMessageDialog(null, "Sinal Negativo");
		else if (n1 == 0)
			JOptionPane.showMessageDialog(null, "sinal igual");

	}

	
	
	public static void valorAbsoluto() {
		String s;
		s = JOptionPane.showInputDialog("Número ");
		int num = Integer.parseInt(s);
		if (num < 0)
			num = num * -1;
		JOptionPane.showMessageDialog(null, "valorAbsoluto: " + num);
	}
	/*
	 * fazer uma rotina que leia dois números e mostre-os em ordem crescente
	 */

	public static void ordemCrescente() {
		String s;
		s = JOptionPane.showInputDialog("Primeiro número ");
		int n1 = Integer.parseInt(s);
		s = JOptionPane.showInputDialog("Segundo número ");
		int n2 = Integer.parseInt(s);
		if (n1 < n2) {
			JOptionPane.showMessageDialog(null, n1 + " -" + n2);
		} else {
			JOptionPane.showMessageDialog(null, n2 + " - " + n1);

		}
	}

}
