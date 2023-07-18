/*
 while循环语法结构:
    1、while(布尔表达式){
        循环体
 }
 
 while循环执行原理:
 先判断布尔表达式的结果，如果为真，执行循环体，继续判断布尔表达式的结果，如果为假，退出循环
 
 while循环次数:
 0——n次
 */






     //编写for循环找出1-100中所有素数

public class WhileTest01{
    public static void main(String[] args){
        System.out.println("100以内的素数有：");
        int t = 0;
        for(int i=1;i<=100;i++)
        {
            
            if(i==2){System.out.print(i);continue;}

            for(int j=2;j<i;j++)
            {
                if (i%j==0)
                {
                    break;
                }
                    if(j==i-1){
                        System.out.print(i+" ");
                        t++;
                    }
            }

            if (t==8)
            {
                System.out.println(" ");
                t=0;
            }
        }
        
    }
}
 
