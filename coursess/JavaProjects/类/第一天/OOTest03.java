//测试类
public class OOTest03{
    public static void main(String[] args){
    //创建User对象
    //u是一个引用
    //u是保存内存地址指向内存的User对象
    User u = new User();
        
        //输出User对象内部实例变量的值
        System.out.println(u.no);
        System.out.println(u.name);
        System.out.println(u.addr);
    
    //修改User对象内部实例变量的值
        u.no = 20;
        u.name = "蒋敦";
        
        //以下代码会先执行new.Address();Address对象
        u.addr = new Address();
        
        u.addr.city = "北京";
        u.addr.street= "五常街道";
        
        System.out.println(u.name+"居住在哪个城市:"+u.addr.city);
        
        System.out.println(u.name+"居住在哪个城市:"+u.addr.city+u.addr.street);
}
}
