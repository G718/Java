import java.util.*;
public class Test08 {

	public static void main(String[] args) {
		
		double bmi,w,h;
		String s,k = null;
		Scanner sc=new Scanner(System.in);
		System.out.print("�����������Ա�");
		s=sc.next();
		System.out.print("���������(m)��");
		h=sc.nextDouble();
		System.out.print("����������(kg)��");
		w=sc.nextDouble();
		bmi=w/h/h;
		while(s.equals("��")){
			if(bmi<20){
				k="����";
			}else if(bmi>=20&&bmi<25){
				k="����";
			}else if(bmi>=25&&bmi<30){
				k="����";
			}else if(bmi>=30&&bmi<35){
				k="����";
			}else{
				k="�ǳ�����";
			}
			break;
		}
		while(s.equals("Ů")){
			if(bmi<19){
				k="����";
			}else if(bmi>=19&&bmi<24){
				k="����";
			}else if(bmi>=24&&bmi<29){
				k="����";
			}else if(bmi>=29&&bmi<34){
				k="����";
			}else{
				k="�ǳ�����";
			}
			break;
		}
		System.out.println("����BMIָ��Ϊ"+bmi+"������"+k);
		
	}
	
}
