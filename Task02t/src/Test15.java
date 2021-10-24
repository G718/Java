import java.util.*;
public class Test15 {

	public static void main(String[] args) {
		
		int year,month;
		Scanner sc=new Scanner(System.in);
		int[] mon={31,28,31,30,31,30,31,31,30,31,30,31};
		System.out.print("年份：");
		year=sc.nextInt();
		System.out.print("月份：");
		month=sc.nextInt();
		if(year%4==0&&year%100!=0||year%400==0){
			if(month==2){
				mon[month-1]=mon[month-1]+1;
			}
		}
		System.out.println(year+"年"+month+"月一共有"+mon[month-1]+"天");
	}
	
}
