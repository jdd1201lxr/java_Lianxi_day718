import java.util.Scanner;

public class IF_KaoShi {
    public static void main(String[] args) {
        /**
         需求:小明快要期末考试了,小明爸爸对他说,会根据他不同的考试成绩,送他不同的礼物,假如你可以控制小明的得分,请用程序实现小明
        到底该获得什么礼物,并在控制台输出
        */
        System.out.println("请输入小明的成绩:");
        Scanner ac = new Scanner(System.in);
        int score = ac.nextInt();

        if(score < 0){
            System.out.println("成绩输入错误,范围是0--100");
        }else if (score > 100){
            System.out.println("成绩输入错误,范围是0--100");

        }else if (score <= 100 & score >= 95){
            System.out.println("奖励山地自行车一辆");
        }
        else if (score >= 90 & score <= 94){
            System.out.println("奖励游乐场玩一次");
        }
        else if (score >= 80 & score <= 89){
            System.out.println("奖励变形金刚玩具一个");
        }else {
            System.out.println("啥也没有,打一顿");
        }
    }
}
