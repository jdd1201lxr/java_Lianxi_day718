import java.util.Scanner;

//输入任何一个整数,实现判断该整数是偶数还是奇数,并且在控制台输出对应的结果
public class IF_JiShuOuShu {
    public static void main(String[] args) {
        Scanner ac = new Scanner(System.in);

        System.out.println("请输入一个整数(如:100、454):");
        int i = ac.nextInt();

        if(i % 2 == 0){
            System.out.println("你输入的:"+i+"是偶数");
        }else{
            System.out.println("你输入的:"+i+"是奇数");
        }
    }
}
