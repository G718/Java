import java.util.*;
public class Test11 {

	public static void main(String[] args) {
		
		int a,b,t;
		Scanner sc=new Scanner(System.in);
		System.out.println("二值排序");
		System.out.print("请输入a的值:");
		a=sc.nextInt();
		System.out.print("请输入b的值:");
		b=sc.nextInt();
		if(a>b){
			t=a;
			a=b;
			b=t;
		}
		System.out.println("从小到大为："+a+"  "+b);
	}
	
}
