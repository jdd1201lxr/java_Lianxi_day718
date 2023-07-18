public class PinJie_String_LianXi {
    public static void main(String[] args) {
        /**
         拼接字符串

         */
        int[] bb = {1,2,3123,12};

        String fanhui = arrString(bb);
        System.out.println(fanhui);
    }

    public static String arrString(int[] arr){
        String s = "";//定义一个初始值
        s =s+"[";//把第一个括号带上,不需要在循环体里
        for (int sum=0;sum<arr.length;sum++){
            if (sum==arr.length-1){
                s = s+arr[sum];
                //当sum的数值等于arr的长度-1的时候(意思就是得到数组中最后一位元素),s 拼接 arr数组元素(索引值对应的sum)赋值到s字符串中
                //说白了就是达到赋值作用,将满足要求的元素赋值到s这个初始值里面去
            }else {
                s = s+arr[sum];
                s =s+" , ";
            }
        }
        s =s+"]";
        return s;

    }
}
