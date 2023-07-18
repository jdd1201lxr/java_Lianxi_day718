public class Lei_Ten {
    public static void main(String[] args) {
        /**
         构造方法的注意事项
         构造方法的创建:
            如果没有定义构造方法,系统默认给一个无参的构造方法
            如果定义了构造方法,系统将不会在提供无参数构造方法

         构造方法的重载
            如果自定义了带参数的构造方法,还要使用无参数构造方法,就必须再写一个无参数构造方法

         总结:构造方法:Ten_Gouzao ca = new Ten_Gouzao()
         创建构造方法需要跟类名一致,然后需要new关键字来开辟空间,所以右边就是这样的new Ten_Gouzao()
         然后赋值给对应的引用名,因为赋值的数据类型需要是对应的数据类型,所以左边Ten_Gouzao ca代表的就是Ten_Gouza数据类型,引用名为ca

         当有无参构建方法的时候,系统会默认调用并且允许

         */
        Ten_Gouzao ca = new Ten_Gouzao("蒋敦东");
        ca.show();//调用show方法

        Ten_Gouzao ca1 = new Ten_Gouzao();//无参构造方法
        ca1.show();

        Ten_Gouzao ca2 = new Ten_Gouzao(15);
        ca2.show();

        Ten_Gouzao ca3 = new Ten_Gouzao("蒋敦东+1",23);
        ca3.show();
    }
}

class Ten_Gouzao{
    private String name;
    private int age;

    //无参数构造方法
    public Ten_Gouzao(){
        System.out.println("无参构造方法");
    }

    //有参数构造方法
    public Ten_Gouzao(String names){
        this.name = names;
    }

    //有参数的构造方法
    public Ten_Gouzao(int age){
        this.age=  age;
    }

    //有参数构造方法
    public Ten_Gouzao(String name, int age){
        this.age = age;
        this.name = name;
    }

    //实例方法
    public void show(){
        System.out.println(name+" , "+age);
    }
}
