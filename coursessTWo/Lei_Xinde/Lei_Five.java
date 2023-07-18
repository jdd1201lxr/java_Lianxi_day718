public class Lei_Five {
    public static void main(String[] args) {
        //多个对象指向相同引用
        Di yi = new Di();
        yi.age=18;
        yi.name = "蒋敦东";
        System.out.println(yi.name+","+yi.age);

        Di er = yi;
        er.name = "蒋敦东2";
        er.age = 1999;
        System.out.println(yi.name+","+yi.age);
        System.out.println(er.name+","+er.age);
    }
}
class Di{
    String name;
    int age;

    public void stund(){
        System.out.println(name+","+age);
    }
}
class Er{

}

