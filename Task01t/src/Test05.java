import java.util.Scanner;
public class Test05 {
	public static void main(String[] args) {
		double x,y,z;
		Scanner sc=new Scanner(System.in);
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