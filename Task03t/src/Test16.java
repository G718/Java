import java.util.*;
public class Test16 {

	public static void main(String[] args) {
		
		int i,j,k;
		int a[]={1,2,5,6,9};
		int b[]=new int[6];
		System.out.print("ԭ���飺");
		for(i=0;i<a.length;i++){
			System.out.print(String.format("%2d",a[i]));
		}
		Scanner scanner=new Scanner(System.in);
		System.out.print("\n����һ��������");
		k=scanner.nextInt();
		for(i=0,j=0;i<a.length;i++){
			if(a[i]>k&&i==j){
				b[j++]=k;
			}
			b[j++]=a[i];
		}
		System.out.print("\n������Ԫ�ص����飺");
		for(j=0;j<b.length;j++){
			System.out.print(String.format("%2d",b[j]));
		}
	}
	
}
