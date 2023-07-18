/*
 关于方法的递归调用
    1、什么是递归:
        方法自身调用自身
    2、递归是很耗费栈内存的，尽量不要使用递归
    3、递归必须有结束条件，没有结束条件一定会发生栈内存溢出错误
    4、递归即使有结束条件，即使结束条件是正确的，也可能会发生栈内存溢出错误，因为递归的太深了
 注意事项:
    递归可以不使用尽量别使用
    但是有些情况下该功能的实现必须依靠递归方式，例如:目录拷贝。
 */
//以下情况就是递归
public class MethodDigui{
    public static void main(String[] args){
        dosone();
    }
    public static void dosone(){
        System.out.println("dosone busin");
        dosone();
        //System.out.println("结束了没");
    }
}
