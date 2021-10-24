import java.util.*;
public class Test19 {

	public static void main(String[] args) {
		
		int j=0,k=0,i;
		double a[]=new double[5];
		double b[]=new double[5];
		Scanner scanner=new Scanner(System.in);
		System.out.println("输入十个人的身高");
		for(i=1;i<=10;i++){
			if(i%2!=0)
				a[j++]=scanner.nextDouble();
			else
				b[k++]=scanner.nextDouble();
		}
		System.out.println("a组成员");
		for(j=0;j<5;j++)
			System.out.print(String.format("%.2f",a[j])+" ");
		System.out.println("\nb组成员");
		for(j=0;j<5;j++)
			System.out.print(String.format("%.2f",b[j])+" ");
	}
	
}
