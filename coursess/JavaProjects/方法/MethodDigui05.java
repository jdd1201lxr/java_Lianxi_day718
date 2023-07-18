

public class MethodDigui05{
    public static void main(String[] args){
        int rentuns = sum(5);
        System.out.println(rentuns);
    }
    //以下使用递归方式计算1-5的积
    public static int sum(int n){
        if(n==1){
            return 1;
        }
        return n * sum(n-1);
    }
}
//以下使用正常的方式计算1-5的积
/*
    public static int sum(int n){
        int jia = 1;
        for(int i=1;i<=n;i++){
            jia = jia * i;
        }
        return jia;
    }
*/
     

