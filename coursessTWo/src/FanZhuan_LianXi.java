public class FanZhuan_LianXi {
    public static void main(String[] args) {
        /**
         需求:
         将数组中的元素从后往前变换位置
         int[] i = {1,2,3,4,5};变换成:int[] i = {5,4,3,2,1};
         */
        int[] arr = {222,333,444,555,666,777,888,999,1000};
        res(arr);//反转方法
        printArr(arr);//反转后,通过for循环遍历将反转的数据保存到新的数组中



        }


    public static void res(int[] arr){
        for (int start=0,end=arr.length-1;start<=end;start++,end--) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
    }

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
