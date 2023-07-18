public class String_Throo {
    /**
     String类型的比较
     使用"=="做比较
     基本数据类型:比较的是数据值是否相等
     引用数据类型:比较的是地址值是否相等

     String类型是对象,如果他想比较内容是否相同,是通过一个方法来实现的,这个方法叫:equals()
     举例:public boolean equals():将此字符串与指定对象进行比较,由于我们比较的是字符串对象,所以直接传递一个字符串即可
     */
    public static void main(String[] args) {
        //判断两个对象之间的地址是否相等
        char[] arr = {'a','b','c'};
        String s1 = new String(arr);
        String s2 = new String(arr);
        System.out.println(s1==s2);//

        String s3 = "abc";
        String s4 = "abc";
        System.out.println(s3==s4);

        System.out.println(s1==s3);
        System.out.println("————————————————————————");

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s3.equals(s4));
    }



}
