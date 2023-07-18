/*
 假设系统给考生成绩定等级,请判断该考生的成绩等级:
    1、有效成绩范围(0--100)
    2、考试成绩可能带有小数
    3、考试成绩和等级之间的对照关系:
 */

public class SwitchTest05{
    public static void main(String[] args){
        
        //考生成绩
        double score = 12312;
        
        
        
        //转换成int类型
        int gets = (int)(score / 10);
        
        switch(gets){
                case 9:case 10:
                System.out.println("A");
                break;
                
                case 8:
                System.out.println("B");
                break;
                
                case 7:
                System.out.println("C");
                
                case 6:
                System.out.println("D");
                
                default:
                System.out.println("E");
        }
    }
}
