import java.util.*;
public class Test01 {
	public static void main(String[] args) {
		/*已知三角形三条边，求面积*/
		double s,x,y,z,p;
		Scanner sc=new Scanner(System.in);
		System.out.print("请输入第一条边:");
		x=sc.nextDouble();
		System.out.print("请输入第二条边:");
		y=sc.nextDouble();
		System.out.print("请输入第三条边:");
		z=sc.nextDouble();
		p=(x+y+z)/2.0;
		s=Math.sqrt(p*(p-x)*(p-y)*(p-z));
		System.out.println("三角形面积为："+s);
		

	}

}
