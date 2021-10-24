import java.util.*;
public class Test08 {

	public static void main(String[] args) {
		
		double bmi,w,h;
		String s,k = null;
		Scanner sc=new Scanner(System.in);
		System.out.print("请输入您的性别：");
		s=sc.next();
		System.out.print("请输入身高(m)：");
		h=sc.nextDouble();
		System.out.print("请输入体重(kg)：");
		w=sc.nextDouble();
		bmi=w/h/h;
		while(s.equals("男")){
			if(bmi<20){
				k="过轻";
			}else if(bmi>=20&&bmi<25){
				k="适中";
			}else if(bmi>=25&&bmi<30){
				k="过重";
			}else if(bmi>=30&&bmi<35){
				k="肥胖";
			}else{
				k="非常肥胖";
			}
			break;
		}
		while(s.equals("女")){
			if(bmi<19){
				k="过轻";
			}else if(bmi>=19&&bmi<24){
				k="适中";
			}else if(bmi>=24&&bmi<29){
				k="过重";
			}else if(bmi>=29&&bmi<34){
				k="肥胖";
			}else{
				k="非常肥胖";
			}
			break;
		}
		System.out.println("您的BMI指数为"+bmi+"，体重"+k);
		
	}
	
}
