public class MethodTest03{
    public static void sum(int a,int b){
        System.out.println(a+"+"+b+"="+(a+b));
        MethodTest03.dosome();
        }//定义一个方法为“sum”
    public static void main(String[] args){
        //这里是主方法，作为整个程序的入口，但是可以不需要写到第一行
        MethodTest03.sum(1,5);//在主方法里面调用其他的“方法”
        //MethodTest03.dosome();
    }
    public static void dosome(){
        System.out.println("do some?");
    }
}
