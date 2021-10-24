import java.util.*;
public class Test10 {

	public static void main(String[] args) {
		
		double s;
		String d;
		Scanner sc=new Scanner(System.in);
		System.out.print("请输入成绩：");
		s=sc.nextDouble();
		if(s>=90){
			d="优秀(A)";
		}else if(s>=80&&s<90){
			d="良好(B)";
		}else if(s>=70&&s<80){
			d="好(C)";
		}else if(s>=60&&s<70){
			d="及格(D)";
		}else{
			d="不及格(E)";
		}
		System.out.println("成绩"+d);
		
	}
	
}
