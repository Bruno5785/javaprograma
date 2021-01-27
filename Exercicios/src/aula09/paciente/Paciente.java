package aula09.paciente;

public class Paciente {

	String nome;
	int idade;
	double peso;
	double altura;
	
	
	
	public Paciente(String nome, int idade, double peso, double altura) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.peso = peso;
		this.altura = altura;
		
	}

	

	public void listar() {
		System.out.println("Paciente: " +
							nome + "\t" + 
							idade + "\t" +
							peso + "\t" + 
							altura + "\t" +
							getIMC());
		
		
	}
	
	public String getIMC() {
		double imc = peso / (altura * altura);
		String classe = aula04.classeIMC.classeIMC(altura);
		return classe;
	}
}
