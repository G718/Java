import java.util.*;
public class Test03 {

		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			double x,y;
			System.out.println("������xֵ��");
			x=sc.nextDouble();
			if(x<=-1){
				y=x+2;
			}
			else if(x>-1&&x<2){
				y=x*x;
			}
			else{
				y=2*x;
			}
			System.out.println("������ֵΪ��"+y);
		}
	
}
