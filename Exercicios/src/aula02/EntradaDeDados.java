package aula02;

import java.util.Scanner;

public class EntradaDeDados {

	public static void main(String[] args) {
		lendoNumeros();

	}

	public static void lendoNumeros(){
		int n1;    // n�meros inteiros 
		double n2; // valores decimais 
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite um n�mero inteiro:" );
		n1 = sc.nextInt();  //l� um inteiro 
		System.out.print("Digite um nunero real");
		n2 = sc.nextDouble();
		System.out.println("inteiro = " + n1 + "\nDecimal = "+ n2);
		sc.close();
	}
}
