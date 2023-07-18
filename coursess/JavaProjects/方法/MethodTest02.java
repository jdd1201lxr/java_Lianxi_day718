public class MethodTest02{
    public static void main(String[] args){
        MethodTest02.sum(1,2);//两个实参对应两个形参(a,b)
        MethodTest02.sum(2,2);
        int a = 100;
        MethodTest02.sum(a,2);
}
    
    public static void sum(int a,int b){
        System.out.println(a+"+"+b+"="+(a+b));
    }
        
}
