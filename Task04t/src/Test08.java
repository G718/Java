public class Test08 {

	public static void main(String[] args) {
		
		String s="2009-3-27,������1.5kg������20Ԫ/kg������2.8kg������10Ԫ/kg";
		String s1=s.substring(0,9);
		String s2=s.substring(13,16);
		String s3=s.substring(21,23);
		String s4=s.substring(30,33);
		String s5=s.substring(38,40);
		double w2=Double.parseDouble(s2);
		double w3=Double.parseDouble(s3);
		double w4=Double.parseDouble(s4);
		double w5=Double.parseDouble(s5);
		System.out.println(s1+"������"+(w2*w3+w4*w5)+"Ԫ");
		
	}
	
}
