public class ForTest06{
    
    public static void main(String[] args){
        
        for(int i=0;i<=5;i++){
            
            System.out.println("开始");
            
            for(int f=0;f<=5;f++){
                
                System.out.println(i*f);
            }
            
            System.out.println("结束");
        }
    }
}
/*
 结果:
 开始
 0
 0
 0
 0
 0
 0
 0
 结束
 
 开始
 0
 1
 2
 3
 4
 5
 结束
 
 开始
 0
 2
 4
 6
 8
 10
 结束
 
 
 
 */
