/*计算阶乘*/
import java.util.*;
public class Test03 {

	public static void main(String[] args) {
		
		int a,b,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("输入一个数：");
		a=sc.nextInt();
		b=a;
		for(i=a-1;i>0;i--){
			a=i*a;
		}
		System.out.println(b+"!为"+a);
		
	}
	
}
