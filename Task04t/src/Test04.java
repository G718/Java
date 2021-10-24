import java.util.*;
public class Test04 {

	public static void main(String[] args) {
		
		int i=0,k=1;
		String s;
		char c;
		Scanner scanner=new Scanner(System.in);
		System.out.println("输入一句英文(单词用空格隔开)S");
		s=scanner.nextLine();
		while(i<s.length()){
			c=s.charAt(i++);
			if(c==' '){
				k++;
				continue;
			}
		}
		System.out.println("单词个数为："+k);
		
	}
	
}
