import java.util.*;
public class Test05 {

	public static void main(String[] args) {
		
		int i=0,k=1;
		String s;
		char c;
		int a[]=new int[26];
		Scanner scanner=new Scanner(System.in);
		System.out.println("输入一句英文(单词用空格或逗号隔开)");
		s=scanner.nextLine();
		while(i<s.length()){
			c=s.charAt(i++);
			if(c==' '||c==','){
				k++;
				continue;
			}
			if(c>=65&&c<=90){
				c=(char) (c+32);
			}
			a[c-97]++;
		}
		System.out.println("单词个数："+k);
		for(i=0;i<a.length;i++){
			if(a[i]!=0){
				System.out.println((char)(i+97)+"的个数为"+a[i]+"个");
			}
		}
		
	}
	
}
