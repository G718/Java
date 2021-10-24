import java.util.*;
public class Test14 {

	public static void main(String[] args) {
		
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.print("a的值：");
		a=sc.nextInt();
		System.out.print("b的值：");
		b=sc.nextInt();
		System.out.print(a+"+"+b+"="+(a+b)+"\n");
		System.out.print(a+"-"+b+"="+(a-b)+"\n");
		System.out.print(a+"*"+b+"="+(a*b)+"\n");
		System.out.print(a+"/"+b+"="+(a/b)+"."+(a%b)+"\n");
	}
	
}
