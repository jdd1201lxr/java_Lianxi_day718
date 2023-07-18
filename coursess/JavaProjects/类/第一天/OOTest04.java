public class OOTest03{
    public static void main(String[] args){
        User u = new User();
        //将User类在堆内中创建出一个"User"的对象，里面保存了User类里面所有的属性(变量)
        Address a = new Address();
        //将Address类在堆内中创建出一个"User"的对象，里面保存了Address类里面所有的属性(变量)
        u.addr = a;
        //将Address对象赋值给User中addr实例变量，这样就在这个类里面访问Address和User里面所有的数据
    }
}
