import java.util.Scanner;

public class BianLiString_LianXi {
    /**
     需求:遍历字符串:控制台输入字符串,控制编辑输出每一个字符串中的元素
     charAt方法是返回指定索引处的char值(指定索引处的元素值)
     */
    public static void main(String[] args) {

        Scanner ca = new Scanner(System.in);
        String shu = ca.nextLine();

        //字符串遍历
        for (int i =0;i<shu.length();i++){
            System.out.println(shu.charAt(i));//每一次循环输出,输入的字符串中的第几个字符
            //charAt方法是根据括号里面的索引值访问对应的索引值的数据,而这里的索引值就是每次循环+1的i,这样就会每次索引值都是自加的，达到遍历效果
        }

        //数组遍历
        int[] arr = {1,2,3,4,5,6,4,33,3,333,3,3,3,3};
        for (int i1=0;i1<arr.length;i1++){
            System.out.println(arr[i1]);
        }
    }


}
