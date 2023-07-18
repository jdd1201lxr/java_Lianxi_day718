






public class OOTest07{
    public static void main(String[] args){
        Xue a = new Xue();
        a.om = 13123;
        a.name = "张某人";
    
        Jsuan b = new Jsuan();
        b.pin = "联想";
        b.xing = "HZKT12321";
        b.yan = "红色";
        
        System.out.println(a.dian);
        
        //将Jsuan类的对象的地址赋值给Xue类中的dian实例变量，就可以通过Xue类中的dian实例变量访问
        //Jsuan类中的数据
        a.dian = b;
        
        System.out.println("学号为:"+a.om+"名字是:"+a.name+"正在使用"+a.dian.pin+"品牌的电脑"+"电脑型号是:"+a.dian.xing+"颜色是:"+a.dian.yan);
    }
}
