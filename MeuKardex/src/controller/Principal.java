package controller;

import java.util.Date;

import model.Kardex;
import model.Produto;

public class Principal {

	public static void main(String[] args) {
		//testaProduto();
		testaKardex();
		System.out.println("FIM!");
		
	}
	
	public static void testaProduto() {
		int id = 1;
		String nome = "Pente de memória 16GB DDR4 2666Mhz";
		String localizacao = "Prateleira 3 Caixa 5";
		int qtdeMaxima = 100;
		int qtdeMinima = 20;
		int qtdeEstoque = 80;
		Produto p = new Produto(id,nome,localizacao,
								qtdeMaxima,qtdeMinima,qtdeEstoque);
		System.out.println(p);

	}
	
	public static void testaKardex() {
		
		int id = 1;
		String nome = "Pente de memória 16GB DDR4 2666Mhz";
		String localizacao = "Prateleira 3 Caixa 5";
		int qtdeMaxima = 100;
		int qtdeMinima = 20;
		int qtdeEstoque = 80;
		Produto p = new Produto(id,nome,localizacao,
								qtdeMaxima,qtdeMinima,qtdeEstoque);
		
		Date data = new Date("19/01/2021");
		String doc = "NF 1234";
		int qtde = 10;
		double valor = 1000;	
		
		Kardex k = new Kardex(id,p,data,doc,qtde,valor);
	}
}
