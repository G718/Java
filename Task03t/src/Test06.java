/*Ñî»ÔÈı½Ç*/
public class Test06 {

    public static void main(String[] args) {

        int i,j,n=10;
        int a[]=new int[n];
        int b[]=new int[n];
        for(i=1;i<=n;i++){
            a[0]=a[i-1]=1;
            b[0]=b[i-1]=1;
            for(j=n-i;j>0;j--){
                System.out.print(" ");
            }
            j=1;
            while(i>=3&&j<i-1){
                b[j]=a[j]+a[j-1];
                j+=1;
            }
            for(j=0;j<i;j++) {
                a[j] = b[j];
            }
            for(j=0;j<i;j++){
                System.out.print(" "+a[j]);
            }
            System.out.println();
        }

    }

}