//测试程序
public class OOTest06{
    public static void main(String[] args){
        Customer c = new Customer();
        System.out.println(c.id);//0
        
        
        //以下程序会报错(Exception in thread "main" java.lang.NullPointerException)编译可以通过因为符合语法
        //以下程序会在运行出现空指针异常
        //空引用访问"实例"相关的数据一定会出现空指针异常
        //"实例"相关的数据表示:这个数据访问的时候必须有对象的参加，这种数据就是实例相关的数据
        c = null;
        System.out.println(c.id);
    }
}
