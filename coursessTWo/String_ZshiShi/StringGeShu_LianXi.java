import java.util.Scanner;

public class StringGeShu_LianXi {
    public static void main(String[] args) {
        /**
         统计字符个数,大写英文有多少？小写英文有多少？数字有多少？
         */
        Scanner ca = new Scanner(System.in);
        System.out.println("请输入一个字符串:");
        String zifu = ca.nextLine();

        int daxie = 0;
        int xiaoxie=0;
        int shuzi = 0;
        for (int i=0;i<zifu.length();i++){
            char ch = zifu.charAt(i);
            if (ch >='A' && ch<='Z'){
                daxie++;
            }else if (ch >= 'a' && ch <= 'z'){
                xiaoxie++;
            }else if (ch>='0' && ch <= '9'){
                shuzi++;
            }
        }
        System.out.println("大写的英文有:"+daxie+" , "+"小写的英文有:"+xiaoxie+" , "+"数字有:"+shuzi);
    }
}
