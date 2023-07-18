/*
 需求:
    判断当前的天气:
        当外边下雨的时候:
            带雨伞:
                判断性别:
                当性别为男:带一把大黑伞
                当性别为女:带一把小花伞
 
        当外面晴天的时候:
            判断天气的温度:
                当天气温度在30度以上:
                    当性别为男:戴墨镜
                    当性别为女:擦防晒霜
 */

/*
public class iftest04{
    public static void main(String[] args){
        java.util.Scanner s = new java.util.Scanner(System.in);
        
        System.out.println("请输入当前天气状况:‘1’是表示下雨,‘0’是表示晴天");
        int num = s.nextInt();
        if(num < 0 || num > 1){
            System.out.println("请输入正确的天气状况");
           
        }
        
        System.out.println("请输入你的性别:‘1’表示男性，‘0’表示女性");
        int gender = s.nextInt();
        
        if(gender < 0 || gender > 1){
            System.out.println("请输入正确的性别");
        }
       
        
        if(num == 1){
            if(gender == 1){
                System.out.println("今天是下雨天,请带一把大黑伞");
            }else if(gender == 0){
                System.out.println("今天是下雨天,请带一把小花伞");
            }
        }else if(num == 0){
            System.out.println("请输入当前温度:");
            int temperature = s.nextInt();
            if(temperature > 30){
                if(gender == 1){
                    System.out.println("当前的外面温度大于30度,请戴墨镜");
                }else if(gender == 0){
                    System.out.println("当前的外面温度大于30度,请戴防晒霜");
                }
                
            }else{
                System.out.println("请输入正确的温度");
            }
                
        }
    }
    
}

*/

//老师写的代码
public class iftest04{
    public static void main(String[] args){
        java.util.Scanner s = new java.util.Scanner(System.in);
        
        System.out.println("欢迎使用本系统,你通过本系统可以完成一些简单的判断");
        System.out.println("说明1:1表示下雨,0是表示晴天");
        System.out.println("说明2:1表示男性,0是表示女性");
        System.out.println("说明3:温度为数字");
        
        //接收性别
        System.out.println("请输入你的性别");
        int sex = s.nextInt();
     
        //接收天气的状况
        System.out.println("请输入当前天气状况:");
        int weather = s.nextInt();
        
        //判断天气状况
        if(weather == 1){
            //下雨天
            System.out.println("下雨天");
            if(sex == 0){
                System.out.println("带一把大黑伞");
            }else if(sex == 1){
                System.out.println("带一小花伞");
            }else{
                System.out.println("对不起，你的性别是怎么回事");
            }
            
        }else if(weather == 0){
            //晴天
            System.out.println("晴天");
            
            //接收温度
            System.out.println("今天温度是多少度呢?");
            int tem = s.nextInt();
            if(tem > 30){
                if(sex == 0){
                    System.out.println("戴墨镜");
                }else if(sex == 1){
                    System.out.println("擦防晒霜");
                }else{
                    System.out.println("今天温度有点低哦,不需要带任何东西");
                }
                
                
            }
            
        }else{
            System.out.println("对不起你输入的天气情况不存在");
        }
    }
}
