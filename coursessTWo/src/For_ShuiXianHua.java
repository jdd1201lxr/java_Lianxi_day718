public class For_ShuiXianHua {
    public static void main(String[] args) {
        /**
         控制台打印出100--999之间的水仙花数,(水仙花数--个、十、白位置上的每个数字的3平方相加等于本身的就是水仙花数)
         */
        for (int i = 100;i<=999;i++){

            //个位数
            int b = i%10;

            //百位数
            int c = i/100;

            //十位数
            int a = i/10;
            int v = a%10;

            if((c*c*c)+(v*v*v)+(b*b*b)==i){
                System.out.println("水仙花数字是这几个:"+i);
            }


        }

    }
}
