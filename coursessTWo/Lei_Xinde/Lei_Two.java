public class Lei_Two {
    /**
     类的定义:
     类的组成(属性和行为)-->(变量和方法)
     属性:在类中通过成员变量来体现,(方法外声明的变量)
     行为:在类中通过成员方法来体现,(和前面的方法相比去掉static关键字即可)

     对象的使用:
     格式:类名 引用名(随意写) = new 类名();
     举例:Lei_Two ca = new Lei_Two();

     成员变量的使用
     格式:引用名.变量名
     举例：ca.shouji

     使用成员变量:
     格式:引用名.方法名();
     举例:ca.call();

     */
    //成员变量
    String shouji;
    int jiage;


    public static void main(String[] args) {
        //使用成员方法
        Lei_Two ca = new Lei_Two();
        ca.call();
        ca.send();
    }
    //成员方法
    public void call(){
        System.out.println("打电话");
    }
    //成员方法
    public void send(){
        System.out.println("发短信");
    }

}
