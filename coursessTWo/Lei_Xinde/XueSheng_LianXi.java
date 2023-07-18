public class XueSheng_LianXi {
    public static void main(String[] args) {
        Xuesheng ca = new Xuesheng();
        ca.soccre();
        ca.zuoye();

        System.out.println(ca.mingzi+", "+ca.age);

    }
}

//学生类
class Xuesheng{
    String mingzi = "网报";
    int age = 18;

    public void soccre(){
        System.out.println("在学校");
    }
    public void zuoye(){
        System.out.println("写作业");
    }
}
