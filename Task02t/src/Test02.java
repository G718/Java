import java.util.*;
public class Test02 {
	public static void main(String[] args) {
	
		double x,y;
		Scanner sc=new Scanner(System.in);
		System.out.print("«Î ‰»Îx÷µ£∫");
		x=sc.nextDouble();
		if(x<=2){
			y=Math.pow(x, 2)+2;
		}
		else{
			y=2*x;
		}
		System.out.println("f(x)="+y);
		
	}
}
