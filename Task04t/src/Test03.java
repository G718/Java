import java.util.*;
public class Test03 {

	public static void main(String[] args) {
		
		int i=0;
		String s;
		char c;
		Scanner scanner=new Scanner(System.in);
		System.out.println("����һ���ַ�������0ֹͣ");
		s=scanner.next();
		while(i<s.length()&&i<30){
			c=s.charAt(i++);
			if(c=='0'){
				break;
			}
			System.out.print(c);
		}
		if(s.length()>30){
			System.out.print("...");
		}
		
	}
	
}
