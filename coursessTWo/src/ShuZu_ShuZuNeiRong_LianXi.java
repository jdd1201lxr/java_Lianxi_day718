public class ShuZu_ShuZuNeiRong_LianXi {
    public static void main(String[] args) {
        /**
         需求:
         设计一个方法,用于比较两个数组的内容是否相同
         */
        int[] i = {1,2,3,4,5};
        int[] b = {1,2,3,4,6};
        boolean cc = com(i,b);
        System.out.println(cc);

    }
    public static boolean com(int[] arr,int[] arr1){
        if (arr.length != arr1.length){
            return false;//判断两个数组的长度是否相同,不相同返回false
        }
        for (int x =0;x<arr.length;x++){
            if (arr[x] != arr1[x]){
                return false;//判断两个数组的内容是否相同,不相同返回false

            }
        }return true;//当前面两个判断,判断长度、内容都相同时,跳出循环和判断语句返回true
    }

}
