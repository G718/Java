import java.util.*;
public class Test07 {

	public static void main(String[] args) {
		
		int i;
		String s;
		char c;
		Scanner scanner=new Scanner(System.in);
		System.out.println("����һ���ַ�");
		s=scanner.nextLine();
		System.out.println("��ת����ַ�");
		for(i=s.length()-1;i>=0;i--){
			c=s.charAt(i);
			System.out.print(c);
		}
		
	}
	
}
