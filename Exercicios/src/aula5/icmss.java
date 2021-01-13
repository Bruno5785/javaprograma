package aula5;

public class icmss {

}
public  class  CalculaIRPF {

	/ *
	 * entrada e sa�da de dados
	 * /
	public  static  void  main ( String [] args ) {
		double valorHora;
		double qtdeHoras;
		double salarioBruto;
		double valorIR;
		double salarioLiquido;
		Scanner sc =  novo  Scanner ( Sistema . In);
		// ler o valor da hora
		Sistema . para fora . imprimir ( " Valor da Hora: " );
		valorHora = sc . nextDouble ();
		// ler a quantidade de horas
		Sistema . para fora . imprimir ( " Quantidade de Horas: " );
		qtdeHoras = sc . nextDouble ();
		// calcular o sal�rio bruto
		salarioBruto = valorHora * qtdeHoras;
		// chamar o m�todo para calcular o valor do ir
		valorIR = calculaIR (salarioBruto);
		// calcular o sal�rio l�quido
		salarioLiquido = salarioBruto - valorIR;
		// exibe a tela como informa��es
		Sistema . para fora . println ( " Sal�rio Bruto = R $ "  + salarioBruto);
		Sistema . para fora . println ( " Valor do IRPF = R $ "  + valorIR);
		Sistema . para fora . println ( " Sal�rio L�quido = R $ "  + salarioLiquido);
	}
	
	/ *
	 * calcular o irpf conforme tabela.
	 * Equa��o:
	 * valorIR = base * aliquota - parcelaDeduzir 
	 * param: base: double com a base de c�lculo do ir - sal�rio bruto
	 * return: o valor do ir a reter - double
	 * / 
	public  static  double  calculaIR ( base dupla  ) {
		aliquota dupla =  0 ;
		dupla parcelaDeduzir =  0 ;
		valor duploIR =  0 ;
		// encontra uma faixa de ir correspondente � base
		// guardar a al�quota e a parcela a deduzir
		if (base <=  1903,98 ) {  
			aliquota =  0 ;
			parcelaDeduzir =  0 ;
		} else  if (base > =  1903.99  && base <=  2826.65 ) { // && AND l�gico
			aliquota =  7,5 / 100 ;
			parcelaDeduzir =  142,8 ;
		} else  if (base > =  2826.66  && base <=  3751.05 ) { // && AND l�gico
			al�quota =  15 / 100 ;
			parcelaDeduzir =  354,8 ;
		} else  if (base > =  3751.06  && base <=  4664.68 ) { // && AND l�gico
			aliquota =  22,5 / 100 ;
			parcelaDeduzir =  636,13 ;
		} else  if (base >  4664,68 ) {
			aliquota =  27,5 / 100 ;
			parcelaDeduzir =  869,36 ;
		}
		// calcular o valor do ir
		valorIR = base * aliquota - parcelaDeduzir;
		// retornar o valor do ir
		return valorIR;
	}

}