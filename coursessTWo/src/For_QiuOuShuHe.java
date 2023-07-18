public class For_QiuOuShuHe {
    public static void main(String[] args) {
        /**
         求1-100的偶数和,并且把结束输出在控制台
         */
        int sum = 0;
        for (int i = 1;i<=100;i++){
            if (i % 2==0){
                sum = sum + i;
            }

        }
        System.out.println(sum);
    }
}
