/*运算符
 赋值运算符
 字符串连接运算符
 三目运算符/三元运算符/条件运算符
 */

/*
 关于Java中的赋值类运算符:
   赋值类运算符包括两种
   *基本的赋值运算符(=)
   *扩展的赋值运算符(+=，-=，/=，%=)
     赋值类的运算符优先级:先执行等号右边的表达式,将执行结果赋值给左边的变量。
 */
public class towtest02{
    public static void main(String[] args ){
        byte i = 10;
        i = i + 5;
        System.out.println(i);
        //这个代码在编译阶段不能通过,因为才开i是byte类型，后面i=i+5时，i+5是默认为int类型
        //然后i是byte类型，小容量转大容量需要加强制类型转换符，所以这个代码在编译阶段不能通过会报错的
        byte z = 18;
        z+=123;
        /*虽然z+=123等同于理解的意思是(z=z+123),但是这个代码是可以通过编译阶段，运行成功的，
         因为z+=123等于(byte(z+123))，他自动已经由小容量转换成大容量，所以这个代码可以通过
         /*
    }
}
