/*
 在返回值类型是void的方法当中，使用return语句
 “return”语句出现在返回值为void的方法当中主要是为了用来结束语句
 */

public class MethodTest07{
    public static void main(String[] args){
        //user();
        for(int i=10;i>0;i--){
            if(i==2){
                    return;
                }
                System.out.println(i);
            }
            System.out.println("wtach you ers");
        
    }
    
    }
/*
   
public static void password(){
    return;


public static void user(){
    for(int i = 1;i<=10;i++){
        if(i==5){
            return;
        }
        System.out.println("i"+"----"+i);
    }
    System.out.println("whta");

}
*/ 

