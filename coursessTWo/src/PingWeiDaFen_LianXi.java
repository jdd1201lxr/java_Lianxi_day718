import java.util.Scanner;

public class PingWeiDaFen_LianXi {
    public static void main(String[] args) {
        //先定一个动态数组--有利于后面接受6为评委的分数信息
        int[] arr = new int[6];

        Scanner ca = new Scanner(System.in);
        //通过for循环得到6个评委的打分
        for (int i=0;i<arr.length;i++){
            System.out.println("请输入第"+(i+1)+"个评委的打分");
            arr[i]=ca.nextInt();
        }

        //评委得分
        printArr(arr);

        //最大值
        int max_return = max(arr);
        //System.out.println("评委中最大分是:"+max_return+"分");

        //最小值
        int min_return = min(arr);
        //System.out.println("评委中最小分是:"+min_return+"分");

        //所有元素和
        int sum_return = sum(arr);
        //System.out.println("6六位评委总得分"+sum_return+"分");

        //根据计算规则来计算平均分(6位评委中去掉最大分和最小的分数相加除4)
        int avg = (sum_return - max_return - min_return)/(arr.length - 2);
        System.out.println("选手最终得分"+avg+"分");


    }
    //循环遍历得分数组信息
    public static void printArr(int[] arr){
        //System.out.print("[");
        for (int i=0;i<arr.length;i++){
            if(i==arr.length-1){
                //System.out.print(arr[i]);
            }else {
                //System.out.print(arr[i]+", ");
            }
        }
        //System.out.println("]");
    }
    //最大值
    public static int max(int[] arrmax){
        int max = arrmax[0];
        for (int i=0;i<arrmax.length;i++){
            if (arrmax[i] > max ){
                max = arrmax[i];
            }
        }
        return max;
    }
    //最小值
    public static int min(int[] arrmin){
        int min = arrmin[0];
        for (int i=0;i<arrmin.length;i++){
            if (arrmin[i] < min){
                min = arrmin[i];
            }
        }
        return min;
    }
    public static int sum(int[] arrsum){
        int sums = 0;
        for (int i=0;i<arrsum.length;i++){
            sums = sums+arrsum[i];
        }
        return sums;
    }


}

