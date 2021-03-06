package model;

import java.util.ArrayList;

import dao.ClienteDAO;
import util.ValidaCPF;

public class Cliente {

	private int id;
	private String cpf;
	private String nome;
	private String celular;
	private String email;
	
	public Cliente() {
		super();
	}

	public Cliente(String cpf, String nome, String celular, String email) {
		super();
		setId(id);
		setCpf(cpf);
		setNome(nome);
		setCelular(celular);
		setEmail(email);
		gravar();
	}
	
	
	
	private void gravar() {

		new ClienteDAO().insert(this);
	}

	public Cliente(int id, String cpf, String nome, String celular, String email) {
		super();
		setId(id);
		setCpf(cpf);
		setNome(nome);
		setCelular(celular);
		setEmail(email);
	}
	
	public static ArrayList<Cliente> getLista1() {
		// return clientes;
		ClienteDAO dao = new ClienteDAO();
		return dao.select();
	}
	

	public int getId() {
		return id;
	}

	private void setId(int id) {
		this.id = id;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		if (ValidaCPF.isCPF(cpf)) {
			this.cpf = cpf;
		} else {
			throw new IllegalArgumentException("CPF Inv�lido");
		}
	}
	
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (nome.isEmpty()) {
			throw new IllegalArgumentException("Nome n�o pode ser vazio!");
		} else if (nome.isBlank()) {
			throw new IllegalArgumentException("Nome n�o pode ser em branco!");
		} else if (nome.length() < 5) {
			throw new IllegalArgumentException("Nome deve ter mais de 4 letras!");
		} else {
			this.nome = nome;
		}
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		if (celular.isBlank()) {
			throw new IllegalArgumentException("N�o pode estar em branco!");
		} else if ((!celular.isEmpty()) && (celular.length() != 15)) {
			throw new IllegalArgumentException("Deve estar no formato (XX) XXXXX-XXXX");
		} else {
			this.celular = celular;
		}		
		this.celular = celular;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nome=" + nome + "]";
	}

	public static Object getLista() {
		// TODO Auto-generated method stub
		return null;
	}	
	
}
