import java.util.*;
public class Test01 {
	public static void main(String[] args) {
		//1.
		double x,y,z;
		Scanner sc=new Scanner(System.in);
		x=Math.pow((Math.PI-2.0),0.0)-Math.abs(1.0-Math.tan(Math.PI/3.0))-Math.pow(1.0/2.0,-1.0)+6.0/Math.sqrt(3.0);
		System.out.println(x);
		//2.
		x=Math.pow(-3.0, 0.0)-Math.sqrt(27.0)+Math.abs(1.0-Math.sqrt(2.0))+1.0/(Math.sqrt(3.0)+Math.sqrt(2.0));
		System.out.println(x);
		//3.
		x=Math.sqrt(0.64)*Math.pow(125.0/8.0, 1.0/3.0)*Math.sqrt(Math.pow(-2.0, 2.0));
		System.out.println(x);
		//4.
		x=Math.pow((-1.0/2.0),-2.0)+Math.pow(3.0, 3.0)+Math.pow(2011, 0);
		System.out.println(x);
		//5.
		x=Math.sqrt(18.0)-Math.pow(Math.cos(Math.PI/3.0), -1)/Math.pow(2.0, -1.0)-4.0*Math.sqrt(Math.sin(Math.PI/6.0))+Math.pow(Math.sqrt(2.0)-2.0, 0.0);
		System.out.println(x);
		//6.
		x=Math.log10(20.0)+Math.log(25.0)/Math.log(100.0);
		System.out.println(x);
		
		
		//7.
		System.out.print("第七题、\n"+"请输入x:");
		x=sc.nextDouble();
		y=(x/(x-2.0)-x/(x+2.0))/4.0*x/(2.0-x);
		System.out.println("值为:"+y);
		//8.
		System.out.print("第八题、\n"+"请输入x:");
		x=sc.nextDouble();
		y=x*Math.sqrt(x*Math.sqrt(x*Math.sqrt(x)));
		System.out.println("值为:"+y);
		//9.
		System.out.print("第九题、\n"+"请输入x:");
		x=sc.nextDouble();
		y=2*x/(Math.pow(x, 2.0)-4.0)-1/(x-2.0);
		System.out.println("值为:"+y);
		//10.
		System.out.print("第十题、\n"+"请输入x:");
		x=sc.nextDouble();
		System.out.print("请输入y:");
		y=sc.nextDouble();
		z=(1.0/(x-y)+1.0/(x+y))/2.0*x/(Math.pow(x,2.0)+2.0*x*y+Math.pow(y, 2.0));
		System.out.println("值为:"+z);
		}

}
