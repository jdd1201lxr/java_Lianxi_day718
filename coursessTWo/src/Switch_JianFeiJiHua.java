import java.util.Scanner;

public class Switch_JianFeiJiHua {
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
    public static void main(String[] args) {
        Scanner ca = new Scanner(System.in);
        System.out.println("请输入今天星期数,如:星期一、星期二...:");
        String xiqi = ca.next();
        switch (xiqi){
            case "星期一":
                System.out.println("跑步");
                break;
            case "星期二":
                System.out.println("游泳");
                break;
            case "星期三":
                System.out.println("慢走");
                break;
            case "星期四":
                System.out.println("动感单车");
                break;
            case "星期五":
                System.out.println("拳击");
                break;
            case "星期六":
                System.out.println("爬山");
                break;
            case "星期日":
                System.out.println("好好吃一顿");
                break;
            default:
                System.out.println("输入有误");
                break;

        }
    }
}
