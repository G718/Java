
public class Test01 {

	public static void main(String[] args) {

		double y = 0,x=Math.log(3)/Math.log(2);
		while(x<4){
			x=x+1;
		}
		if(x>=4){
			y=Math.pow(1./2, x);
		}
		System.out.println(y);
		
	}

}
