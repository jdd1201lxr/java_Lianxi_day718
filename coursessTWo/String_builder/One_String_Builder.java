public class One_String_Builder {
    public static void main(String[] args) {
        /**
         String左右拼接的元素都会在堆内存创建一个空间,在常量词里面保存。左变拼接元素是一个地址,右边拼接元素是一个地址
         然后左右两边拼接起来要是一个新的地址。最后输出的就是拼接在一起的地址元素
         String g= "h"+"s";h在堆内存中是一个地址保存着,s在堆内存中是另一个地址保存着，拼接后为hs,这个拼接的也是另一个新的内存地址保存
         然后把拼接后的新的内存地址赋值给g。
         这样就会有点浪费空间,因为一共创建了3块内存地址
         可以通过string Builder类解决这个问题

         string Builder是一个可变的字符串类,我们可以把他看成是一个容器,这里的可变指的是string Builder对象中的内容是可变的
         在进行字符串拼接的时候是不需要开辟新的空间的(因为对象是在堆内存中)

         String和string Builder的区别
         String内容是不可变得--拼接后的元素需要开辟新的内存空间
         string Builder 内容是可变的---拼接后的元素不需要开辟新的内存空间
         */
    }
}
