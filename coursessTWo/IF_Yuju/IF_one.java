public class IF_one {
    public static void main(String[] args) {
        /**
         流程控制语句分类
         1、顺序结构

         2、分支结构(if、swtich)
            格式:if(关系表达式){
                语句体;
         }
            执行流程:首先计算关系表达式的值、如果关系表达式的值为true,就执行语句体,如果关系表达式的值为false,就不执行语句体
         无论true还是false,还是会执行后面的语句内容。

         3、循环结构(for、while、do...while)

         */
        //分支结构(if语句)
        System.out.println("开始");
        int a = 10;
        int b = 10;

        if (a==b){
            System.out.println("a等于b");
        }else {
            System.out.println("a不等于b");
        }
        System.out.println("结束");
    }
}
