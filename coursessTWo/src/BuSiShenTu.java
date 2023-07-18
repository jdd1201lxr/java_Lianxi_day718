import com.sun.prism.shader.Solid_TextureYV12_AlphaTest_Loader;

public class BuSiShenTu {
    public static void main(String[] args) {
        /**
         不死兔子

         一对
         3个月起每个月都生一对兔子
         小兔子长到第三个月后每个月要生一对兔子
         问二十个月后的兔子数量为多少
         第一 1
         第二 1
         第三 2
         第四 3
         第五 5
         第六 8
         第七 13
         第八 21
         */

        int[] arr_shuzu = new int[20];
        arr_shuzu[0]=1;
        arr_shuzu[1]=1;


        for (int i=2;i<arr_shuzu.length;i++){

            arr_shuzu[i]=arr_shuzu[i-2] + arr_shuzu[i-1];
            //第一次循环:arr_shuzu[2] = arr_shuzu[2-2] + arr_shuzu[2-1]=arr_shuzu[0]+arr_shuzu[1]==1+1
            //第二次循环:arr_shuzu[3] = arr_shuzu[3-2] + arr_shuzu[3-1]=arr_shuzu[1]+arr_shuzu[2]==1+2
            //第三次循环:arr_shuzu[4] = arr_shuzu[4-2] + arr_shuzu[4-1]=arr_shuzu[2]+arr_shuzu[3]==3+2
        }
        System.out.println("最后一个数组是:"+arr_shuzu[19]);
    }

}
