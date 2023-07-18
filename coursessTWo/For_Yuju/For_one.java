public class For_one {
    public static void main(String[] args) {
        /**
         for循环语句格式
         for (初始化语句;条件判断语句;条件控制语句){
         循环体语句;
         }
         for执行流程
         执行初始化语句
         执行条件判断语句:看其结果是true,还是false
            如果是false,循环结束
            如果是true,继续执行
         执行循环体语句
         执行条件控制语句
         回到条件判断语句重新循环,直到条件判断语句为false,循环结束为止。
         */

        for (int i = 0;i < 5;i++ ){
            System.out.println("Hello word!");
        }
    }
}
