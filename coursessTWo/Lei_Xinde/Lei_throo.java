public class Lei_throo {
    public static void main(String[] args) {
        //使用成员变量
        Lei_Two ca1 = new Lei_Two();
        System.out.println(ca1.shouji);
        System.out.println(ca1.jiage);

        //给成员变量赋值
        ca1.shouji = "小米";
        ca1.jiage = 1312;
        System.out.println(ca1.shouji);
        System.out.println(ca1.jiage);
    }
}
