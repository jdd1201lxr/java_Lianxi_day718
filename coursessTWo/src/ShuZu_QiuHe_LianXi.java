public class ShuZu_QiuHe_LianXi {
    public static void main(String[] args) {
        /**
         需求:
         有这样一个数组,元素是{68,27,95,88,171,996,51,210},求出该数组中满足要求的和,要求是:求和的元素个位数和十位数都不是7
         并且只能是偶数
         */
        int[] arr = {68,27,95,88,171,996,51,210};
        int sum = 0;

        for (int i=0;i<arr.length;i++){
            int ge = arr[i]%10;
            int shi = arr[i]/10%10;
            if ((ge & shi) !=7 && arr[i]%2==0){
                sum = sum+arr[i];
            }

        }System.out.println(sum);

    }
}
