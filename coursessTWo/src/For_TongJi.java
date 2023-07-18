public class For_TongJi {
    public static void main(String[] args){
        int count = 0;
        for (int i = 100;i<=999;i++){

            //个位数
            int b = i%10;

            //百位数
            int c = i/100;

            //十位数
            int a = i/10;
            int v = a%10;

            if((c*c*c)+(v*v*v)+(b*b*b)==i){
                count++;

            }


        }
        System.out.println("水仙花一共有:"+count+"个");
    }
}
