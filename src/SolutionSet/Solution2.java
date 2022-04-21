package SolutionSet;

import java.util.Scanner;

//Q：输入两个数a、b，输出它们的最大公约数
public class Solution2 {
    //
    //方法1.穷举法
    public void gcd1(){
        //输入两个整数a、b
        System.out.println("请输入两个整数a、b：");
        Scanner scanner = new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        //计算a、b的最大公约数
        int gcd=1;//最大公约数的缩写，gcd最小为1，所以初始化为1
        for (int i=2;i<=a&&i<=b;i++){//gcd一定是小于a的
            if (((a%i)==0)&&(b%i==0)){
                gcd=i;
            }
        }
        //输出gcd
        System.out.println("计算得最大公约数为："+gcd);//要初始化gcd=值，不然会出错；
    }
    //
    //方法2.辗转相除法
    public void gcd2(){
        //输入a、b两个数
        System.out.println("请输入两个整数a、b：");
        Scanner scanner = new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        //辗转相除法
        int gcd=1;
        while (b!=0){
            int temp;
            temp=a%b;
            a=b;
            b=temp;
        }
        if (b==0){
            gcd=a;
        }
        //输出
        System.out.println("计算得最大公约数为："+gcd);
    }
    /**
     * 辗转相除的思想：
     * 1.如果b=0，计算结束，a就是最大公约数
     * 2.否则，计算a对b取余，a=b，b=那个余数，再回到第一步*/
    //
    //TODO：测试运行
    public static void main(String[] args) {
        Solution2 solution2 = new Solution2();
        solution2.gcd1();
        solution2.gcd2();
    }
}
