package SolutionSet;

import java.util.Scanner;

//Q：tic-tac-toe游戏：下棋，在二维数组里
public class Solution4 {
    //
    public void main(){
        //初始化一个二维数组
        int[][] map = new int[3][3];//3*3的棋盘，初始化Java自动全设置为0；
        //初始化输入流
        Scanner scanner = new Scanner(System.in);
        //每局最多落子9次，计数为奇数-黑-落地标1，偶数-白-落地标2
        ISOVER:
        for (int i=1;i<=9;i++){
            if (i%2!=0){
                //本轮落黑子
                System.out.println("本轮黑子下，请输入要落子位置的坐标（数组下标）：");
                System.out.println("落子横坐标x为：");
                int x1=scanner.nextInt();
                System.out.println("落子横坐标y为：");
                int y1=scanner.nextInt();
                map[x1][y1]=1;
                //判定游戏是否结束：横连三/纵连三/对角线/反对角线
                if ((map[0][0]==1&&map[0][1]==1&&map[0][2]==1)||(map[1][0]==1&&map[1][1]==1&&map[1][2]==1)||(map[2][0]==1&&map[2][1]==1&&map[2][2]==1)||
                        (map[0][0]==1&&map[1][0]==1&&map[2][0]==1)||(map[0][1]==1&&map[1][1]==1&&map[2][1]==1)||(map[0][2]==1&&map[1][2]==1&&map[2][2]==1)||
                        (map[0][0]==1&&map[1][1]==1&&map[2][2]==1)||(map[0][2]==1&&map[1][1]==1&&map[2][0]==1)){
                    System.out.println("黑方获胜！游戏结束");
                    break ISOVER;//这个标号unnecessary，为了可读性，下同
                }
            }else{
                //本轮落白子
                System.out.println("本轮白子下，请输入要落子位置的坐标（数组下标）：");
                System.out.println("落子横坐标x为：");
                int x2=scanner.nextInt();
                System.out.println("落子横坐标y为：");
                int y2=scanner.nextInt();
                map[x2][y2]=2;
                //判定游戏是否结束
                if ((map[0][0]==2&&map[0][1]==2&&map[0][2]==2)||(map[1][0]==2&&map[1][1]==2&&map[1][2]==2)||(map[2][0]==2&&map[2][1]==2&&map[2][2]==2)||
                        (map[0][0]==2&&map[1][0]==2&&map[2][0]==2)||(map[0][1]==2&&map[1][1]==2&&map[2][1]==2)||(map[0][2]==2&&map[1][2]==2&&map[2][2]==2)||
                        (map[0][0]==2&&map[1][1]==2&&map[2][2]==2)||(map[0][2]==2&&map[1][1]==2&&map[2][0]==2)){
                    System.out.println("白方获胜！游戏结束");
                    break ISOVER;
                }
            }
        }
    }
    //
    //TODO：测试运行
    public static void main(String[] args) {
        Solution4 solution4 = new Solution4();
        solution4.main();
    }
}
