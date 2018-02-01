package data;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CriarCalendar {

	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		
		calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
		
		System.out.println(
		calendar.getActualMaximum(Calendar.DAY_OF_MONTH)
				);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		System.out.println(sdf.format(calendar.getTime()));
	}

}
