public class Two {
    public static void main(String[] args) {
        /**
         字符的"+"操作
         */
        int i = 10;
        char b = 'A';//值65
        System.out.println(i+b);

        char a = 'a';//数值97
        char c = '0';//数值48
        System.out.println(a+c);

        int g = 10;
        byte g1 = 20;
        double g3 = 12.00;
        char g4 = 'a';
        int s1 = (int) (g + g3 + g4 + g1);
        System.out.println(s1);
        /**
        多个运算符在一起计算,等级顺序
        byte,short,char--int--long--float--double
        多个运算符在一起运算的时候,是自动先将所有数据类型转换成最大的那个数据类型进行计算，所以用别的变量接受结果的时候,需要用最大那个数据类型接受
        如果最后赋值给另一个变量，不想用最大的运算符创建变量，就需要添加强制类型转换符int s1 = (int) (g + g3 + g4 + g1);
         */
    }
}
