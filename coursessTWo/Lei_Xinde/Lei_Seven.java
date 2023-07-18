import java.sql.SQLOutput;

public class Lei_Seven {
    /**
     封装
     private关键字
     private关键字是一个权限修饰符,可以修饰成员变量(成员变量和成员方法)
     作用是:保护成员不被别的类使用,被private关键字修饰的成员只能在本类中使用

     针对private关键字修饰的成员变量,如果需要被其他类使用,提供相应的操作
     提供"get 变量名()"方法,用于获取成员变量的值,方法用public修饰
     提供"set变量名(参数)"方法,用于设置成员变量的值,方法用public修饰

     set设置变量的方法--通过调用的时候,传入对应的实参,实参会传递给下面的int acc1,acc1赋值给acc,acc赋值给private int acc;
     get访问变量的方法--通过调用的时候,通过拿取private int acc中的acc的值,然后return给调用者

     举例:
     public String getName(){//访问方法需要有返回值,所以不需要void,
     return name;//这里return name中的name就是private String name所修饰的name变量,
     //因为他是全局变量,所以这里return name,默认是private String name中的name,所以当private String name用set方法修改参数的时候
     //在调用get方法访问,对应的数据就是set方法里面所修改的,如果没调用set修改数据,反问get方法中的变量就是默认值。
     }//等拿到对应数据后,通过return给调用着,因为是有返回值,所以调用着需要用对应的数据类型变量来接收数据


     public void setName(String name){//修改方法没有返回值,所以需要void,这里的String name是形参,调用者通过调用
     //这个方法传递实参,然后形参接受实参的数据给下面等号右边的name;
     this.name = name;//右边等号的name的值对应的就是上面形参里面的值,形参里面的值对应就是调用时候传递的实参,在赋值给左边
     }
     }
     */
    public static void main(String[] args) {
        //创建对象
        Student sc = new Student();

        //调用方法
        sc.setAge(121);
        sc.setName("蒋敦东");
        sc.show();
    }

}

class Student{
    //成员变量
    private String name;
    private int age;

    public String getName(){//访问方法需要有返回值,所以不需要void,
        return name;//这里return name中的name就是private String name所修饰的name变量,
        //因为他是全局变量,所以这里return name,默认是private String name中的name,所以当private String name用set方法修改参数的时候
        //在调用get方法访问,对应的数据就是set方法里面所修改的,如果没调用set修改数据,反问get方法中的变量就是默认值。
    }//等拿到对应数据后,通过return给调用着,因为是有返回值,所以调用着需要用对应的数据类型变量来接收数据


    public void setName(String name){//修改方法没有返回值,所以需要void,这里的String name是形参,调用者通过调用
        //这个方法传递实参,然后形参接受实参的数据给下面等号右边的name;
        this.name = name;//右边等号的name的值对应的就是上面形参里面的值,形参里面的值对应就是调用时候传递的实参,在赋值给左边
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age){

        if (age < 0 | age > 120){
            System.out.println("你给的数字有误");
        }else {
            this.age = age;
        }
    }


    //成员方法
    public void show(){
        System.out.println(name+" , "+age);
    }
}
