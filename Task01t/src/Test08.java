
public class Test08 {

	public static void main(String[] args) {

		double v0=10,t0=10,g=9.8,s1,s2,s,t1,h;
		t1=v0/g;//������ʱ��t=(v-v0)/a
		h=v0*t1-0.5*g*t1*t1;//�����ĸ߶�
		s=1./2*g*(t0-t1)*(t0-t1);//�½��ĸ߶�
		s1=h-s;//λ��
		System.out.println("λ��Ϊ"+s1+"m");
		s2=s+h;
		System.out.println("·��Ϊ"+s2+"m");
		
		
	}

}
