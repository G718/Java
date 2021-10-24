
public class Test05 {

	public static void main(String[] args) {
		
		String password="123456";
		String news="";
		int i;
		char c;
		String n;
		for(i=0;i<password.length();i++){
			c=password.charAt(i);
			c=(char)(c+9);
			news=news+c;
		}
		System.out.println(password);
		System.out.println(news);
		for(i=0;i<news.length();i++){
			c=news.charAt(c-9);
			n=n+c;
		}
		System.out.println(n);
		
	}
	
}
