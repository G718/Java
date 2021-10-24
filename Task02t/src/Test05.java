
public class Test05 {
	public static void main(String[] args) {
		double x[]={-1,0,1,10,12};
		int i;
		double y;
		for(i=0;i<6;i++){
			if(x[i]>0&&x[i]<=10){
				y=Math.abs(Math.log10(x[i]));
			}
			else{
				y=-1./2*x[i]+6;
			}
			System.out.println("f("+x[i]+")="+y);
		}
	}
}
