/**
 * @author 微信搜「沉默王二」，回复关键字 PDF
 */
public class SuperTest01 {
    public static void main(String[] args) {
        new Dog().printColor();
    }
}

class Animal {
    String color = "白色";
}

class Dog extends Animal {
    String color = "黑色";

    public void printColor() {
        System.out.println(color);
        System.out.println(super.color);
    }
}

