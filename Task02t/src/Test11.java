import java.util.*;
public class Test11 {

	public static void main(String[] args) {
		
		int a,b,t;
		Scanner sc=new Scanner(System.in);
		System.out.println("��ֵ����");
		System.out.print("������a��ֵ:");
		a=sc.nextInt();
		System.out.print("������b��ֵ:");
		b=sc.nextInt();
		if(a>b){
			t=a;
			a=b;
			b=t;
		}
		System.out.println("��С����Ϊ��"+a+"  "+b);
	}
	
}
