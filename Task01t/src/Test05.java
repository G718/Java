import java.util.Scanner;
public class Test05 {
	public static void main(String[] args) {
		double x,y,z;
		Scanner sc=new Scanner(System.in);
		//7.
		System.out.print("�����⡢\n"+"������x:");
		x=sc.nextDouble();
		y=(x/(x-2.0)-x/(x+2.0))/4.0*x/(2.0-x);
		System.out.println("ֵΪ:"+y);
		//8.
		System.out.print("�ڰ��⡢\n"+"������x:");
		x=sc.nextDouble();
		y=x*Math.sqrt(x*Math.sqrt(x*Math.sqrt(x)));
		System.out.println("ֵΪ:"+y);
		//9.
		System.out.print("�ھ��⡢\n"+"������x:");
		x=sc.nextDouble();
		y=2*x/(Math.pow(x, 2.0)-4.0)-1/(x-2.0);
		System.out.println("ֵΪ:"+y);
		//10.
		System.out.print("��ʮ�⡢\n"+"������x:");
		x=sc.nextDouble();
		System.out.print("������y:");
		y=sc.nextDouble();
		z=(1.0/(x-y)+1.0/(x+y))/2.0*x/(Math.pow(x,2.0)+2.0*x*y+Math.pow(y, 2.0));
		System.out.println("ֵΪ:"+z);
		}

}