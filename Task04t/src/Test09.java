import java.util.*;
import java.text.*;
public class Test09 {

	public static void main(String[] args) throws ParseException {
		
		String id="320722200207181234";
		String year=id.substring(6,10);
		String mon=id.substring(10,12);
		String day=id.substring(12,14);
		char c=id.charAt(16);
		String a;
		if(((c-48)&1)==0){
			a="女";
		}else{
			a="男";
		}
		String s=year+"年"+mon+"月"+day+"日";
		Date date=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日");
		date =sdf.parse(s);
		String da =sdf.format(date);
		System.out.println("生日为"+da+";性别："+a);
		
	}
	
}
