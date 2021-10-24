/*数组倒置*/
public class Test04 {

	
	public static void main(String[] args) {
		
		int a[]={1,2,3,4,5,6,7,8,9,0};
		int i,j=a.length-1,t;
		System.out.print("原数组为：");
		for(i=0;i<a.length;i++){
			System.out.print(" "+a[i]);
		}
		for(i=0;i<a.length/2;i++,j--){
			if(i!=j){
				t=a[i];
				a[i]=a[j];
				a[j]=t;
			}
		}
		System.out.print("\n转置后的数组为：");
		for(i=0;i<a.length;i++){
			System.out.print(" "+a[i]);
		}

		
	}
		
}
