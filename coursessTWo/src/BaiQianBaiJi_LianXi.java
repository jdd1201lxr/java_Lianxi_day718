public class BaiQianBaiJi_LianXi {
    //公鸡五块一只--母鸡三块一只--小鸡--一块3只--算100块钱内有几种购买方案

    public static void main(String[] args) {
        for (int x=0;x<=20;x++){//设置公鸡数量为0,不能超过20只,因为超过20只就超过100块钱了
            for (int y=0;y<=33;y++){//设置母鸡数量为0,不能超过33只,因为超过33只就超过100块钱了
                int z = 100-x-y;//小鸡数量等于总价减去公鸡减去母鸡的数量等于小鸡数量
                if (z%3==0 && 5*x+3*y+z/3==100){//判断小鸡数量取余是否等于0,公鸡数量乘5+母鸡数量乘3+小鸡数量除3相加是否等于100
                    // 等于100时,就代表这几种数量买是刚好100块钱


                    System.out.println(x+","+y+","+z);
                }
            }
        }
    }
}