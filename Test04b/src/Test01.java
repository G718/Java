import java.*;
public class Test01 {

	public static void main(String[] args) {
		
		String s="2009-3-27,������1.5kg������20Ԫ/kg������2.8kg������10Ԫ/kg";
		String w1=s.substring(13,16);
		double w2=Double.parseDouble(w1);
		System.out.println(w2);
		
	}
	
}
