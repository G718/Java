/*ͨ�ʽan=2(n��1)��3����������{an}ǰ10��֮��*/
public class Test02 {

	public static void main(String[] args) {
		
		int n=1,a=0;
		double b=0,c=0;
		for(n=1;n<=10;n++){
			a=a+2*(n+1)+3;
			if(a%2!=0){
				b=b+a;
			}else{
				c=c+a;
			}
		}
		System.out.println("ǰʮ��֮��Ϊ��"+a);
		System.out.println("ǰʮ����ż����֮��������֮�͵ı�Ϊ��"+c/b);
		
	}
	
}
