import java.util.*;
public class Test01 {
	public static void main(String[] args) {
		double BMI,h=0,w=0;
		String s = new String();
		Scanner sc=new Scanner(System.in);
		h=sc.nextDouble();
		w=sc.nextDouble();
		BMI=w/h/h;
		if(BMI<20)
			s="����";
		else if(BMI>=20&&BMI<=25)
			s="����";
		System.out.println(s);
	}
	
}
