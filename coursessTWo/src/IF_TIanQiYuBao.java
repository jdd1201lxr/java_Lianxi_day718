import java.util.Scanner;

public class IF_TIanQiYuBao {
    public static void main(String[] args) {
        System.out.println("请输入1-7数字之间,可以通过你输入的文字判断对应星期几:");
        Scanner ac = new Scanner(System.in);
        int i = ac.nextInt();

        if (i == 1){
            System.out.println("今天星期一");
        }else if (i==2){
            System.out.println("今天星期二");
        }else if (i==2){
            System.out.println("今天星期三");
        }else if (i==2){
            System.out.println("今天星期四");
        }else if (i==2){
            System.out.println("今天星期五");
        }else if (i==2){
            System.out.println("今天星期六");
        }else {
            System.out.println("今天星期天");
        }
    }
}
