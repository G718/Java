
public class Test17 {

	public static void main(String[] args) {
		
		int t=5,i;
		double p=0.028,n=10000;
		double a[]=new double[t];
		for(i=0;i<t;i++){
			a[i]=n*p;
			n=n+a[i];
		}
		for(i=0;i<a.length;i++){
			System.out.println("��"+(i+1)+"����ϢΪ"+a[i]+"Ԫ");
		}
	}
	
}
