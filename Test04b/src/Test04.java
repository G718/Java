import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
public class Test04 {

	public static void main(String[] args) throws ParseException {
		
		String s="2021-10-11 21:21:00";
		double p=82.0;
		double fee;
		Date now=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		Date date =sdf.parse(s);
		long hours=(now.getTime()-date.getTime())/1000/60/60;
		System.out.println(hours);
		if(hours>=24){
			fee=p*0.1;
		}else{
			fee=p*0.2;
		}
		System.out.println();
		
	}
	
}
