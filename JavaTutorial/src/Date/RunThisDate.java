package Date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class RunThisDate {

	public static void main(String[] args) {
		Date d= new Date();
		System.out.println(d.toString());
		System.out.println(d.getDate());
		System.out.println(d.getTime());
		
		SimpleDateFormat sdf= new SimpleDateFormat("yyyy/MM/DD");
		System.out.println(sdf.format(d));
	}

}
