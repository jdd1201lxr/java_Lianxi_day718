// public：表示公开的 class：表示定义一个类  HelloWord：类名
//定一个公开的类，起名HelloWord

/*
 public：公开的
 static:表示静态的
 void:表示空
 main:表示方法名是main
 (String[] args):是一个main方法的形式参数列表
 */
public class HelloWord { //类体。类体下不能直接编写Java语句，除非声明变量意外以外
    
    
    //方法体部分。以下的方法是一个程序的主方法，是程序的执行入口，一下写法是固定写法
    public static void main(String[] args) {    //表示定义一个公开的静态的主方法
        
        
        //Java语句部分以";"终止
        //以下这样的代码的作用是向控制台输出一段信息
        System.out.println("HelloWord");
    }
}
