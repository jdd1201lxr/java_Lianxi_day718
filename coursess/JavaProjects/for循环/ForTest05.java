/*
 计算1--100所有奇数的和
 */
public class ForTest05{
    public static void main(String[] args){
        int sum = 0;
        for(int i = 1;i<=100;i=i+2){
            //System.out.println(i);
            
            sum=sum+i;//
            

        }
        System.out.println(sum);
        //System.out.println(sum);
        
        
        
        //for循环嵌套for循环
        /*
         内层循环中的变量名不能与外层循环的变量名重名
            循环体内不管写的什么代码，外层循环代码的循环次数是多少次，内层也要循环多少次，就算
            更行表达式不满足布尔表达式的结果也会跟着外层循环，循环对应的次数(当内层循环的更新表达式不满足布尔表达式时，就会重新开始内层循环的代码，就会重新从初始化表达式循环开始)
         */
        for(int i = 1;i<=10;i++){//
            for(int j=0;j<3;j++){//0、1、2
                //System.out.print(j);//最后结果就是10个0、1、2，
                                    //根据外层循环十次内层循环结果（0、1、2）
            }
        }
        for(int i = 1;i<=10;i++){
            for(int j=0;j<3;j++){
                for(int k=0;k<3;k++){
                    System.out.println(k);//结果是30个0、1、2
                }
            }
        }
        

    }
}
