//用户类
public class User{
    //类体下的(下面的变量)变量都是成员变量(全局变量)之实例变量
    
    //用户编号
    //int是一个基本数据类型:整数型
    //no是一个实例变量
    int no;
    
    //用户名
    //String是一个引用数据类型,代表字符串
    //name是一个实例变量
    //name也是一个引用
    String name;
    
    //家庭住址
    //Address是一种引用数据类型,代表Address.class文件中的家庭住址
    //addr也是一个实例变量
    //addr是一个引用
    Address addr;//这个相当于(int addr = 100)你只需要关注addr。Address不需要关注它是数据类型，相当于int addr = 10中int一样。这样的意义在于你可以i通过addr去访问Address类里面的实例变量
}
