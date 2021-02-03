package model;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Produto {

	private int id;
	private String nome;
	private String localizacao;
	private int qtdeMaxima;
	private int qtdeMinima;
	private int qtdeEstoque;
	private static ArrayList<Produto> lista = new ArrayList<>();
	public static final String ARQUIVO_PRODUTOS = "C:\\Users\\brunp\\git\\javaprograma\\MeuKardex\\db\\Produtos.csv";
	
	
	public Produto() {
		super();
	}

	public Produto(int id, String nome, String localizacao, int qtdeMaxima, int qtdeMinima, int qtdeEstoque) {
		super();
		setId(id);
		setNome(nome);
		setLocalizacao(localizacao);
		if ((qtdeMaxima < 1) || (qtdeMaxima > 1000)) 
			qtdeMaxima = 100;  // valor default
		setQtdeMaxima(qtdeMaxima);
		setQtdeMinima(qtdeMinima);
		setQtdeEstoque(qtdeEstoque);
		gravar();
		
	}
	
	private void gravar () {
		lista.add(this);
		gravaCSV();
	}
	
	private void gravaCSV() {
		try {
		FileWriter fw = new FileWriter(ARQUIVO_PRODUTOS);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("id,nome,localizacao,qtdeMaxima,qtdeMinima,qtedeEstoque\n");
		for (Produto p: getLista()) {
			bw.write(id);
			bw.write(p.getId() + "," );
			bw.write(p.getLocalizacao() + ",");
			bw.write(p.getQtdeMaxima() + ",");
			bw.write(p.getQtdeMinima() + ",");
			bw.write(p.getQtdeEstoque() + "\n");
		}
		bw.close();
		fw.close();
		
	} catch (IOException e) {
		System.out.println(e.getMessage());
	}
	}
	
	
	
	public static ArrayList<Produto> getLista() {
		return lista;
	}
	

	public int getId() {
		return id;
	}

	private void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (nome.isEmpty()) {
			throw new IllegalArgumentException("Nome do produto vazio!");
		} else if (nome.isBlank()) {
			throw new IllegalArgumentException("Nome do produto em branco!");
		} else if (nome.length() < 5) {
			throw new IllegalArgumentException("Nome deve ter mais de 4 letras!");
		} else {
			this.nome = nome;
		}
	}

	public String getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}

	public int getQtdeMaxima() {
		return qtdeMaxima;
	}

	public void setQtdeMaxima(int qtdeMaxima) {
		if ((qtdeMaxima < 1) || (qtdeMaxima > 1000)) {
			throw new IllegalArgumentException("Deve estar entre 1 e 1000!");
		} else {
			this.qtdeMaxima = qtdeMaxima;
		}
	}

	public int getQtdeMinima() {
		return qtdeMinima;
	}

	public void setQtdeMinima(int qtdeMinima) {
		if ((qtdeMinima < 0) || (qtdeMinima > 100)) {
			throw new IllegalArgumentException("Deve estar entre 0 e 100!");
		}
		this.qtdeMinima = qtdeMinima;
	}

	public int getQtdeEstoque() {
		return qtdeEstoque;
	}

	private void setQtdeEstoque(int qtdeEstoque) {
		this.qtdeEstoque = qtdeEstoque;
	}

	public void entrada(Entrada entrada) {
		int qtde = getQtdeEstoque();
		qtde = qtde + entrada.getQtde();
		setQtdeEstoque(qtde);
	}
	
	public void saida(Saida saida) {
		int qtde = getQtdeEstoque();
		qtde = qtde - saida.getQtde();
		setQtdeEstoque(qtde);
	}
	
	@Override
	public String toString() {
		return "Produto [id=" + id + 
				", nome=" + nome + 
				", qtdeEstoque=" + qtdeEstoque + "]";
	}
	
}
