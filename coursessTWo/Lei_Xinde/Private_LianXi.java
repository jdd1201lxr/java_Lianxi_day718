public class Private_LianXi {
    public static void main(String[] args) {
        StudentTwo two = new StudentTwo();
        two.setName("蒋敦东");
        two.setAge(123);
        two.show();

        //使用get方法获取成员变量的值
        System.out.println(two.getAge()+"---"+two.getName());

    }
}

//学生类
class StudentTwo{
    //成员变量
    private String name;
    private int age;

    public void setName(String nameone){
        name = nameone;
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