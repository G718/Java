import java.util.*;
public class Test20 {

    public static void main(String[] args) {

        int i=0;
        double s=0,min = 0,max=0,aver=0;
        String d;
        double a[]=new double[1];
        Scanner scanner=new Scanner(System.in);
        System.out.println("¼��ѧ���ɼ���¼�븺��ֹͣ;");
        System.out.print("¼���"+(i+1)+"��ѧ���ɼ�:");
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
            System.out.print("¼���"+(i+1)+"��ѧ���ɼ�:");
            s=scanner.nextDouble();
            if(i>=a.length){
                a=b(a,i);
            }
            a[i++]=s;
        }
        aver=aver/(a.length-1);

        for(i=0;i<a.length-1;i++){
            if(a[i]>=90)
                d="����\t(A)";
            else if(a[i]>=80&&a[i]<90)
                d="����\t(B)";
            else if(a[i]>=70&&a[i]<80)
                d="��\t(C)";
            else if(a[i]>=60&&a[i]<70)
                d="����\t(D)";
            else
                d="������(E)";
            System.out.println("��"+(i+1)+"��ѧ���ɼ�"+a[i]+"�� \t�ɼ�"+d);
        }
        System.out.println("��߷�Ϊ��"+max+"; ��ͷ�Ϊ��"+min+"; ƽ���ɼ�Ϊ��"+aver);
    }
    public static double[] b(double[] a,int j){
        //��չ����
        double b[]=new double[j+1];
        for(j=0;j<b.length-1;j++){
            b[j]=a[j];
        }
        return b;
    }

}
