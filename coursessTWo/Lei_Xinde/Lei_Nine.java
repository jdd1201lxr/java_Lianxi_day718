import java.sql.SQLOutput;

public class Lei_Nine {
    public static void main(String[] args) {
        /**
         构造方法
         构造方法的作用是用来创建对象的
         功能是:主要用来完成对象的数据的初始化

         格式:
         public class 类名{
            修饰符 类名(参数){
            }
         }
         范例:
         public class Student{
            public Student(int i...){

            }
         }
         */
        GouZao ca = new GouZao();
        ca.show();
    }
}

class GouZao{
    private String name;
    private int age;

    //构造方法
    public GouZao(){
        System.out.println("无参构造方法");
    }

    //实例方法
    public void show(){
        System.out.println(name+" , "+age);
    }
}
