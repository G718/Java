
public class Test11 {

	public static void main(String[] args) {
		
		int a[]={180,158,170,185,189,180,184,185,140,179,192,185,190,165,182,170,190,185,175,180,185,148};
		int i,k,s=0;
		double x=0;
		for(i=0;i<a.length;i++){
			s=s+a[i];
		}
		k=s/a.length;
		for(i=0;i<a.length;i++){
			x=x+Math.pow(a[i]-k, 2);
		}
		x=Math.sqrt(x/a.length);
		System.out.println("平均数为："+k+"\n方差为："+x);
		
	}
	
}
