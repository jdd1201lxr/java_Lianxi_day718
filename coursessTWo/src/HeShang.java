import static sun.swing.MenuItemLayoutHelper.max;

public class HeShang {
    public static void main(String[] args) {
        //有三个身高,分别是(150cm、210cm、165cm)请用程序实现获取这三个和尚的最高身高
        double a1 = 150.0;
        double a2 = 210.0;
        double a3 = 165.0;
        double weigit1 = (a1 >= a2) ? a1:a2;

        double weigit2 = (weigit1 > a3) ? weigit1:a3;
        System.out.println("最高身高是:"+weigit2);
    }
}
