import java.util.*;
public class Test10 {

	public static void main(String[] args) {
		
		double s;
		String d;
		Scanner sc=new Scanner(System.in);
		System.out.print("������ɼ���");
		s=sc.nextDouble();
		if(s>=90){
			d="����(A)";
		}else if(s>=80&&s<90){
			d="����(B)";
		}else if(s>=70&&s<80){
			d="��(C)";
		}else if(s>=60&&s<70){
			d="����(D)";
		}else{
			d="������(E)";
		}
		System.out.println("�ɼ�"+d);
		
	}
	
}
