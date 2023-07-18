/*
 实现计算器当中的
    +
    -
    *
    /
    %
 
 实现思路
    1、选择所有数据从键盘输入
    2、使用switch语句进行判断
    3、需要从控制台输入三次:
        第一个数字、运算符、第二个数字
 
 
 */


public class SwitchTest04{
    public static void main(String[] args){
        java.util.Scanner s = new java.util.Scanner(System.in);
        System.out.println("计算系统");
        System.out.print("请输入第一个数字:");
        int num = s.nextInt();
        
        System.out.print("请输入运算符号:");
        String symbol = s.next();
        
        System.out.print("请输入第二个数字:");
        int num2 = s.nextInt();
        
        switch(symbol){
                case "+":
                System.out.println(num+"+"+num2+"运算结果是:"+(num+num2));
                break;
                
                case "-":
                System.out.println(num+"-"+num2+"运算结果是:"+(num-num2));
                break;
                
                case "*":
                System.out.println(num+"*"+num2+"运算结果是:"+(num*num2));
                break;
                
                case "/":
                System.out.println(num+"/"+num2+"运算结果是:"+(num/num2));
                break;
                
                case "%":
                System.out.println(num+"%"+num2+"运算结果是:"+(num%num2));
                break;
                
                default:
                System.out.print("输入错误");
                
    
        }
    }
}
