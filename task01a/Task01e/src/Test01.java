import java.util.*;
public class Test01 {
	public static void main(String[] args) {
		/*��֪�����������ߣ������*/
		double s,x,y,z,p;
		Scanner sc=new Scanner(System.in);
		System.out.print("�������һ����:");
		x=sc.nextDouble();
		System.out.print("������ڶ�����:");
		y=sc.nextDouble();
		System.out.print("�������������:");
		z=sc.nextDouble();
		p=(x+y+z)/2.0;
		s=Math.sqrt(p*(p-x)*(p-y)*(p-z));
		System.out.println("���������Ϊ��"+s);
		

	}

}
