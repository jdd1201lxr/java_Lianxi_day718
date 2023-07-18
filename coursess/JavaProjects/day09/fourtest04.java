/*
 三元运算符/三目运算符/条件运算符
 1、语法规则
    布尔表达式：变量 ？表达式1:表达式2(sex ? '男' : '女';)
 2、三元运算符的执行原理
    当布尔表达式的结果是true的时候，选择表达式1作为整个表达式的执行结果
    当布尔表达式的结果是false的时候，选择表达式2作为整个表达式的执行结果
 */
public class fourtest04{
    public static void main(String[] args){
        boolean six = false;
        
       // sex ? '男' : '女';//编译报错,因为他不是一个完整的Java语句
        
        char c = six ? '男' : '女';
        System.out.println(c);
        
        String useanesa = "dadas本";
        System.out.println("恭喜"+useanesa+"登录成功");
    }
}
