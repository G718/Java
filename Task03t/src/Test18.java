
public class Test18 {

	public static void main(String[] args) {
		
		double m=5300,p=0.1,k=0;
		int t=5,i;
		double a[]=new double[t];
		a[0]=m;
		for(i=0;i<t;i++){
			a[i]=m+m*p;
			m=a[i];
		}
		for(i=0;i<a.length;i++){
			System.out.println("��"+(i+1)+"��ѧ��Ϊ"+a[i]+"Ԫ");
			k=k+a[i];
		}
		System.out.println("1~"+t+"����ѧ��Ϊ"+k+"Ԫ");
	}
	
}
