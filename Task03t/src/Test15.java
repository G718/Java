
public class Test15 {

	public static void main(String[] args) {
		
		int oldArr[]={1,3,4,5,0,0,6,6,0,5,4,7,6,7,0,5};
		int i,j=0;
		System.out.println("原数组为：");
		for(i=0;i<oldArr.length;i++){
			System.out.print(String.format("%2d", oldArr[i]));
			if(oldArr[i]==0)
				j++;
		}
		int newArr[]=new int[oldArr.length-j+1];
		System.out.println("\n新数组为：");
		for(i=0,j=0;i<oldArr.length;i++){
			if(oldArr[i]!=0){
				newArr[j]=oldArr[i];
				System.out.print(String.format("%2d",newArr[j]));
				j++;
			}
		}

	}
	
}
