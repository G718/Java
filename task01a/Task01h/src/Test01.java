import java.util.*;
public class Test01 {
	public static void main(String[] args) {
		double BMI,w,h;
		Scanner sc=new Scanner(System.in);
		System.out.print("请输入体重(kg):");
		w=sc.nextDouble();
		System.out.print("请输入身高(m):");
		h=sc.nextDouble();
		BMI=w/Math.pow(h, 2);
		System.out.println("您的BMI为："+BMI);
	}

}
