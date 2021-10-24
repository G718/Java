import java.util.*;
public class Test12 {

	public static void main(String[] args) {
		
		int[] a=new int[3];
		int t,i,j;
		Scanner sc=new Scanner(System.in);
		System.out.println("二值排序");
		System.out.print("请输入a的值:");
		a[0]=sc.nextInt();
		System.out.print("请输入b的值:");
		a[1]=sc.nextInt();
		System.out.print("请输入c的值:");
		a[2]=sc.nextInt();
		for(i=0;i<a.length;i++){
			for(j=0;j<i;j++){
				if(a[i]<a[j]){
					t=a[i];
					a[i]=a[j];
					a[j]=t;
				}
			}
		}
		for(i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
	}
	
}
