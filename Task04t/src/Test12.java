import java.util.*;
public class Test12 {

	public static void main(String[] args) {
		
		int i=0,j=0;
		String s1,s2,s3;
		char c3[]=new char[120];
		char c1,c2;
		Scanner scanner=new Scanner(System.in);
		System.out.println("请输入第一串字符");
		s1=scanner.nextLine();
		System.out.println("请输入第二串字符");
		s2=scanner.nextLine();
		if(s1.length()<s2.length()){
			s3=s1;
			s1=s2;
			s2=s3;
		}
		c1=s1.charAt(i);
		c2=s2.charAt(i);
		while(i<s2.length()){
			c1=s1.charAt(i);
			c2=s2.charAt(i);
			c3[j++]=c1;
			c3[j++]=c2;
			i++;
		}
		while(i<s1.length()){
			c1=s1.charAt(i++);
			c3[j++]=c1;
		}
		System.out.println("合并后：");
		for(i=0;i<j;i++){
			System.out.print(c3[i]);
		}
		
	}
	
}
