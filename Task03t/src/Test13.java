import java.util.*;
public class Test13 {
    public static void main(String[] args) {
        int i=0,j,n=10;
        double bmi[]=new double[n];
        double h,h_aver=0,h_min=0,h_max=0,w,w_aver=0,w_min=0,w_max=0;
        String k;
        Scanner scanner=new Scanner(System.in);
        do{
            System.out.print("��"+(i+1)+"������ߣ�");
            h=scanner.nextDouble();
            System.out.print("��"+(i+1)+"�������أ�");
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
        System.out.print("���ƽ��ֵ��"+h_aver+";���ֵ��"+h_max+";��Сֵ��"+h_min+"\n");
        System.out.print("����ƽ��ֵ��"+w_aver+";���ֵ��"+w_max+";��Сֵ��"+w_min+"\n");
        for(j=0;j<i;j++){
            if(bmi[j]<20){
                k="����";
            }else if(bmi[j]>=20&&bmi[j]<25){
                k="����";
            }else if(bmi[j]>=25&&bmi[j]<30){
                k="����";
            }else if(bmi[j]>=30&&bmi[j]<35){
                k="����";
            }else{
                k="�ǳ�����";
            }
            System.out.print("��"+(j+1)+"����BMIֵΪ��"+String.format("%.2f",bmi[j])+" ����"+k+"\n");
        }
    }
}
