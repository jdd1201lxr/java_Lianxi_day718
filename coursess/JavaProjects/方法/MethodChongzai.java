/*
 
 方法重载:
 方法重载要被称为:overload

 什么时候考虑使用方法重载:
     1、功能相似的时候,尽可能让方法名相同,但是功能不相似的时候,尽可能让方法名不同

 什么条件满足之后构成了方法重载
     1、在同一个类当中
     2、方法名相同
     3、多个方法的功能相似
     4、Java的方法重载，就是在类中可以创建多个方法，它们可以有相同的名字，但必须具有不同的数据类型形参，或者是形参的个数不同。调用方法时通过传递给它们的不同形参个数和数据类型的参数来决定具体使用哪个方法
 
怎么情况下方法重载
 public static后的参数数据类型不同时、参数的个数不同时、参数顺序不同时
 调用方法时通过传递给它们的不同形参个数、数据类型的参数，来决定具体使用哪个方法
 */
public class MethodChongzai{
    public static void main(String[] args){
        System.out.println(sum(100L,100L));
        //System.out.println(sum(100,10));
        //这里运行结果就是System.out.println("long"+"="+ a);因为形参后面我加了L，就是调用long的方法

    }
    
    public static int sum(int a,int b){
        System.out.println("int"+"="+ a);
            return  a+b;
    }
    public static float sum(long a,long b){
        System.out.println("long"+"="+ a);
            return  a-b;
        
    }
}
