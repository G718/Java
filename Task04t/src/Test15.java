import java.util.Date;
import java.util.Scanner;
import java.text.*;
public class Test15 {

	public static void main(String[] args) throws ParseException {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("输入一个日期（如2021-10-11）");
		String s=scanner.nextLine();
		Date today =new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		Date date=sdf.parse(s);
		long time2=today.getTime();
		long time1=date.getTime();
		long time =time2-time1;
		long days=time/1000/60/60/24;
		if(days>=5){
			System.out.println("老的");
		}else{
			System.out.println("新的");
		}
		System.out.println(days);
		
	}
	
}
