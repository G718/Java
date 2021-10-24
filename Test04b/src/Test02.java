import java.util.*;
import java.text.*;
public class Test02 {

	public static void main(String[] args) {
		
		Date date=new Date();
		System.out.println(date);
		System.out.println();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyyÄêMMÔÂddÈÕhh:mm:ss");
		String day =sdf.format(date);
		System.out.println(day);
		
	}
	
}
