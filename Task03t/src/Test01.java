/*��ӡ1��2��3����100�ĺͣ����ֱ��ӡ������ż��֮�͡�*/
public class Test01 {

	public static void main(String[] args) {
		
		int i,k=0,m=0,n=0;
		for(i=1;i<=100;i++){
			k=k+i;
			if(i%2!=0){
				m=m+i;
			}else{
				n=n+i;
			}
		}
		System.out.println("1~100֮��Ϊ��"+k);
		System.out.println("1~100������֮��Ϊ��"+m);
		System.out.println("1~100��ż��֮��Ϊ��"+n);
	}
	
}
