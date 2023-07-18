public class SuperTest02{
    public static void main(String[] args){
        two2 t1 = new two2();
        t1.m1();
        t1.m2();
    }
}
class one1{
    public void m1(){
        System.out.println("第一个类表达式");
    }
}

class two2 extends one1{
    public void m1(){
        
    }
    public void m2(){
        super.m1();
    }
}
