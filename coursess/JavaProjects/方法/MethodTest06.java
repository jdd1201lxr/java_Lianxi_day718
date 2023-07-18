/*
 带有return关键字的语句
    *带有return关键字的Java语句只要执行，所在的方法执行结束
    
    *在同一个作用域当中，return语句下面不能编写任何代码，因为这些代码永远都执行不到，所以编译报错
 */
public class MethodTest06{
    public static void main(String[] args){
        int i = zuns();
        System.out.println(i);
    }
    public static int zuns(){
        return 10 > 3 ? 1:0;
    }
}
