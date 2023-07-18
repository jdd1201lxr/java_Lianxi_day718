public class Six {
    public static void main(String[] args) {
        //逻辑运算符

       /**
          逻辑与 &、逻辑或 ｜、逻辑异或 ^、逻辑非 ！
        *  */
       //逻辑与(有false则结果是false,两边都是true得时候,结果都是true)
        int i = 10;
        int b = 20;
        int c = 30;
        System.out.println((i>b) & (i>c));//false & false
        System.out.println((i<b) & (i>c));//true & flase
        System.out.println((i>b) & (i<c));//false & true
        System.out.println((i<b) & (i<c));//ture & true
        System.out.println("__________________________");
       //逻辑或(两边都是false则结果是false,两边有一个是true得时候,结果就是true)
        System.out.println((i>b) | (i>c));//false | false
        System.out.println((i<b) | (i>c));//true | flase
        System.out.println((i>b) | (i<c));//false | true
        System.out.println((i<b) | (i<c));//ture | true
        System.out.println("__________________________");
       //逻辑异或(两边结果相同的时候,结果是false,两边结果不相同的时候,结果是true)
        System.out.println((i>b) ^ (i>c));//false ^ false
        System.out.println((i<b) ^ (i>c));//true ^ flase
        System.out.println((i>b) ^ (i<c));//false ^ true
        System.out.println((i<b) ^ (i<c));//ture ^ true
        System.out.println("__________________________");
       //逻辑非(结果是相反的)
        System.out.println((i>b));//flase
        System.out.println(!(i>b));//! flase
        System.out.println(!!(i>b));//!!flase
        System.out.println(!!!(i>b));//!!!flase

    }
}
