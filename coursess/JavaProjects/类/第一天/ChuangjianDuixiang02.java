/*
 对象的创建和使用
 数据类型的默认值
    数据类型                    默认值
 byte、short、long、int        0
 float、double                0.0
 boolean                      false
 char                         /u0000
 引用数据类型                   null(空值)
 */
public class ChuangjianDuixiang02{
    public static void main(String[] args){
        //通过一个类可以实例化N个对象
//( LeiTest01 sku = new LeiTest01();)相当于new一个对象赋值给左边变量，通过左边不同的变量名就可以生成N个对象
        
        //实例化对象的语法:new 类名();
        //new是java语言当中的一个运算符
        //new运算符的作用是创建对象，在JVM堆内存空间当中开辟新的内存空间
        //方法区内存，在类加载的时候，class字节码片段被加载到该内存空间当中
        //栈内存(存储局部变量):方法代码片段执行的时候，会给该方法分配内存空间，在栈内存中压栈
        //堆内存:new的对象在堆内存中存储
        //Student是一个引用数据类型
        //s是一个变量名
        //new LeiTest01()是一个学生对象
        //s是一个局部变量(局部变量在栈内存存储)
        //什么是对象?new运算符在堆内存中开辟的内存空间称为对象
        //什么是引用？引用是一个变量，只不过这个变量中保存了另一个java对象的内存地址
        //Java语言当中，程序员不能直接操作堆内存，Java中没有指针，不像C语言
        //Java语言当中，程序员只能通过"引用"去访问堆内存当中对象内部的实例变量
        //访问是两变量的语法格式:
        //  读取数据:引用.变量名
        //  修改数据:引用.变量名 = 值
        
        LeiTest01 s = new LeiTest01(); //new LeiTest01()是一个学生对象
        
        //访问
        int stuNo = s.no;
        String stuname = s.name;
        boolean stusex = s.sex;
        int stuage = s.age;
        String stuadddrss = s.adddrss;
        
        //修改值
        s.no = 20;
        s.name = "jdd";
        s.sex = true;
        s.age = 22;
        s.adddrss = "湖南";
        
        System.out.println("学号是"+s.no);
        System.out.println("姓名是"+s.name);
        System.out.println("性别是"+s.sex);
        System.out.println("年龄是"+s.age);
        System.out.println("地址是"+s.adddrss);
        
        //再通过类实例化一个全新的对象
        //sku是一个引用
        //sku同时也是一个局部变量
        //LeiTest01是一个变量的数据类型(引用数据类型)
        LeiTest01 sku = new LeiTest01(); //new LeiTest01()是一个学生对象
        System.out.println("学号是"+sku.no);
        System.out.println("姓名是"+sku.name);
        System.out.println("性别是"+sku.sex);
        System.out.println("年龄是"+sku.age);
        System.out.println("地址是"+sku.adddrss);
    }
}
/*
 局部变量在栈内存当中存储
 成员变量(全局变量)中的实例变量在堆内存的Java对象内部存储
 实例变量是一个对象一份，一百个对象有一百份。(上面代码就是两个对象。就有两个实例变量)
 */
