package model;
import java.util.Date;

import dao.EntradaDAO;
import dao.SaidaDAO;

/*
 * implementar a classe Saida similar � classe Entrada
 * 
 */
public class Saida extends Kardex {
	
	private Cliente cliente;
	private Fornecedor fornecedor;
	
	public Saida() {
		super();
	}
	
	public Saida( 
		       Produto produto,
		       Cliente cliente,
		       Date data, 
		       String doc, 
		       int qtde, 
		       double valor) {
		super(0,produto,data,doc,qtde,valor);
		setCliente(cliente);
		produto.saida(this);
	}
	
	public Saida(int id, 
		       Produto produto,
		       Cliente cliente,
		       Date data, 
		       String doc, 
		       int qtde, 
		       double valor) {
		super(id,produto,data,doc,qtde,valor);
		setCliente(cliente);
		produto.saida(this);
	}
	
	public void gravar() {
		new SaidaDAO().insert(this);
		
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	
	public static Saida getSaida(int id) {
		Saida e = new SaidaDAO().select(id);
		return e;
	}
	
	public void update() {
		new SaidaDAO().update(this);
	}
	
	public void delete() {
		new SaidaDAO().delete(this);
	}

	public void setCliente(Cliente cliente) {
		if (cliente == null) {
			throw new IllegalArgumentException("Cliente n�o pode ser nulo!");
		}
		this.cliente = cliente;
	}
	
	@Override
	public String toString() {
		return "Sa�da [id=" + getId() + 
				", produto=" + getProduto().getNome() + 
				", cliente=" + cliente.getNome() + 
				//", data=" + getData() + 
				", qtde=" + getQtde() + 
				", valor=" + getValor() + "]";
	}

	public Fornecedor getFornecedor() {
		// TODO Auto-generated method stub
		return fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		if (fornecedor == null) {
			throw new IllegalArgumentException("Fornecedor n�o pode ser nulo!");
		}
		this.fornecedor = fornecedor;
	}	

}
