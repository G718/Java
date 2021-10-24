import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
public class Test14 {

	public static void main(String[] args) throws ParseException {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("输入一个日期（如2021-10-11）");
		String s=scanner.nextLine();
		Date now=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		Date date =sdf.parse(s);
		long days=(now.getTime()-date.getTime())/1000/60/60/24;
		System.out.println("距离现在"+days+"天");
		System.out.println();
		
	}
	
}
