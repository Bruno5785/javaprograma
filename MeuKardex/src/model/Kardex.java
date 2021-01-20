package model;

import java.util.Date;

public class Kardex {

	private int id;
	private Produto produto;
	private Date data;
	private String doc;
	private int qtde;
	private double valor;
	
	
	
	public Kardex() {
		super();
		
	}
	
	
	
		
		
	public Kardex(int id, Produto produto, Date data, String doc, int qtde, double valor) {
		super();
		setId(id);
		setProduto(produto);
		setData(data);
		setDoc(doc);
		setQtde(qtde);
		setValor(valor);
	
	}




	private void setProduto(Produto produto2) {
		// TODO Auto-generated method stub
		
	}





	public int getId() {
		return id;
	}
	
	private void setId(int id) {
		this.id = id;
	}
	
	public Date getData() {
		return data;
	}
	
	public void setData(Date data) {
		this.data = data;
	}
	
	public String getDoc() {
		return doc;
	}
	
	public void setDoc(String doc) {
		if (doc.isBlank()) {
			throw new IllegalArgumentException("Documento em Branco! ");
		} else if ((!doc.isEmpty() && doc.length() < 3)) {
		throw new IllegalArgumentException(" Documento deve ter mais 3 caractere !");
		} else {	
		this.doc = doc;
		}
	}
	
	public int getQtde() {
		return qtde;
	}
	
	public void setQtde(int qtde) {
		if ((qtde < 1) || (qtde > 1000)) {
			throw new IllegalArgumentException(" Quantidade deve estar entre 1 e 1000! ");
		} else {
	
		this.qtde = qtde;
		}
	}

	public double getValor() {
		return valor;
	}
	
	public void setValor(double valor) {
		if ((valor < 0.01) || (valor > 10_000)) {
			throw new IllegalArgumentException("Valor entre 0.01 e 10.000,00!");
		} else {
		this.valor = valor;
		}
	}





	@Override
	public String toString() {
		return "Kardex [id=" + id + ", produto=" + produto + ", data=" + data + ", qtde=" + qtde + ", valor=" + valor
				+ "]";
	}
	
	
	
}
