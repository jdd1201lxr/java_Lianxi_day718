import java.util.Scanner;

public class String_Lianxi_YonghuDenglu {
    public static void main(String[] args) {
        /**
         需求:已知用户的账户和密码,请用程序实现模拟用户登录,总共三次机会,登录之后,给出相应提示
         */
        Scanner denglu = new Scanner(System.in);
        for (int i=0;i<3;i++){

            System.out.println("请输入账户:");
            String zhanghao = denglu.nextLine();

            System.out.println("请输入密码:");
            String mima = denglu.nextLine();


            String true_zhanghao = "l156951779";
            String true_mima = "lxr5225";


            if (true_zhanghao.equals(zhanghao) && true_mima.equals(mima)){
                System.out.println("登录成功");
                break;
            }else{
                if(2-i==0){
                    System.out.println("你的账户被锁定,请明天登录");
                }else {
                    System.out.println("错误,你还剩"+(2-i)+"次机会");
                }
            }

        }


    }
}
