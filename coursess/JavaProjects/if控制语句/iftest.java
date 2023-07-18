/*
 关于Java当中的if语句，属于选择结构，if语句要被称为分支语句/条件控制语句。
    1、if语句的语法结构:四种编写方式
        第一种:
          if(括号里面的程序最后的结果必须是布尔表达式(true、false)){
            Java语句:
            Java语句:
            Java语句:
            Java语句:
        }
        第二种:
          if(布尔表达式){
            Java语句:
            Java语句:
            Java语句:

        }else{
            Java语句:
            Java语句:
            Java语句
        }
 
        第三种:
          if(布尔表达式){
            Java语句:
            Java语句:
            Java语句:
          }else if(布尔表达式){
            Java语句:
            Java语句:
            Java语句:
          }else if(布尔表达式){
            Java语句:
            Java语句:
            Java语句:
    
        第四种:
         if(布尔表达式){
           Java语句:
           Java语句:
           Java语句:
         }else if(布尔表达式){
           Java语句:
           Java语句:
           Java语句:
         }else if(布尔表达式){
           Java语句:
           Java语句:
           Java语句:
         }else{
           Java语句:
           Java语句:
           Java语句:
         }

 2、重点:对于Java中的if语句来说,只要有一个分支执行,整个if语句全部结束
 3、注意:以上的第二种编写方式和第四种编写方式都带有else分支,这两种方式可以100%保证会有分支执行
 4、所有的控制语句都是可以嵌套使用的,只要合理嵌套就行。
if(){
  if(){
    if(){
 
     }
 }
 
 }else{
    if(){
 
 }else{
    if(){
        if(){
 
             }
         }
     }
 }
 注意;嵌套使用的时候,代码格式要保证完美。(该缩进的时候要缩进)
 5、if语句的分支中只有一条Java语句的话,大括号可以省略不写。
 if(true){
   一条Java语句
 }
 可以这样写:if(ture)一条Java语句
 */

/*
public class iftest{
    public static void main(String[] args){
        //需求:所在位置的五公里范围之内有肯德基的话,去kfc吃午饭
        //公里数
        double distance = 6.0 //单位KM
        //判断语句
        if(distance < 5){
            System.out.println(去KFC吃肯德基)
        }
    }
}

*/






/*
 需求:假设系统给定一个考生的成绩,成绩可能带小数点
    根据学生的成绩判断学生成绩等级
        【90--100】A
        【80--90】 B
        【70--80】 C
        【60-70】  D
        【0--60】  E
*/

//自己编写的代码
public class iftest{
    public static void main(String[] args){
        double number = -12;
        number = 100;
        number = 100;
        String gala = "成绩等级是";
        if(number >= 90 & number <= 100){
             System.out.println("A");
         }else if(number < 90 & number >=80){
             System.out.println("B");
         }else if(number < 80 & number>= 70){
             System.out.println("C");
         }else if(number < 70 & number > 60){
             System.out.println("D");
         }else if(number >= 0 & number <= 60){
             System.out.println("E");
             
         }else{
             System.out.println("请输入0--100分");
         }
         System.out.println(gala);
    }
}
 

