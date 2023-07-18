/*
 方法定义在类体当中,在一个类里面可以定义多个方法,方法写的位置没有先后位置,可以随意
 方法体当中不能再定义方法
 
 */

/*
关于Java语言当中的方法:
 方法怎么定义，语法结构
[修饰符列表]返回值类型 方法名(形式参数列表){
    方法体:
 }
1、修饰符列表:
    可选项，不是必须的
    目前统一写成:public static
    方法中有static关键字时，怎么去调用这个方法？
        -类名.方法名(实际参数列表)
 
2、返回值类型
    什么是返回值:一个方法是可以完成某个特定的功能的,这个功能结束以后大多数是需要返回最终执行结果的，执行结果可能是具体存在的数据，而这个具体存在的数据就是返回值，
(也可能这个方法执行结束之后不会返回任何数据,Java当中规定,当一个方法执行结束之后不返回任何数据的话,返回值类型位置必须编写:void关键字)

返回值的类型:
 返回值是一个具体存在的数据，数据都是有类型的，此处需要指定的返回值的具体数据类型

返回值类型可以是:
 byte、short、int、long、float、double、boolean、char、String、void......
 
*return 数值:(怎么返回值)
    返回值类型是"void"的时候,在方法当中不能编写"return 值:",但是可以编写"return;"这样的语句
    只要带有return关键字的语句执行,return语句所在的方法体就结束
 
 方法体必须由大括号括起来,方法体当中的代码有顺序,遵循自上而下的顺序依次执行,并且方法体由Java语句构成,每一个Java语句以";"结尾
 
3、形式参数列表:简称"形参"
    形参是局部变量
    形参的个数可以是n个，多个形参之间用"逗号"隔开
    形参中起决定性作用的是形参的数据类型,形参的名字就是局部变量的名字
    例如:
    方法定义
    public static int sum(int a,int b,int c){
    
 }
    方法调用
    方法在调用的时候，实际给这个方法传递的真实数据被称为:实参
    sum(1,2)
 
 方法怎么调用?
    方法只定义不去调用时是不会执行的。只有在调用的时候才会执行
*语法规则:
    方法的修饰符列表当中有static
    类名.方法名(实参列表):这是一个
 
*方法调用的时候实参和形参要求对应的个数相同，数据类型相同
*类型不同的时候要求能够进行相应的自动类型转换
 
*方法的调用:
 1、方法的修饰符列表当中有static关键字，完整的调用方式是:类名.方法名(实参列表);
 2、但是，有的时候前面的"类名"可以省略,什么情况下可以省略呢？
       调用本类当中的方法时，既可以省略前面的"类名"。
       但是调用其他类当中的方法时,就需要类名.方法名(实参列表);
 */


