import java.util.*;
public class Test04 {

	public static void main(String[] args) {
		double x,y;
		Scanner sc=new Scanner(System.in);
		System.out.print("ÇëÊäÈëxÖµ£º");
		x=sc.nextDouble();
		if(x>=0){
			y=x*x-4*x+6;
		}
		else{
			y=x+6;
		}
		System.out.println("f(x)="+y);
	}
	
}
