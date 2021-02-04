package util;

public class Converte {
	public static int toInt(String s) {
		int num = 0;
		try {
			num = Integer.parseInt(s);
		} catch (NumberFormatException e) {
			
		}
		
		return num;
		
	}

}
