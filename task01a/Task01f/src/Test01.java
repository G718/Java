import java.util.*;
public class Test01 {
	public static void main(String[] args) {
		double r,h,s,v;
		Scanner sc=new Scanner(System.in);
		System.out.print("请输入圆柱体底面半径：");
		r=sc.nextDouble();
		System.out.print("请输入圆柱体的高：");
		h=sc.nextDouble();
		s=2*Math.PI*Math.pow(r, 2)+2*Math.PI*r*h;
		System.out.println("圆柱体的表面积为："+s);
		v=2*Math.PI*Math.pow(r, 2)*h;
		System.out.println("圆柱体的体积为："+v);
	}

}
