public class String_One {
    /**
     String类在java.lang包下,所以使用的时候不需要导包
     String代表字符串,java程序中所有字符串文案(例如:"abc")都被实现为此类的实例,也就是说,java程序当中所有的双引号
     字符串,都是String类的对象。

     特点:字符串是不可变的,它们的值在创建后不能更改。
     虽然String的值不可变,但是它们可以共享

     String类的构造方法
     public String()                创建一个空白字符,不含任何内容
     public String(char[] arrs)     根据字符数组的内容，来创建字符串对象
     public String(byte[] arrs)     根据字节数组的内容，来创建字符串对象
     String S = "abc";              直接赋值的方式创建字符串对象,内容就是abc
     */
    public static void main(String[] args) {
        //public String() 创建一个空白字符,不含任何内容
        String s1 = new String();
        System.out.println("s1:"+s1);

        //public String(char[] arrs) 根据字符数组的内容，来创建字符串对象
        //无非就是将char数组类型转换成字符串类型,只是输出结果是数组中全部数据拼接在一起的
        char[] arr = {'a','b','c'};
        String s2 = new String(arr);
        System.out.println("s2:"+s2);

        //public String(byte[] arrs) 根据字节数组的内容，来创建字符串对象
        //无非就是将byte数组类型转换成字符串类型,只是输出结果是数组中全部数据拼接在一起的并且输出结果是String底层对应的字符,而不是数字了
        byte[] zz = {97,98,99};
        String s3 = new String(zz);
        System.out.println("s3:"+s3);//这里控制台输出a,b,c-因为97、98、99在字符串底层对应的就是a,b,c,所以输出对应的内存数据

        //String S = "abc"; 直接赋值的方式创建字符串对象,内容就是abc
        String s4 = "abc";
        System.out.println("s4:"+s4);
    }
}
