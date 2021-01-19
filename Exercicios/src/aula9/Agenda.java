package aula9;

public class Agenda {
	
	String  nome;
	String  celular;
	String  email;
	
	public Agenda(String nome, String celular, String email) {
		this.nome = nome;
		this.celular = celular;
		this.email = email;
		
	}
	public Agenda(String nome, String celular) {
		this.nome = nome;
		this.celular = celular;
		this.email = email;
		
	}
		
	
	public void incluir(){
		
	}
	public void Listar() {
		System.out.println("Dados dos Contatos ---------" );
		System.out.println("Nome: " + " - " + nome);
		System.out.println(celular + " - " + email );
		System.out.println("-----------");
	}
}

