public class For_QiuHe {
    public static void main(String[] args) {
        /**
         求和:求1-5之间的数据和,并且输出在控制台
         */
        //自己做出来的
        for (int i=1;i<=5;i++){
            for (int b = 2;b<=5;b++){
                i = i+b;
            }
            System.out.println(i);
        }

        //简单点的
        int sum = 0;
        for (int i=1;i<=5;i++){
            sum = sum+i;

        }
        System.out.println(sum);

    }


}
