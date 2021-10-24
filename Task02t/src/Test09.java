import java.util.*;
public class Test09 {

	public static void main(String[] args) {
		
		double f,c;
		String s=null;
		Scanner sc=new Scanner(System.in);
		System.out.print("输入温度值(℉)：");
		f=sc.nextDouble();
		c=(f-32)/9*5;
		if(c>40){
			s="酷热";
		}else if(c>35&&c<=40){
			s="高温天气";
		}else if(c>30&&c<=35){
			s="热";
		}else if(c>18&&c<=30){
			s="舒适";
		}else if(c>0&&c<=18){
			s="冷";
		}else if(c>-5&&c<=0){
			s="寒冷";
		}else{
			s="严寒";
		}
		System.out.println("温度为"+String.format("%.2f",c)+"℃"+"冷热程度"+s);
	}
	
}
