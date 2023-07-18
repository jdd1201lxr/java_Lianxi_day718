/*
 关于Java中的"+"运算符
 “+”号运算符在Java语言当中有两个作用
    1、加法运算，求和
    2、进行字符串的连接运算
 
 当"+"号运算符两边的数据都是数字的话,一定是进行加法运算
 当"+"号运算符两边的数据只要有一个数据是字符串，一定会进行字符串连接运算
    并且连接运算之后的结果还是一个字符串类型
 */
public class threetest03{
    public static void main(String[] args){
        int a = 1000;
        int b = 10;
        System.out.println(a+"+"+b+"="+(a+b));
    }
}
