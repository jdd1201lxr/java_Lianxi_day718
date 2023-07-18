public class FangFa_one {
    public static void main(String[] args) {
        /**
         方法:方法的定义和调用
         方法定义:public static void i(){方法定义的时候,有void代表没返回数据,方法名就不需要数据类型
            方法体
         }
         方法定义:public static int i(){方法定义的时候,没有void代表有返回数据,方法名需要数据类型
            方法体
         }
         */
       /* 动态数组&静态数组
       int[] oo = new int[3];
        oo[0]=2;
        System.out.println(oo[0]);

        int[] i1 = {1,2,3,4};
        for (int i =0;i<i1.length;i++){
            System.out.println(i1[i]);
        }*/

       /* 两个数组指向同一个数组内存
       int[] i = {1,2,3,4};
        int[] b = i;
        b[0]=55;
        System.out.println(i[0]);*/

        //最大值
        int[] max1 = {1,222,333,444,555,666,77};
        int max = max1[0];
        for (int i=1;i<max1.length;i++){
            if (max1[i]>max){
                max = max1[i];

            }

        }
        System.out.println(max);




    }

}
