/*
使用递归计算1-N的求和
 */
public class MethodDigui04{
    public static void main(String[] args){
        //1-10的和
        int n = 4;
        int retValue = sum(n);
        System.out.println(retValue);
    }
    
    public static int sum(int n){
        if(n==1){
            return 1;
        }
        return n + sum(n-1);
        /*
         4+sun(3)
         3+sum(2)
         2+sum(1)
         4+3+2+1
         */
        
    }
}
