package util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Converte {
	public static int toInt(String s) {
		int num = 0;
		try {
			num = Integer.parseInt(s);
		} catch (NumberFormatException e) {
			
		}
		
		return num;
		
	}
	
	public static Date str2date(String str) {
		SimpleDateFormat dmy = new SimpleDateFormat("dd/MM/yyyy");
		Date data = null;
		try {
			data = dmy.parse(str);
		} catch (ParseException e) {
		}
		return data;
	}
	
	public static String date2dmy(Date data) {
		SimpleDateFormat dmy = new SimpleDateFormat("dd/MM/yyyy");
		String str = dmy.format(data);
		return str;
	}

	
}
