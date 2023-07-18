/*
 不使用递归，计算1-N的和
 */
public class MethodDigui02{
    public static void main(String args[]){
        int n = 100;
        int rests = sum(n);
        System.out.println(rests);
        
    }
    public static int sum(int n){
        int rest = 0;
        for(int i=1;i<=n;i++){
            rest = rest+i;
    }
            return rest;
}
}
