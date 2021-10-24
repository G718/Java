import java.util.*;
public class Test13 {
    public static void main(String[] args) {
        int i=0,j,n=10;
        double bmi[]=new double[n];
        double h,h_aver=0,h_min=0,h_max=0,w,w_aver=0,w_min=0,w_max=0;
        String k;
        Scanner scanner=new Scanner(System.in);
        do{
            System.out.print("第"+(i+1)+"个人身高：");
            h=scanner.nextDouble();
            System.out.print("第"+(i+1)+"个人体重：");
            w=scanner.nextDouble();
            if(i==0){
                h_min=h;
                h_max=h;
                w_min=w;
                w_max=w;
            }
            if(h>0&&w>0) {
                bmi[i++] = w / h / h;
                if (h < h_min) {
                    h_min = h;
                }
                if (h > h - h_max) {
                    h_max = h;
                }
                h_aver = h_aver + h;
                if (w < w_min) {
                    w_min = w;
                }
                if (w > w_max) {
                    w_max = w;
                }
                w_aver = w_aver + w;
            }else break;
        }while(h!=-1&&w!=-1);
        h_aver=h_aver/i;
        w_aver=w_aver/i;
        System.out.print("身高平均值："+h_aver+";最大值："+h_max+";最小值："+h_min+"\n");
        System.out.print("体重平均值："+w_aver+";最大值："+w_max+";最小值："+w_min+"\n");
        for(j=0;j<i;j++){
            if(bmi[j]<20){
                k="过轻";
            }else if(bmi[j]>=20&&bmi[j]<25){
                k="适中";
            }else if(bmi[j]>=25&&bmi[j]<30){
                k="过重";
            }else if(bmi[j]>=30&&bmi[j]<35){
                k="肥胖";
            }else{
                k="非常肥胖";
            }
            System.out.print("第"+(j+1)+"个人BMI值为："+String.format("%.2f",bmi[j])+" 体重"+k+"\n");
        }
    }
}
