/*
 do...while的语法结构:
 do{
 循环体:
 }while(布尔表达式)
 
 do...while的执行原理: 先执行循环体，在执行while后面的布尔表达式，判断为真还是假，为真继续执行循环体，为假结束循环

 使用do...while循环的注意事项:
 */
public class WhileTest02{
    public static void main(String[] args){
        int l = 10;
        do{
            System.out.println(l);
        }while(l>100);
    }
}
