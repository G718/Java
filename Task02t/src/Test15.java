import java.util.*;
public class Test15 {

	public static void main(String[] args) {
		
		int year,month;
		Scanner sc=new Scanner(System.in);
		int[] mon={31,28,31,30,31,30,31,31,30,31,30,31};
		System.out.print("��ݣ�");
		year=sc.nextInt();
		System.out.print("�·ݣ�");
		month=sc.nextInt();
		if(year%4==0&&year%100!=0||year%400==0){
			if(month==2){
				mon[month-1]=mon[month-1]+1;
			}
		}
		System.out.println(year+"��"+month+"��һ����"+mon[month-1]+"��");
	}
	
}
