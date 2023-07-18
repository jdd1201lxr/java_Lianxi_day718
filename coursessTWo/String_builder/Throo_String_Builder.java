public class Throo_String_Builder {
    public static void main(String[] args) {
        /**
         String Builder的添加和反转方法
         public String Builder append(任意类型)--添加数据,并返回对象本身
         public String Builder reverse()------返回相反的字符序列
         */

        //反转
        StringBuilder arr = new StringBuilder("arr");
        arr.reverse();
        System.out.println(arr);

        //添加数据,并返回对象本身
        StringBuilder arr1 = new StringBuilder();
        StringBuilder arr2 = arr1.append(123);
        System.out.println("arr1:"+arr1);
        System.out.println("arr2:"+arr2);
        System.out.println(arr1==arr2);//true

    }
}
