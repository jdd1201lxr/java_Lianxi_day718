import java.util.Scanner;

public class String_FanZhuan_LianXi {

    /**
     * 字符串反转
     */
    public static void main(String[] args) {
        Scanner ca = new Scanner(System.in);
        String shu = ca.nextLine();

        String h = fan(shu);
        System.out.println(h);
        //System.out.println(shu.length());

    }

    public static String fan(String jie){

        String b= "";
        for (int i=jie.length()-1;i>=0;i--){
            b = b+jie.charAt(i);

        }
        return b;
    }
}
