package aula03;

import javax.swing.JOptionPane;

public class Condicional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		compara();

	}

	public static void compara() {
		String s = JOptionPane.showInputDialog("Digite um n�mero: ");
		int num = Integer.parseInt(s);
		if (num > 10)
			JOptionPane.showMessageDialog(null, " O numero � maior que 10");
		else if (num < 10)
			JOptionPane.showMessageDialog(null, " O numero � menor que 10");
		else if (num == 10)
			JOptionPane.showMessageDialog(null, "O n�mero � igual a 10");

	}

}
