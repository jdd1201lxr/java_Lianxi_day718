
public class Lei_LianXi_Two {
    public static void main(String[] args) {
        Buildd ca = new Buildd();
        //使用set方法给成员变量赋值
        ca.setAge(18);
        ca.setName("无敌的我");
        ca.show();

        //使用有参构造方法给成员变量赋值
        Buildd ca1 = new Buildd("蒋敦东",18);
        ca1.show();

    }

}

class Buildd{
    private String name;
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Buildd(){
        System.out.println("无参构造方法");
    }
    public Buildd(String names,int ages){
        name  = names;
        age = ages;
    }

    public void show(){
        System.out.println("姓名是:"+name+" , "+"年龄是:"+age);
    }
}
