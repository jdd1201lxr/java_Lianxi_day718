
public class OOTest05{
    public static void main(String[] args){
        //创建一个丈夫对象
        Husband zhang = new Husband();
        //zhang.name = "无名";
        //创建一个妻子对象
        Wift qizi = new Wift();
        //qizi.name = "有名";
        //需求:结婚(通过丈夫类能访问到妻子类当中的属性。通过妻子类能访问到妻子类当中的属性)
        zhang.users = qizi;
        qizi.b = zhang;
        
        //得到以上妻子类当中的名称
        System.out.println("妻子名称是:"+zhang.users.name);
    }
}
