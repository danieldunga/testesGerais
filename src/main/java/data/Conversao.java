package data;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Conversao {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		
		//Date data = dateFormat.parse("2016-04-07T23:11:46.602-0300");
		Date data = dateFormat.parse("2016-04-26");
		
		System.out.println(data);

	}

}
