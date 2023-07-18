public class LuojiTest{
    public static void main(String[] args){
        //短语与(&&)举例:
                int x = 11;
                int y = 8;
                System.out.println(x > y && ++x < y);
        //前面x > y是为true所以这里不会短路，当前面第一个条件为false时，后面才会出现短路
                System.out.println(x);//x=11
    }
    
}
//短路与(&&)当左边为True时，就会运行括号内右边的关系运算，为false时，右边的运行运算不会运算
//短路或(||)当左边为True，不再进行右边的关系运算，为false时，才会进行进行右边的关系运算
