public class seven {
    public static void main(String[] args) {
        /**
         短路逻辑运算符
         &&(短路与)、||(短路或)
         */
        int i = 10;
        int b = 20;
        int c = 30;
        //短路与
        System.out.println((i>b) && (i>c));//false && false
        System.out.println((i<b) && (i>c));//true && flase
        System.out.println((i>b) && (i<c));//false && true
        System.out.println((i<b) && (i<c));//ture && true
        System.out.println("__________________________");

        //短路或
        System.out.println((i>b) || (i>c));//false || false
        System.out.println((i<b) || (i>c));//true || flase
        System.out.println((i>b) || (i<c));//false || true
        System.out.println((i<b) || (i<c));//ture || true
        System.out.println("__________________________");

        /**
         &&和&(短路与:如果左边为真,右边才会执行(i++ > 100)&&(b++ > 100))右边为真，结果是true,右边为假,结果是false
          如果左边为假,右边程序直接不执行(i++ > 100)&&(b++ > 100),结果为false
         短路与:两边都是true最后结果就是true,两边都是false或者有一个是false,最后结果就是false。
         */

        //System.out.println((i++ > 100)&(b++ > 100));//flase & flase
        System.out.println((i++ > 100)&&(b++ > 100));//flase && flase
        System.out.println("i:"+i+"  "+"b:"+b);//i:11  b:20
        System.out.println("__________________________");

        //||和|
        /**
         短路或:如果左边为假,右边代码执行,两边代码都执行,因为判断左边为假时，相当于执行了代码结果为true。
         如果左边为真,就只执行了左边的代码。结果是true,右边代码不会执行
         短路或:两边结果是true或有一个是true结果就是true,两个都是false，最后结果就是false
         */
        //System.out.println((i++ > 100) || (b++ > 100));//flase || flase | 11、21
        System.out.println((++i > 10) || (b++ > 100));//flase || flase | 11、20
        System.out.println("i:"+i+"  "+"b:"+b);



    }
}
