
public class Test14 {

	public static void main(String[] args) {
		
		int a[]={23,15,67,3,7,1,33};
		int i,j,k,max=a[0],min=a[0],m = 0,n = 0;
		System.out.print("ԭ����:");
		for(i=0;i<a.length;i++){
			System.out.print(String.format("%3d",a[i]));
		}
		for(i=0;i<a.length;i++){
			if(a[i]>max){
				max=a[i];
				m=i;
			}
			if(a[i]<min){
				min=a[i];
				n=i;
			}
			for(j=0;j<i;j++){
				if(a[i]<a[j]){
					k=a[i];
					a[i]=a[j];
					a[j]=k;
				}
			}
		}
		System.out.print("\n���ֵ�ڵ�"+(m+1)+"λ\n"+"��Сֵ�ڵ�"+(n+1)+"λ\n��С����˳��Ϊ��");
		for(i=0;i<a.length;i++){
			System.out.print(String.format("%3d",a[i]));
		}
	}
	
}
