
public class Test08 {

	public static void main(String[] args) {

		double v0=10,t0=10,g=9.8,s1,s2,s,t1,h;
		t1=v0/g;//上升的时间t=(v-v0)/a
		h=v0*t1-0.5*g*t1*t1;//上升的高度
		s=1./2*g*(t0-t1)*(t0-t1);//下降的高度
		s1=h-s;//位移
		System.out.println("位移为"+s1+"m");
		s2=s+h;
		System.out.println("路程为"+s2+"m");
		
		
	}

}
