import java.util.*;
public class Test20 {

    public static void main(String[] args) {

        int i=0;
        double s=0,min = 0,max=0,aver=0;
        String d;
        double a[]=new double[1];
        Scanner scanner=new Scanner(System.in);
        System.out.println("录入学生成绩，录入负数停止;");
        System.out.print("录入第"+(i+1)+"个学生成绩:");
        s=scanner.nextDouble();
        if(s>=0&&i==0) {
            a[i++] = s;
            max = a[0];
            min = a[0];
        }
        while(s>=0){
            if(s<min)
                min=s;
            if(s>max)
                max=s;
            aver=aver+s;
            System.out.print("录入第"+(i+1)+"个学生成绩:");
            s=scanner.nextDouble();
            if(i>=a.length){
                a=b(a,i);
            }
            a[i++]=s;
        }
        aver=aver/(a.length-1);

        for(i=0;i<a.length-1;i++){
            if(a[i]>=90)
                d="优秀\t(A)";
            else if(a[i]>=80&&a[i]<90)
                d="良好\t(B)";
            else if(a[i]>=70&&a[i]<80)
                d="好\t(C)";
            else if(a[i]>=60&&a[i]<70)
                d="及格\t(D)";
            else
                d="不及格(E)";
            System.out.println("第"+(i+1)+"名学生成绩"+a[i]+"分 \t成绩"+d);
        }
        System.out.println("最高分为："+max+"; 最低分为："+min+"; 平均成绩为："+aver);
    }
    public static double[] b(double[] a,int j){
        //扩展数组
        double b[]=new double[j+1];
        for(j=0;j<b.length-1;j++){
            b[j]=a[j];
        }
        return b;
    }

}
