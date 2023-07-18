public class String_Two {
    /**
     String特点
     通过new创建的字符串对象,每一个new都会申请一个内存空间,虽然可能内容相同,但是地址值是不同的。

     以""双引号,方式给出的字符串,只要字符串数据相同(大小写,顺序),无论在程序代码中出现几次,JVM都只会建立一个String对象,
     并在字符串池中维护
     如下:
     String s1 = "abc";
     String s2 = "abc";
     针对第一行代码,JVM会建立一个String对象放在字符串池中,并给s1参考,第二行则让s2直接参考字符串池中的String(参考s1)对象
     也就说它们的本质上是同一个对象--也就是说等号右边的值是一模一样的时候,变量之间本质上就是同一个对象。
     */
    public static void main(String[] args) {
        //判断两个对象之间的地址是否相等
        char[] arr = {'a','b','c'};
        String s1 = new String(arr);
        String s2 = new String(arr);
        System.out.println(s1==s2);//
        // 这里肯定是不相等的,因为这里new了两个对象(s1\s2),只要new一个对象就会创建新的内存地址,所以这里不相等
        // 只是传递的值是想等的,值也是一个对象




        //判断赋值的数据相等时,内存地址是否是同一个
        String s3 = "abc";
        String s4 = "abc";
        System.out.println(s3==s4);
        //相等的,等号右边的值是一模一样的时候,在堆内存是指向的同一个对象。

        System.out.println(s1==s3);
    }
}
