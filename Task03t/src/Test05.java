/*���쳲���������ǰ100��Ŀ*/
public class Test05 {

	public static void main(String[] args) {
		
		int i;
		int a[]=new int[100];
		a[0]=1;
		a[1]=1;
		for(i=2;i<=99;i++){
			a[i]=a[i-1]+a[i-2];
		}
		System.out.print("ǰһ����Ϊ��\n");
		for(i=0;i<100;i++){
			System.out.print(" "+a[i]);
		}
	}
	
}
