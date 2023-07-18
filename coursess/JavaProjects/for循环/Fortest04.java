/*
 循环语句和条件判断语句嵌套使用(for循环与if语句嵌套使用)
 */

public class Fortest04{
    public static void main(String[] args){
        //找出1--100所有的奇数
        int i;
        for(i = 0;i <= 100;i++){
            if(i%2==1){
                System.out.println(i);
            }
        }
        System.out.println("--------------------------------------");
        for(i = 1;i <=100;i=i+2){
            System.out.println(i);
        }
        int count=0;
        for(int b=1;b<=10;b++){
            for(int h=1;h<=3;h++){
                for(int y=1;y<=5;y++){
                    count++;
                    System.out.println(y);//1\2\3\4\5////
                    
                }
                System.out.println(count);
            }
        }
        
    }
}
