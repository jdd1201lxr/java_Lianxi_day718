import java.util.Scanner;

public class SanGeHeShang {
    public static void main(String[] args) {
        //通过手动输入三个身高,然后用程序实现获取这三个身高最高的身高
        Scanner ac = new Scanner(System.in);
        System.out.println("请在控制台输入身高值(小数点———>137.89):");
        double a1 = ac.nextInt();
        System.out.println("请在控制台输入身高值(小数点———>137.89):");
        double a2 = ac.nextInt();
        System.out.println("请在控制台输入身高值(小数点———>137.89):");
        double a3 = ac.nextInt();

        //判断身高最高的
        double weigiht = a1 > a2 ? a1:a2;
        double weigiht1 = a3 > weigiht ? a3:weigiht;
        System.out.println("根据你输入的三个身高,我们得出最高的是:"+weigiht1+"Cm");
    }
}
