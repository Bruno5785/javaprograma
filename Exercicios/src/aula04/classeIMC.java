package aula04;

import java.util.Scanner;

public class classeIMC {

	public static void main(String[] args) {
		String nome;
		double altura;
		double peso;
		double imc;
		String classe;
		Scanner sc = new Scanner (System.in);
		System.out.print("Nome: ");
		nome = sc.nextLine();
		System.out.print("Altura: ");
		altura = sc.nextDouble();
		System.out.print("Peso: ");
		peso = sc.nextDouble();
		imc = peso / (altura * altura);
		classe = classeIMC(imc);
		System.out.print("Seu IMC é " + imc);
		System.out.print("Sua classificação do IMC " + classe);
		

	}

	
	
	public static String classeIMC(double imc) {
		if (imc < 18.5) return "Peso Baixo";
		else if (imc <= 24.9) return "Peso Normal";
		else if (imc <=29.9) return "Sobrepeso";
		else if (imc <=34.9) return "Obesidade (Grau I)";
		else if (imc <=39.9) return "Obesidade Severa (GrauII)";
		else return "Obesidade extrema(GrauIII)";
		
	}
	
	
	
}
