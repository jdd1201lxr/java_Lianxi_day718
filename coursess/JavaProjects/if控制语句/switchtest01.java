/*
 关于switch语句;
    1、switch语句是数据选择结构也是分支语句
    2、switch语句的语法结构:
        一个比较完整的switch语句应该这样编写:
            switch(int或String类型的字面值或变量){
                case int或String类型的字面值或变量:
                    Java语句:
 
                 case int或String类型的字面值或变量:
                     Java语句:
                 
                 case int或String类型的字面值或变量:
                     Java语句:
                 
                 case int或String类型的字面值或变量:
                     Java语句:
                    
                    .......
                     break;
 
                 default:
                     Java语句:
                }

    3、switch语句执行原理:
        switch后面小括号当中的“数据”和case后面的“数据”进行一一匹配。匹配成功的分支则执行匹配成功分支下的代码.怎么匹配:按照自上而下的顺序依次匹配。
 
    4、匹配成功的分支则执行匹配成功分支下的代码。分支当中最后有”break“语句的话，整个switch语句终止
 
    5、匹配成功的分支则执行匹配成功分支下的代码。分支当中没有”break“语句的话，直接进入下一个分支执行(不进行匹配)这种现象称为case穿透现象(意思就是当没有break的时候,当满足匹配成功第一个case条件的时候，匹配成功的第一个代码以及后面所有的case语句的代码都会被执行，不管满不满足条件都会直接被输出，直到遇到break的时候就会停止，如果后面语句都没有break就会直接运行完整个程序)。
        比如:
             public class SwitchDemo01 {
                 public static void main(String[] args) {                     char garde = 'C';
              
                     switch (garde){
                         case 'A':
                             System.out.println("优秀");
                             break;
                         case 'B':
                             System.out.println("良好");
                         case 'C':
                             System.out.println("及格");
                         case 'D':
                             System.out.println("再接再厉");
                         case 'E':
                             System.out.println("挂科");
                     }
                 }
             }最后输出结果是:及格、再接再厉、挂科(这里整个switch语句都没加break,所以当case语句匹配成功到case ‘C’的时候。加上case‘C’还有case‘C’后的所有的case语句的代码都会被执行&输出到控制台)
 
 
 
    6、当所有分支都没有匹配成功的话,当有default时，就会执行default后的语句。
    7、switch后面和case后面只能是int或者String类型的数据，不能是探测其他类型
        *当然byte、short、char也可以直接写到switch和case后面，因为他们可以进行自动类型转换
        byte、short、char可以自动转换成int类型。
        *case可以合并
            int i = 1;
            switch(1){
                case 1 :case2:case3:case10;
                    System.out.println("Test Code");
 }
                
 */

public class switchtest01{
    public static void main(String[] args){
/*
        long x = 100L;
        switch(x){} 编译报错,因为switch括号里面只能用int类型的，这里的x是long类型，long类型转int类型，需要加强制类型转换符才能编译通过
        以下是正确的
        long a = 90L;
        switch(int(a)){}

*/
        java.util.Scanner s = new java.util.Scanner(System.in);
        System.out.println("请输入数字来判断今天星期几");
        int num = s.nextInt();
        switch(num){
                case 1:
                System.out.println("今天星期一");
                break;
                
                case 2:
                System.out.println("今天星期二");
                break;
                
                case 3:
                System.out.println("今天星期三");
                break;
                
                case 4:
                System.out.println("今天星期四");
                break;
                
                case 5:
                System.out.println("今天星期五");
                break;
                
                case 6:
                System.out.println("今天星期六");
                break;
                
                case 7:
                System.out.println("今天星期日");
                break;
                
                default:
                System.out.println("对不起，你输入错误");
                
  
                
                //case合并
        switch(num){
                case 1:case 0:
                System.out.println("今天星期一");
                break;
        }
        }
    }
}
