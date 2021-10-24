/*打印1、2、3…、100的和；并分别打印奇数、偶数之和。*/
public class Test01 {

	public static void main(String[] args) {
		
		int i,k=0,m=0,n=0;
		for(i=1;i<=100;i++){
			k=k+i;
			if(i%2!=0){
				m=m+i;
			}else{
				n=n+i;
			}
		}
		System.out.println("1~100之和为："+k);
		System.out.println("1~100的奇数之和为："+m);
		System.out.println("1~100的偶数之和为："+n);
	}
	
}
