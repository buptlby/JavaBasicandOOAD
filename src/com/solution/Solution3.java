package com.solution;

import java.util.Arrays;
import java.util.Scanner;

public class Solution3 {
    //投票统计：输入数量不确定的[0-9]范围内的整数，统计每一种数字出现的次数，输入-1表示结束
    public void main(){
        Scanner scanner = new Scanner(System.in);
        int[] votes = new int[10];//从0-9一共10个元素
        //循环输入
        int i=scanner.nextInt();
        while (i!=-1){//记录输入中各数字的出现次数；
            if (i>0&&i<=9){
                votes[i]++;//避免了根据每一种情况写10个if else分支，能动态就动态判断
            }
            i= scanner.nextInt();
        }
        //循环输出存储统计结果的数组votes[10]
        System.out.println(Arrays.toString(votes));
    }

    //TODO：测试运行
    public static void main(String[] args) {
        Solution3 solution3 = new Solution3();
        solution3.main();
    }
}
