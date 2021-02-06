package util;

import java.text.ParseException;

import javax.swing.text.MaskFormatter;

public class Mascara {

	public static MaskFormatter cnpj () {
		MaskFormatter mf = null;
		try {
			mf = new MaskFormatter ("##.###.###/####-##");
			mf.setPlaceholderCharacter('_');
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return mf;
	}
	
	public static MaskFormatter telefone () {
		MaskFormatter mf = null;
		try {
			mf = new MaskFormatter ("(##)####-####");
			mf.setPlaceholderCharacter('_');
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return mf;
	}
	
	public static MaskFormatter celular () {
		MaskFormatter mf = null;
		try {
			mf = new MaskFormatter ("(##)#-####-####");
			mf.setPlaceholderCharacter('_');
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return mf;
	}
	

	public static MaskFormatter cpf () {
		MaskFormatter mf = null;
		try {
			mf = new MaskFormatter ("###.###.###-##");
			mf.setPlaceholderCharacter('_');
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return mf;
	}
	
}
