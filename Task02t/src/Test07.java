import java.util.*;
public class Test07 {

	public static void main(String[] args) {
		double a,b,y;
		Scanner sc=new Scanner(System.in);
		//1.
		System.out.print("��һ��\n������a��ֵ��");
		a=sc.nextDouble();
		System.out.print("������b��ֵ��");
		b=sc.nextDouble();
		if((a-4)<0&&(b-2)<0){
			y=4-a+2-b;
		}
		else if((a-4)<0&&(b-2)>0){
			y=4-a+b-2;
		}
		else if((a-4)>0&&(b-2)<0){
			y=a-4+2-b;
		}
		else{
			y=a-4+b-2;
		}
		System.out.println("ֵΪ��"+y);
		
		//2.
		System.out.print("�ڶ���\n������a��ֵ��");
		a=sc.nextDouble();
		System.out.print("������b��ֵ��");
		b=sc.nextDouble();
		if((4+a)<0&&(2-5*b)<0){
			y=-(4+a)-(2-5*b);
		}
		else if((4+a)<0&&(2-5*b)>0){
			y=-(4+a)+2-5*b;
		}
		else if((a+4)>0&&(2-5*b)<0){
			y=4+a-(2-5*b);
		}
		else{
			y=4+a+2-5*b;
		}
		System.out.println("ֵΪ��"+y);
		
		//3.
		System.out.print("������\n������a��ֵ��");
		a=sc.nextDouble();
		System.out.print("������b��ֵ��");
		b=sc.nextDouble();
		String q,w,e;
		double i=a-b,j=a+b,m = a,n = b;
		q=Compare(a,b);
		if(a<0){
			a=-a;
		}
		if(b<=0){
			b=-b;
		}
		w=Compare(a,b);
		if(i<0){
			i=-i;
		}
		if(j<0){
			j=-j;
		}
		e=Compare(i,j);
		System.out.print(m+q+n+"\n"+a+w+b+"\n"+i+e+j);
	}
	static String Compare(double a,double b){
		String k;
		if(a>b){
			k=">";
		}else if(a==b){
			k="=";
		}else{
			k="<";
		}
		return k;
		}
}
