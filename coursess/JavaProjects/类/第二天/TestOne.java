public class TestOne{
    public static void main(String[] args){
        
        //new一个Ren类
        Ren zhangsan = new Ren();
        
        zhangsan.id = 12321;
        zhangsan.name = "张三";
        zhangsan.sex = true;
        zhangsan.age = 23;
        
        //new一个bieshu类
        Bieshu fangzi = new Bieshu();
        fangzi.mianji = 123.2;
        fangzi.zhuren = zhangsan;
        
        
        System.out.println("房子的主人是"+zhangsan.name);
        
        //房子换主人了
        Ren lisi = new Ren();
        lisi.id = 1112321;
        lisi.name = "李四";
        lisi.sex = true;
        lisi.age = 23;
        
        
        
        System.out.println("房子的主人是"+lisi.name);
    }
}
