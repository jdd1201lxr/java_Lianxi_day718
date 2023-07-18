import java.util.Scanner;

public class Swtich_ChuXiaQiuDong {
    public static void main(String[] args) {
        /**
         需求:一年有12个月,分别属于春夏秋冬四个季节,键盘输入一个月份,请用程序实现判断该月份属于哪个季节,并输出
         */
        System.out.println("请输入对应的数字(1-12):");
        Scanner ac = new Scanner(System.in);
        int i = ac.nextInt();

        switch(i){
            case 3:
            case 4:
            case 5:
                System.out.println("春季");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("夏季");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("秋季");
                break;
            case 12:
            case 1:
            case 2:
                System.out.println("冬季");
                break;
            default:
                System.out.println("对不起,你的输入有误");
        }
    }
}
