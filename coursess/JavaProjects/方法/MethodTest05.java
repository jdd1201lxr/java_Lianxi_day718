public class MethodTest05{
    public static void main(String[] args){
        merchant(1,2);
        int sum = merchant(10,5);//接收方法结束后的返回值
        //上面是赋值运算符,赋值运算符的右边先执行,将执行结果赋值给左边的变量
        System.out.println(sum);
        
        double suns = merchant(10,3);
        System.out.println(suns);
    }
    public static int merchant(int a,int b){
        return a/b;
    }
}
