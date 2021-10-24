
public class Test01 {

	public static void main(String[] args) {
		
		int i=0;
		char c;
		String s="i love you";
		for(i=0;i<s.length();i++){
			if(s.charAt(i)!=32){
				c=s.charAt(i);
				c=(char)(c-32);
				System.out.print(c);
			}else{
				System.out.print(s.charAt(i));
			}
		}
	}
	
}
