import java.util.*;
public class Test09 {

	public static void main(String[] args) {
		
		double f,c;
		String s=null;
		Scanner sc=new Scanner(System.in);
		System.out.print("�����¶�ֵ(�H)��");
		f=sc.nextDouble();
		c=(f-32)/9*5;
		if(c>40){
			s="����";
		}else if(c>35&&c<=40){
			s="��������";
		}else if(c>30&&c<=35){
			s="��";
		}else if(c>18&&c<=30){
			s="����";
		}else if(c>0&&c<=18){
			s="��";
		}else if(c>-5&&c<=0){
			s="����";
		}else{
			s="�Ϻ�";
		}
		System.out.println("�¶�Ϊ"+String.format("%.2f",c)+"��"+"���ȳ̶�"+s);
	}
	
}
