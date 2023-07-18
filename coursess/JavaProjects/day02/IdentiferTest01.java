public class IdentiferTest01
{
    
    static int k = 200;
    
    public static void main(String[] args){
        int i = 100;
        System.out.println(i);
        
        
        /*
         for (int a=0;a<1-;a++){
        
        }
        System.out.println(a);
         这种是无法访问到for循环中的a的，因为for循环中的变量只能在循环中访问，就是for循环({})括起来的代码
         */
        
        int j; //如果事先在for循环外面声明了变量，则这里访问的变量就是上面层级的j，这里的for循环的上面层级是(main)
        for(j=0;j<10;j++){
            
        }
        System.out.println(j); //这种是可以访问，因为才开始在for循环外声明了int j;
    }
        

    
    public static void dosme(){
        System.out.println(k);
    }
}
        
/*
        i = 400;
        System.out.println(i);
        
         
        
        
        i = 900000;
        System.out.println(i);
 */

