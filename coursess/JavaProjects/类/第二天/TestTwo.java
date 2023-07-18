//计算机类
class Computer{
    String brand;
    String style;
    String oolor;
}

//学生类
class Student{
    int no;
    String name;
    Computer notepad;
    
}

//测试
public class TestTwo{
    public static void main(String[] args){
        
        //创建笔记本对象
        Computer ji = new Computer();
        ji.brand = "联想";
        ji.style = "KV122";
        ji.oolor = "灰色";
        
        
        //创建学生对象
        Student zhangsan = new Student();
        zhangsan.no = 12321;
        zhangsan.name = "张三";
        zhangsan.notepad = ji;
        
        
        
        //想知道章三笔记本品牌
        System.out.println(zhangsan.name+"笔记本品牌是"+zhangsan.notepad.brand);
        
        
        
        
        //以下代码的意思是直接将Computer类new一个Computer对象直接赋值给zhangsan对象当中notepad变量
        //相当于将Computer对象的内存地址给notepad，这样可以通过notepad去访问Computer类当中的数据
        //跟 Student zhangsan = new Student();这个一个意思，只是变量名字不同
        zhangsan.notepad = new Computer();
        System.out.println(zhangsan.name+"笔记本品牌是"+zhangsan.notepad.brand);
            
        
    }
    
}
