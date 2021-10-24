import java.util.Date;
import java.text.*;
public class Test03 {

	public static void main(String[] args) throws ParseException {
		
		String s="2021-10-01";
		Date today =new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		Date date=sdf.parse(s);
		long time2=today.getTime();
		long time1=date.getTime();
		long time =time2-time1;
		long days=time/1000/60/60/24;
		if(days>=5){
			System.out.println("老新闻");
		}else{
			System.out.println("新新闻");
		}
		System.out.println(days);
		
	}
	
}
