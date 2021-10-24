
public class Test06 {

	public static void main(String[] args) {
		
		double x[]={-0.5,-3.0,1.0,2.0,2.5,3.0,5.0};
		int i;
		double y;
		for(i=0;i<x.length+1;i++){
			if(x[i]<0&&x[i]!=-3){
				y=x[i]*x[i]+x[i]-6;
			}
			else if(x[i]>=0&&x[i]<10&&x[i]!=2&&x[i]!=3){
				y=x[i]*x[i]-5*x[i]+6;
			}
			else{
				y=x[i]*x[i]-x[i]-6;
			}
			System.out.println("f("+x[i]+")="+y);
		}

	}
}