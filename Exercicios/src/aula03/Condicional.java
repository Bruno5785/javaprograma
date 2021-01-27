package aula03;

import javax.swing.JOptionPane;

public class Condicional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		compara();

	}

	public static void compara() {
		String s = JOptionPane.showInputDialog("Digite um número: ");
		int num = Integer.parseInt(s);
		if (num > 10)
			JOptionPane.showMessageDialog(null, " O numero é maior que 10");
		else if (num < 10)
			JOptionPane.showMessageDialog(null, " O numero é menor que 10");
		else if (num == 10)
			JOptionPane.showMessageDialog(null, "O número é igual a 10");

	}

}
