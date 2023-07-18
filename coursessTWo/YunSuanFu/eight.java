public class eight {
    public static void main(String[] args) {
        //三元运算符
        /**
         格式:关系表达式?表达式1:表达式2;
         例子:a > b ? a:b;
         计算规则:
         首先计算关系表达式
         如果为true,表达式1的值就是运算结果
         如果为false,表达式2的值就是运算结果
         */
        int a = 10;
        int b = 20;
        int i = a > b ? a : b;
        System.out.println(i);

    }
}
