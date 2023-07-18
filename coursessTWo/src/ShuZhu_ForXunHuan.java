import java.util.Scanner;

public class ShuZhu_ForXunHuan {
    public static void main(String[] args) {
        int[] arr = new int[6];
        //控制台输入数字
        for (int i=0;i<arr.length;i++){

            System.out.println("请输入第"+(i+1)+"数字");
            Scanner ca = new Scanner(System.in);
            arr[i] = ca.nextInt();

        }
        
        printArr(arr);


    }
    //循环遍历得分数组信息
    public static void printArr(int[] arr){
        System.out.print("[");
        for (int i=0;i<arr.length;i++){
            if(i==arr.length-1){
                System.out.print(arr[i]);
            }else {
                System.out.print(arr[i]+", ");
            }
        }
        System.out.println("]");
    }



}
