/*
方法重载机制:
    在一个类当中,多个方法的功能相似的时候,可以使用方法重载机制
 */

public class MethodTest09{
    public static void main(String[] args){
        
        System.out.println(sum(1,2));
        
        System.out.println(jisi(1,2));
        
        System.out.println(haode(1,2));
        
    }
    public static int sum(int a,int b){
        int suns = a+b;
        return suns;
    }
    public static double sum(double as,double bs){
        double ass = as+bs;
        return ass;
    }
    public static long sum(long ha,long hs){
        long haa = ha+hs;
        return haa;
    }
}
