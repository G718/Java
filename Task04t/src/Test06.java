import java.util.*;
public class Test06 {

	public static void main(String[] args) {
		
		String user,pass;
		int i=0;
		Scanner scanner=new Scanner(System.in);
		while(i++<3){
			System.out.print("用户名：");
			user=scanner.next();
			System.out.print("密   码：");
			pass=scanner.next();
			if(!user.equals("admin")){
				System.out.println("该用户不存在，请重新输入…");
				continue;
			}
			if(!pass.equals("123456")){
				System.out.println("密码不准确，请重新输入…");
				continue;
			}
			System.out.println("欢迎"+user+"光临！");
			break;
		}
		if(i>3){
			System.out.println("对不起，请下次再试…");
		}
	}
	
}
