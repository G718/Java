import java.*;
public class Test01 {

	public static void main(String[] args) {
		
		String s="2009-3-27,买猪肉1.5kg，单价20元/kg，买与2.8kg，单价10元/kg";
		String w1=s.substring(13,16);
		double w2=Double.parseDouble(w1);
		System.out.println(w2);
		
	}
	
}
