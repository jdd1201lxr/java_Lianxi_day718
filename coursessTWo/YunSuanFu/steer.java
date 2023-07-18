public class steer {
    public static void main(String[] args) {
        int i = 10;//把10赋值给int类型i
        /**
         += 把左边和右边的数据做加法操作，结果赋值给左边
         -= 把左边和右边的数据做减法操作，结果赋值给左边
         /= 把左边和右边的数据做除法操作，结果赋值给左边
         *= 把左边和右边的数据做乘法操作，结果赋值给左边
         */
        i += 20;
        System.out.println(i);

        short b = 30;
        short c = (short) (b+i);
        System.out.println(c);

    }
}
