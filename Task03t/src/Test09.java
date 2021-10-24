
public class Test09 {

	public static void main(String[] args) {
		
		int i,j,n=10;
		for(i=1;i<=n;i++){
			for(j=n-i;j>0;j--){
				System.out.print(" ");
			}
			for(j=0;j<i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
}
