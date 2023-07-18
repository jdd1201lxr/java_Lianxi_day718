public class Two_String_Builder {
    /**

     */
    public static void main(String[] args) {

        //publigc StringBuilder()-创建一个空白可变的字符串对象,不含有任何内容
        StringBuilder ca = new StringBuilder();
        System.out.println("ca:"+ca);
        System.out.println("ca.length:"+ca.length());

        //public StringBuilder(String str)根据字符串的内容,未创建可变字符串对象
        StringBuilder ca1 = new StringBuilder("String");
        System.out.println("ca1:"+ca1);
        System.out.println("ca1.length:"+ca1.length());
    }
}
