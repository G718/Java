import java.util.*;
public class Test11 {

    public static void main(String[] args) {

        int i = 0, k = 0, l = 1;//l：单词数
        int j=0,j1=0,j2=0;
        String s;
        char c;
        char d,d1,d2;
        String a = "AND";
        String f = "FOR";
        String t = "THE";
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一串字符");
        s = scanner.nextLine();
        s=s+" ";
        char L[] = new char[s.length()];
        //输入的字符全部转换为大写保存在数组L中
        for(i=0;i<s.length();i++){
        	L[i]=s.charAt(i);
        	if(L[i]>96&&L[i]<123)
        		L[i]=(char)(L[i]-32);
        }
        
        for (i = 0; i < s.length(); i++) {
            c = L[i];
            if (c!=32) {
                k++;
                //and
                if (j < a.length()) {
                    d = a.charAt(j++);
                    if (d != c) {
                        j = 0;
                    }
                    if (j == 3&&k<4) {
                        k = 0;
                        j = 0;
                    }
                }
                //for
                if(j1<f.length()){
                    d1=f.charAt(j1++);
                    if(d1!=c){
                        j1=0;
                    }
                    if(j1==3&&k<4){
                        k=0;
                        j1=0;
                    }
                }
                //the
                if(j2<t.length()){
                    d2=t.charAt(j2++);
                    if(d2!=c){
                        j2=0;
                    }
                    if(j2==3&&k<4){
                        k=0;
                        j2=0;
                    }
                }
            } else {
                if (k > 2) {
                    L[l - 1] = s.charAt(i - k);
                    l++;
                }
                k = 0;
            }
        }
        System.out.println("缩写后的字符为");
        for (i = 0; i < l-1; i++) {
            System.out.print(L[i]);
        }

    }
}