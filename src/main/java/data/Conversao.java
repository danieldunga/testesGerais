package data;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Conversao {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdfDD_MM_YYYY = new SimpleDateFormat("dd/MM/yyyy");
		Date data1 = sdfDD_MM_YYYY.parse("32/12/1900");
		System.out.println(data1);
		Calendar cal = Calendar.getInstance();
		cal.setTime(data1);
		String datepatternValidator = cal.get(Calendar.DAY_OF_MONTH)+ "/" + (cal.get(Calendar.MONTH)+1) + "/" + cal.get(Calendar.YEAR);
		System.out.println(datepatternValidator);
		
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		
		//Date data = dateFormat.parse("2016-04-07T23:11:46.602-0300");
		Date data = dateFormat.parse("2016-04-26");
		
		System.out.println(data);

	}

}
