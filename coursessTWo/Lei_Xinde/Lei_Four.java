public class Lei_Four {
    public static void main(String[] args) {
        onse diyige = new onse();//将第一个创建对象
        twow dierge = new twow();//将第二个类创建对象

        diyige.age = 123123;//将第一个类中的age赋值
        diyige.name = "ddd";//将第一个类中的name赋值


        dierge.lei = diyige;//将第一个类的引用名所保存的堆内存当中的内存地址赋值给第二个类中的lei实例变量,这样第二个类中的lei变量就可以
        //调用第一个类中的方法以及变量类

        dierge.lei.age = 18;//通过第二个类中的类变量调用第一个类中的age变量以及赋值
        dierge.lei.name = "蒋敦东";//通过第二个类中的类变量调用第一个类中的name变量以及赋值
        System.out.println(diyige.age);
        System.out.println(dierge.lei.name);

    }
}
class onse{
    int age;
    String name;

    public void n(){
        System.out.println("第一个类-之第一个方法");
    }
    public void nss(){
        System.out.println("第一个类-之第二个方法");
    }
}

class twow{
    int a;
    onse lei;

    public void ss(){
        System.out.println("第二个类-之第一个方法");
    }

    public void sss(){
        System.out.println("第二个类-之第二个方法");
    }
}
