package model;
import java.util.Date;

import javax.swing.table.DefaultTableModel;

import dao.EntradaDAO;
import dao.SaidaDAO;
import util.Converte;

/*
 * implementar a classe Saida similar à classe Entrada
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
			throw new IllegalArgumentException("Cliente não pode ser nulo!");
		}
		this.cliente = cliente;
	}
	
	public static DefaultTableModel getTableModel() {
		DefaultTableModel modelo = new DefaultTableModel();
		modelo.addColumn("ID");
		modelo.addColumn("Produto");
		modelo.addColumn("Fornecedor");
		modelo.addColumn("Data");
		modelo.addColumn("Docto");
		modelo.addColumn("Qtde");
		modelo.addColumn("Valor");
		SaidaDAO dao = new SaidaDAO();
		for (Saida e: dao.select()) {
			String[] row = { String.valueOf(e.getId()),
							 e.getProduto().getNome(),
							 e.getFornecedor().getNome(),
							 Converte.date2dmy(e.getData()),
							 e.getDoc(),
							 String.valueOf(e.getQtde()),
							 String.valueOf(e.getValor())
							};
			modelo.addRow(row);
		}
		return modelo;
	}
	
	
	@Override
	public String toString() {
		return "Saída [id=" + getId() + 
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
			throw new IllegalArgumentException("Fornecedor não pode ser nulo!");
		}
		this.fornecedor = fornecedor;
	}	

}
