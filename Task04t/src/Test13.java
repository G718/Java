import java.text.SimpleDateFormat;
import java.util.*;
public class Test13 {

	public static void main(String[] args) {
		
		Date now=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String date=sdf.format(now);
		System.out.println("现在时间为"+date);//现在时间
		
	}
	
}
