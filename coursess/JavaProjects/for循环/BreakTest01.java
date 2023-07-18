/*
 break语句:
    break后面加上";"就是一个完整的Java语句
    
 */

public class BreakTest01{
    public static void main(String[] args){
       a:for(int j=0;j<3;j++){
           b:for(int i=0;i<=10;i++){
                if(i==5){
                    break a;
                }
                System.out.println(i);//这里运行结果是0、1、2、3、4，因为这里的条件是内层循环
               //等于5的时候，跳出循环，这里跳出循环时指定的是跳出外层循环，所以当跳出外层循环时，整个循环就结束了。
               // System.out.println(j);
            }
            
        }
        
    }
}
