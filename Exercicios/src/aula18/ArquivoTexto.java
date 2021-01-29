package aula18;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class ArquivoTexto {
	
	private static final  String ARQUIVO = "C:\\Users\\brunp\\git\\javaprograma\\Arquivo.TXT";
	private static final String TEXTO = "São Paulo Futebol Clube. O tricolor paulista surgiu através da fusão de dois antigos clubes: o Paulistano, grande campeão no início do século XX e a Associação Atlética das Palmeiras, que se uniram em 1930 dando origem ao Clube Athlético São Paulo ou São Paulo da Floresta, como muitos o chamavam.";
	
	public static void main(String[] args) {
		//gravaArquivo();
		//leArquivo();
		//leByteAByte();
		leComBufferedReader();
		

	}
	
	public static void leComBufferedReader() {
		try {
			FileReader arqEntrada = new FileReader(ARQUIVO);
			BufferedReader dados = new BufferedReader(arqEntrada);
			String linha ="";
			while (linha != null) {
				linha = dados.readLine();
				System.out.println(linha);
			}
			dados.close();
			arqEntrada.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	
	public static void leByteAByte() {
		try {
			FileInputStream arqEntrada = new FileInputStream(ARQUIVO); 
			DataInputStream dados = new DataInputStream(arqEntrada);
			while (true) {
				char c = (char ) dados.readByte();
				System.out.println(c);
				
			}
		} catch (IOException e) {
			System.out.println("\n*********** Fim do Arquivo  ************\n");
		}
	}
	
	public static void leArquivo() {
		
		try {
			FileInputStream arqEntrada = new FileInputStream(ARQUIVO);
			DataInputStream dados = new DataInputStream(arqEntrada);
			String texto = dados.readLine();
			System.out.println(texto);
			dados.close();
			arqEntrada.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
	public static void gravaArquivo() {
		try {
			FileOutputStream arqSaida = new FileOutputStream(ARQUIVO); 
			DataOutputStream dados = new DataOutputStream(arqSaida);
			dados.writeBytes(TEXTO);
			dados.close();
			arqSaida.close();
		}catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Texto gravado no arquivo!");
		
	}

}
