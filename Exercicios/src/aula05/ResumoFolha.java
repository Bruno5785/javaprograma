package aula05;

import java.util.Scanner;

public class ResumoFolha {

	/*
	 * in: nome + valor da hora + quantidade de horas trabalhadas 
	 * out: resumo da folha de pagamento
	 * Exemplo:
	 * 		Nome: Dennis Ritchie
	 * 		Salário Bruto: R$ 8.543,90
	 * 		INSS: R$ 842,00
	 * 		IRPF: R$ 435,00
	 * 		Salário Líquido: R$ 7321,90
	 * Equações:
	 * 		salarioBruto = valorHora * qtdeHoras
	 * 		valorINSS -> calculado conforme tabela (calculaINSS)
	 * 		valorIRPF -> calculado conforme tabela (calculaIR)
	 * 		salarioLiquido = salarioBruto - valorINSS - valorIRPF
	 * Base para INSS: salarioBruto
	 * Base para IRPF: salarioBruto - valorINSS
	 */
	public static void main(String[] args) {
		String nome;
		double valorHora;
		double qtdeHoras;
		double salarioBruto;
		double valorINSS;
		double valorIR;
		double salarioLiquido;
		Scanner sc = new Scanner(System.in);
		// ler o nome
		System.out.print("Nome do Funcionário: ");
		nome = sc.nextLine();
		// ler o valor da hora
		System.out.print("Valor da Hora: ");
		valorHora = sc.nextDouble();
		// ler a quantidade de horas
		System.out.print("Quantidade de Horas: ");
		qtdeHoras = sc.nextDouble();		
		// calcular salário bruto
		salarioBruto = valorHora * qtdeHoras;
		// calcular valor do inss
		valorINSS =  CalculaINSS.calculaINSS(salarioBruto);
		// calcular valor do ir
		valorIR = CalculaIRPF.calculaIR(salarioBruto-valorINSS);
		// calcular salário líquido
		salarioLiquido = salarioBruto - valorINSS - valorIR;
		// imprimir resumo da folha
		System.out.println("Nome: " + nome);
		System.out.println("Salário Bruto: R$ " + salarioBruto);
		System.out.println("INSS: R$ " + valorINSS);
		System.out.println("IRPF: R$ " + valorIR);
		System.out.println("Salário Líquido: R$ " + salarioLiquido);
	}

}


