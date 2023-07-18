public class iftest03{
    public static void main(String[] args){
        java.util.Scanner s = new java.util.Scanner(System.in);
        System.out.print("请输入你的年龄：");
        int num = s.nextInt();//接收数字,以整数形int来接收
        
        String str = "你处于生命周期中的老年阶段";
        if(num < 0 || num > 150){
            str = "你提供的年龄不合法，年龄值需要(0--150)之间";
        }else if(num <= 5){
            str = "你处于生命周期中的幼儿阶段";
        }else if(num <= 10){
            str = "你处于生命周期中的少儿阶段";
        }else if(num <= 18){
            str = "你处于生命周期中的青少年阶段";
        }else if(num <= 35){
            str = "你处于生命周期中的青年阶段";
        }else if(num <= 55){
            str = "你处于生命周期中的中年阶段";
        }else if(num <= 150){
            str = "你处于生命周期中的老年阶段";
        }
        System.out.println(str);
        
                
    }
}
