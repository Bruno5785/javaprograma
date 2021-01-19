package aula10;

public class Empresa extends Cliente{
	String telefone;
	long cnpj;
	int prazo;
	public Empresa(String nome, String email, String telefone, long cnpj, int prazo) {
		super(nome, email);
		this.telefone = telefone;
		this.cnpj = cnpj;
		this.prazo = prazo;
	}
	
	

}
