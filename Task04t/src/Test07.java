import java.util.*;
public class Test07 {

	public static void main(String[] args) {
		
		int i;
		String s;
		char c;
		Scanner scanner=new Scanner(System.in);
		System.out.println("输入一串字符");
		s=scanner.nextLine();
		System.out.println("反转后的字符");
		for(i=s.length()-1;i>=0;i--){
			c=s.charAt(i);
			System.out.print(c);
		}
		
	}
	
}
