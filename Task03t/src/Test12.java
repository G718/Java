import java.util.*;
public class Test12 {

	public static void main(String[] args) {
		
		int  i,n=10;
		double a[]=new double[n];
		double min=0,max=0,aver=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("输入十个学生成绩；");
		for(i=0;i<n;i++){
//			System.out.print("第"+(i+1)+"个学生成绩：");
			a[i]=sc.nextDouble();
			if(a[i]<min){
				min=a[i];
			}
			if(a[i]>max)
				max=a[i];
		}
		for(i=0,n=0;i<a.length;i++){
			aver=aver+a[i];
		}
		aver=aver/a.length;
		System.out.print("平均成绩："+aver+"\n最高成绩："+max+"\n最低成绩："+min);
		
	}
	
}
