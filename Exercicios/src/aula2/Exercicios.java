package aula2;

import java.util.Scanner;

public class Exercicios {

	private static int bruto;
	private static double real;

	public static void main(String[] args) {
		//converter();
		calculaSalarioBruto();
		//calculaSalarioLiquido();
		
	}
	
	/*
	 * faça uma rotina que leia o nome do desemvolvedor . o valor da hora 
	 * e a quantidade de horas trabalhadas, o percentual do IRF, 
	 * e imprima o  salário líquido do desemvolvedor. 
	 * IRF = Bruto * %IRF 
	 * Liquido = Bruto  -  IRF 
	 * Exemplo 
	 * 		in: Nome: Bruno Almeida 
	 * 		in: Valor por hora: 120.00
	 * 		in: Quantidade de Horas Trabalhadas : 200
	 * 		out: BRuto: R$ 24.000,00
	 * 		out: IRF: R$ 3.600,00
	 * 		out: Liquido: R$ 20.400,00
	 */
	
	
	
	
	public static void calculaSalarioLiquido(){
			
		
	
	}	
			
			
		public static void calculaSalarioBruto() { 
			String nome;
			double valor;
			int horas;
			Scanner sc = new Scanner(System.in);
			System.out.print("Nome: ");
			nome = sc.nextLine();
			System.out.print("Valor por Hora: ");
			valor = sc.nextDouble();
			System.out.print("Quantidade de Horas Trabalhadas:  ");
			horas = sc.nextInt();
			System.out.print(nome + " - R$ " + ( valor*horas));
			sc.close();
	}

	public static void converter() {
		double celsius; 
		double fahrenheit; 
		double kelvin;
		Scanner sc = new Scanner(System.in);
		System.out.println(" Temperatura em Calsius: ");
		celsius = sc.nextDouble();
		fahrenheit = celsius * 9/5 + 32;
		kelvin = celsius + 273.15;
		System.out.println("Temperatura em fahrenheit = " + fahrenheit + "f\n " + "Temperatura em kelvin =" +  " kelvin = "  + "k");
		sc.close();
	}
}
