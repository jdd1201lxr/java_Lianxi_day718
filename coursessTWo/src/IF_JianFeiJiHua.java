import java.util.Objects;
import java.util.Scanner;

public class IF_JianFeiJiHua {
    public static void main(String[] args) {
        /**
         需求:输入星期数,显示今天的减肥计划
         周一:跑步
         周二:游泳
         周三:慢走
         周四:动感单车
         周五:拳击
         周六:爬山
         周日:好好吃一顿
         */
        Scanner ca = new Scanner(System.in);
        System.out.println("请输入今天星期数,如:星期一、星期二...:");
        String xingqi = ca.next();


            if (Objects.equals(xingqi, "星期一")) {
                System.out.println("跑步");
            } else if (Objects.equals(xingqi, "星期二")) {
                System.out.println("游泳");
            } else if (Objects.equals(xingqi, "星期三")) {
                System.out.println("慢走");
            } else if (Objects.equals(xingqi, "星期四")) {
                System.out.println("动感单车");
            } else if (Objects.equals(xingqi, "星期五")) {
                System.out.println("拳击");
            } else if (Objects.equals(xingqi, "星期六")) {
                System.out.println("爬山");
            } else if (Objects.equals(xingqi, "星期日")) {
                System.out.println("好好吃一顿");
            } else {
                System.out.println("你输入的有误");
            }

        }

}
