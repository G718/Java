
public class Test02 {

	public static void main(String[] args) {
		
		int i=0,j=0,k=0;
		char c,e;
		String s="11cfbks34cdf2ghacdf11";
		String q="cdf";
		for(i=0;i<s.length();i++){
			c=s.charAt(i);
			e=q.charAt(j);
			while(c==e){
				if(j==q.length()-1){
					k++;
					j=0;
					break;
				}
				c=s.charAt(++i);
				e=q.charAt(++j);
				
			}
		}
		System.out.println(q+"出现次数为："+k);
		
	}
	
}
