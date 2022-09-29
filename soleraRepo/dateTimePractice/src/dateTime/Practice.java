package dateTime;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Practice {

	public static void main(String[] args) {
		
		Date date3 = new Date(1664252373950l);
		// TODO Auto-generated method stub
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
//		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:MM:SS");
		System.out.println(sdf.format(date3));
		String formatDate = sdf.format(date3);
		String dates[] = formatDate.split(" ");
		for(String date : dates) {
			System.out.println(date);
		}
	}

}
