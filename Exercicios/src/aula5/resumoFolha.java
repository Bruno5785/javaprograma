package aula5;

import java.util.Scanner;

public class resumoFolha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nome ;
		double valorHora;
		double qtdeHoras;
		double salarioBruto;
		double valorINSS;
		double valorIR;
		double salarioLiquido;
		Scanner sc = new Scanner(System.in);
		// ler o nome
		System.out.print( " Nome do Funcionário: " );
		nome = sc.nextLine ();
		// ler o valor da hora
		System.out.print( " Valor da Hora: " );
		valorHora = sc.nextDouble ();
		// ler a quantidade de horas
		System.out.print( " Quantidade de Horas: " );
		qtdeHoras = sc.nextDouble ();		
		// calcular salário bruto
		salarioBruto = valorHora * qtdeHoras;
		// calcular valor do inss
		valorINSS = calculaINSS.calculaINSS(salarioBruto);
		// calcular valor do ir
		valorIR = calculaIRPF.calculaIR(salarioBruto - valorINSS);
		// calcular líquido salário
		salarioLiquido = salarioBruto - valorINSS - valorIR;
		// imprimir resumo da folha
		System.out.print( " Nome: "  + nome);
		System.out.print( " Salário Bruto: R $ "  + salarioBruto);
		System.out.print( " INSS: R $ "  + valorINSS);
		System.out.print( " IRPF: R $ "  + valorIR);
		System.out.print( " Salário Líquido: R $ "  + salarioLiquido);
	}

}


