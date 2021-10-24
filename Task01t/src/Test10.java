import java.util.*;
public class Test10 {
	public static void main(String[] args) {
		double f,c;
		Scanner sc=new Scanner(System.in);
		System.out.print("请输入温度(℃):");
		c=sc.nextDouble();
		f=c*9/5+32;
		System.out.println("华氏温度为:"+f+"℉");
	}

}
