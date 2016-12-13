package data;

import java.util.Calendar;
import java.util.Date;

public class Somar {
	public static void main(String[] args) {
		Date data = new Date();
		int qtdDias = -89;
		
		
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(data);
		calendar.add(Calendar.DAY_OF_MONTH, qtdDias);
		System.out.println(calendar.getTime());
	}
}
