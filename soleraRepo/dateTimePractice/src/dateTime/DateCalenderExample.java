package dateTime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateCalenderExample {
	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		String date = sdf.format(new Date(System.currentTimeMillis()));
		System.out.println(date);
		
//		Convert String to Date
		
//		SimpleDateFormat sdf1 = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
		SimpleDateFormat sdf1 = new SimpleDateFormat(date);
//		String dateInString = "27-09-2022 10:09:56";
		String dateInString = date;
		Date date1 = null;
		try {
			date1 = sdf1.parse(dateInString);
		}catch(ParseException e) {
			e.printStackTrace();
			}
		System.out.println(date1);
		
		
		SimpleDateFormat sdf12 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date2 = new Date();
		System.out.println(sdf12.format(date2));
	}
}
