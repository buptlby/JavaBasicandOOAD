package SolutionSet;

import java.util.Arrays;

//Q：验证数组、字符串传递参数：传值/管理权限？
public class Solution5 {
    //
    //1.验证数组传递参数
    public void transferArray(int[] nums){
        nums[0]=0;
        System.out.println("transferArray："+Arrays.toString(nums));
    }
    //
    //2.验证字符串传递参数
    public void transferString(String s){
        s="Hello TransferString!";
        System.out.println("transferString："+s);
    }

    //TODO:运行测试
    public static void main(String[] args) {
        //初始化实例
        Solution5 solution5 = new Solution5();
        //1.数组
        int[] nums = new int[]{1,2,3,4,5};
        System.out.println("Original:"+Arrays.toString(nums));
        solution5.transferArray(nums);
        System.out.println("Main:"+Arrays.toString(nums)+"\n");
        /**结论：数组传参数，传递的是管理权限*/
        //2.初始化字符串
        String s = new String("Hello Main!");
        System.out.println("Original:"+s);
        solution5.transferString(s);
        System.out.println("Main:"+s);
        /**结论：字符串传管理权限，但修改字符串时，并未修改原字符串，而是创建一个新字符串，修改了管理权限*/
    }
}
