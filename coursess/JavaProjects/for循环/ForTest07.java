public class ForTest07{
    public static void main(String[] args){
        int count = 0;

        for(int i=2;i<=100;i++){
            boolean fr= true;
            for(int j=2;j<i;j++){
                if(i % j==0){
                   fr=false;
                    break;
                }
                
            }
            if(fr==true){
                System.out.print(i+" ");
                count++;
                if(count%8==0){
                    System.out.println();
                }
            }
        }
    }
        
}
/*
 实现1--100之间找到所有的素数并且每八个换一行
 */

/*
for (int j = 1; j <= 9; j++) {//外层循环 也就是乘法的第一个数
                    for (int i = 1; i <= j; i++) {//内层循环，乘法的第二个数
                        System.out.print(j+"*"+i+"="+(j*i)+"\t");
                    }
                    //System.out.println();
                }
 /*
/*
 实现九九乘法口诀
 */
