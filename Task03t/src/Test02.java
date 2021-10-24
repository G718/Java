/*通项公式an=2(n＋1)＋3，计算数列{an}前10项之和*/
public class Test02 {

	public static void main(String[] args) {
		
		int n=1,a=0;
		double b=0,c=0;
		for(n=1;n<=10;n++){
			a=a+2*(n+1)+3;
			if(a%2!=0){
				b=b+a;
			}else{
				c=c+a;
			}
		}
		System.out.println("前十项之和为："+a);
		System.out.println("前十项中偶数项之和与奇数之和的比为："+c/b);
		
	}
	
}
