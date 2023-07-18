/*
 每一个类中可以编写多个主方法，但是一般情况下
 一个系统当中只有一个入口，所以一般情况下只写一个
 */
public class ProductTest{
    public static void main(String[] args){
        
        //创建一个商品对象
        //iPhone7是局部变量
        //iPhone7是引用
        //iPhone7变量中保存了内存地址指向堆内存当中的商品对象
        Product iphone7 = new Product();
        
        System.out.println("商品的编号"+iphone7.productNo);
        System.out.println("商品的单价"+iphone7.price);
        
        iphone7.productNo = 13123;
        iphone7.price = 135.8;
        
        System.out.println("商品的编号"+iphone7.productNo);
        System.out.println("商品的单价"+iphone7.price);
        
    }
}
