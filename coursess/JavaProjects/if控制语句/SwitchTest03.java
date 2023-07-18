public class SwitchTest03{
    public static void main(String[] args){
        char c = 'B';
        switch(c){
                case 'A':
                System.out.println("最高级");
                case 'B':
                System.out.println("中级");
                
                default:
                System.out.println("报错了");
                
                
        switch(c){
                case 'A':
                    System.out.println("最高级");
                case 66:
                    System.out.println("中级123");
                    break;
                default:
                    System.out.println("报错了");
                
                //switch后小括号支持char类型
            }
        }
    }
}
