import java.util.Scanner;

public class ChaZhao_LianXi {
    public static void main(String[] args) {
        /**
         通过键盘输入一个数据,查找该数据在数组中的索引,并在控制台输出找到索引值
         */
        Scanner ca = new Scanner(System.in);
        System.out.println("请输入一个数字:");
        int shuzi = ca.nextInt();
        //上面的代码写的都是手动输入文字到控制台


        //调用方法
        int[] i = {1,2,2323,123,1232343,423,4};
        int gg = fangfa(i,shuzi);
        System.out.println(gg);
    }
    public static int fangfa(int[] arr,int number){

        int index = -1;//定义一个初始值,主要用来输入的数字和数组里元素没对应的就返回-1,有的话就将索引重新赋值给index
        for (int i=0;i<arr.length;i++){//for循环遍历所有的数组元素
            if (number == arr[i]){//判断控制台输入的数字与数组中的元素是否相等
                index = i;//如果相等,index重新赋值,赋值的是数组里面的索引
                break;//然后跳出循环
            }
        }return index;//循环和判断语句走完后,返回想要的数据
    }
}
