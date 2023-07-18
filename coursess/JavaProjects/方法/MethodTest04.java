public class MethodTest04{
    public static void main(String[] args){
        MethodTest04.m();
        doOther();
    }
    public static void m(){
        System.out.println(" m ios & android");
    }
}
class MethodTest{
    public static void doOther(){
        System.out.println("MethodTest invoke !");
    }
}


