public class Eight_this {
    public static void main(String[] args) {
        /**
         this关键字
         this修饰的变量用于指向成员变量
         方法的形参如果跟成员变量同名,不带this修饰的变量指的是形参,而不是成员变量
         方法的形参如果没有跟成员变量同名,不带this修饰的变量是成员变量

         什么时候使用this:方法的形参跟成员变量同名的时候,需要加上this用来解决局部变量隐藏成员变量
         方法被哪个对象调用,this就代表哪个对象

         this相当于保存当前地址 并且指向堆内存中的对象

         比如说:
         StudenThroo  two = new StudenThroo();
         StudenThroo  one = new StudenThroo();
         有两个对象,每个对象分别调用相同的方法
         two.show();

         此时方法里面的System.out.println(name+" , "+age);中的name和age两个变量前面加上this
         如果是one引用名调用的two.show();方法,此时全局变量中的name和age指向的就是堆内存中one对象中的name和age
         如果是two引用名调用的two.show();方法,此时全局变量中的name和age指向的就是堆内存中two对象中的name和age

         */
        //创建两个对象
        StudenThroo  one = new StudenThroo();
        StudenThroo  two = new StudenThroo();

        one.setAge(12);
        one.setName("蒋敦东");

        two.setAge(14);
        two.setName("李小龙");

        one.show();//one引用名调用的two.show();方法,此时全局变量中的name和age指向的就是堆内存中one对象中的name和age
        two.show();//two引用名调用的two.show();方法,此时全局变量中的name和age指向的就是堆内存中two对象中的name和age
    }
}

//学生类
class StudenThroo{
    //成员变量
    private String name;
    private int age;

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
    public void show(){
        System.out.println(name+" , "+age);
    }
}
