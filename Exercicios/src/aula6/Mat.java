package aula6;

import javax.swing.JOptionPane;

public class Mat {

	public static void main(String[] args) {
		String str = JOptionPane.showInputDialog("Base: ");
		double base = Double.parseDouble(str);
		str = JOptionPane.showInputDialog("Expoente: ");
		
		int exp = Integer.parseInt(str);
		System.out.println(base +  " ^ "  + exp +  " = "  + pow (base, exp));
	}

	
	public static double fat (int num) {
		double total = 1;
		int cont = 1;
		while (cont<=num) {
			total = total * cont;
			cont++;
		}
		return total;
		
		
	}
	
	
	public static double pow(double b , int e) {
		double total = 1;
		for (int cont = 1 ;cont<=e ; cont++) {
			total = total * b; 
			
		}
		return total;
		
		
		
		
	}
}
	
	