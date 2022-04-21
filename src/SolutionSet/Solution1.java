package SolutionSet;

import java.util.Scanner;

//Q：判断输入的数是不是素数
public class Solution1 {
    //
    //方法1.枚举出每个可能因子
    public void isPrime1(){
        //输入一个数x
        Scanner scanner = new Scanner(System.in);
        int x=scanner.nextInt();
        //判断是否为素数：x对x或1取余为0，其他情况余数均不为0
        boolean isPrime=true;//默认是素数
        //给循环加标号，带标号的break、continue对该循环起作用
        ISPRIME:
        for (int i=2;i<x;i++){
            if (x%i==0){
                isPrime=false;
                break ISPRIME;//已经确定不是素数了，就不需要后面的循环了，简化运算次数
            }
        }
        //根据boolean值输出结果
        if (isPrime){//isPrime==true x是素数
            System.out.println("输入的数值："+x+"，是素数");
        }else{
            System.out.println("输入的数值："+x+"，不是素数");
        }
    }
    //
    //方法2.简化枚举循环，因为偶数一定不是素数
    public void isPrime2(){
        //输入一个数x
        Scanner scanner = new Scanner(System.in);
        int x=scanner.nextInt();
        //判断是否为素数：x对x或1取余为0，其他情况余数均不为0
        boolean isPrime=true;//默认是素数
        //简化循环，去除所有偶数可能因子的遍历
        ISPRIME:
        for (int i=3;i<x;i=i+2){
            if (x%i==0){
                isPrime=false;
                break ISPRIME;//已经确定不是素数了，就不需要后面的循环了，简化运算次数
            }
        }
        //根据boolean值输出结果
        if (isPrime){//isPrime==true x是素数
            System.out.println("输入的数值："+x+"，是素数");
        }else{
            System.out.println("输入的数值："+x+"，不是素数");
        }
    }
    //
    //TODO：测试运行
    public static void main(String[] args) {
        Solution1 solution1 = new Solution1();
        solution1.isPrime1();
        solution1.isPrime2();
    }
}