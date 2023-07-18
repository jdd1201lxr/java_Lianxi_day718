public class iftest02{
    public static void main(String[] args){
        //创建键盘扫描器对象
        //第一步
        java.util.Scanner s = new java.util.Scanner(System.in);
        
        //第二步:调用Scannner对象的next()方法开始接受用户键盘输入
        //程序执行到这里会停下来,等待用户输入
        //当用户输入的时候,并且最终敲回车键的时候，键入的信息会自动赋值给userInputContent
       
        //String userInputContent = s.next();//接收文本(以字符串的形式接收)
        int num = s.nextInt();//接收数字,以整数形int来接收
        
        //System.out.println("你输入的是什么"+userInputContent);
        
        System.out.println("你输入的数字是"+num+"日");
    }
}


