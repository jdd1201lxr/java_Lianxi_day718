import java.util.Random;

public class FengQiGuo {
    public static void main(String[] args) {
        /**
         需求:朋友聚会的时候可能会玩一个游戏,逢七过。规则是:从任意一个数字开始报数,当你要报的数字包含7或者是7的倍数时都要说过,
         为了帮助大家更好的玩这个游戏,这里我们直接在控制台打印出1-100之间满足逢七过规则的数据
         */
       /* 1-100之间随机数
       Random feng = new Random();
       int number = feng.nextInt(100)+1;*/

        int sum = 0;
        for (int i =1;i<=100;i++){
            if (i%7==0 | i%10==7 | i/10%10==7){
                System.out.println(i+"\t");
                sum++;
            }
        }
        System.out.println(sum+"个");

    }
}
