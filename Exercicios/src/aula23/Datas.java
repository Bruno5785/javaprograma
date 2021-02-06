package aula23;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;

public class Datas {
	
	public static void main(String[] args) {
		testeDate();
		testeSDF();
		
	}
	
	private static void testeSDF() {
		Date agora = new Date();
		
		
		SimpleDateFormat dmy = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println(dmy.format(agora));
	}

	private static void testeDate() {
		Date agora = new Date();
		Date inicio = new Date(0);
		Date inicioBR = new Date(1000*60*60*3);
		Date d1 = Date.from(Instant.parse("2021-02-05T20:00:00Z"));
		
		System.out.println("Data atual = " + agora);
		System.out.println("Data Inicial GMT = " + inicio);
		System.out.println("Data inical Brasil = " + inicioBR);
		System.out.println("Data.from Instant = " + d1);
		
				
	}
}
