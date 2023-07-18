import java.util.Scanner;

public class IF_four {
    public static void main(String[] args) {
        /**
         switch 语句格式
         switch(表达式){       格式说明
            case值1:             表达式:取值为:byte、short、int、char
                语句体1;          case:后面跟的是要和表达式进行比较的值
                break;           break:表示中断,结束的意思,用来结束switch语句
            case值1:             default:表示所有情况都不匹配的情况下,就该执行该地方的内容,和if语句当中的else相似
                语句体2;
                break;
         .....
            default:
                 语句体n个;
                 [break;]
         }

         执行流程:
         首先计算表达式的值
         依次和case后面的值进行比较,如果有对应的值,就会执行相应的语句体,在执行的过程中,遇见break就会结束代码
         如果所有的case后面的值和表达式都不匹配,就会执行default里面的语句体,然后程序结束掉。

         */

        //通过输入的数字,输出对应的星期几
        System.out.println("请输入数字(1-7):");
        Scanner ac = new Scanner(System.in);
        int i = ac.nextInt();

        switch (i){
            case 1:
                System.out.println("星期一");
                break;
            case 2:
                System.out.println("星期二");
                break;
            case 3:
                System.out.println("星期三");
                break;
            case 4:
                System.out.println("星期四");
                break;
            case 5:
                System.out.println("星期五");
                break;
            case 6:
                System.out.println("星期六");
                break;
            default:
                System.out.println("星期日");
        }
    }
}
