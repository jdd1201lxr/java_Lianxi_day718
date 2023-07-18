public class four {
    public static void main(String[] args) {
        //自增自减运算符
        int i = 10;

        /**
        i++、++i都只能单独使用，放在参数的前面和后面,结果都是一致的
        ++i;
        System.out.println(i);
         */


        int j = ++i;
        System.out.println(i);//11
        System.out.println(j);//11

        //参与操作的时候,如果(++、--)放在变量的右边，先变量参与赋值操作,后拿变量做++或--操作(意思结果不是马上计算出来的,还是原来的值)
        //参与操作的时候,如果(++、--)放在变量的左边，变量先做++或--操作,然后再拿变量参与赋值操作,(意思结果是++--后的结果,做了加减操作)
        int b = i++;
        System.out.println(i);//11
        System.out.println(b);//10

    }
}
