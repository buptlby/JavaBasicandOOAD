package SolutionSet.Solution10;

import java.util.HashMap;
import java.util.Scanner;

//城堡游戏：游戏开始的地方
public class CastleGame {
    //属性
    private Room currentRoom;//用户当前所在房间

    //方法
    //初始化城堡游戏
    public void initRooms(){
        //创建各个房间
        Room outside,livingroom,bedroom,studyroom,gameroom;
        //new各个房间对象
        outside=new Room("outside");
        livingroom=new Room("livingroom");
        bedroom=new Room("bedroom");
        studyroom=new Room("studyroom");
        gameroom=new Room("gameroom");
        //连接各个房间的方位关系
        outside.addExit("south",livingroom);//outside 城堡外面
        livingroom.addExit("north",outside);//livingroom 客厅
        livingroom.addExit("south",bedroom);
        livingroom.addExit("east",studyroom);
        livingroom.addExit("west",gameroom);
        bedroom.addExit("north",livingroom);//bedroom 卧室
        studyroom.addExit("west",livingroom);//studyroom 书房
        gameroom.addExit("east",livingroom);//gameroom 游戏屋
        //设置初始时用户在城堡外面
        currentRoom=outside;
        System.out.println("数据初始化成功");
    }

    //开篇欢迎语
    public void printWelcome(){
        System.out.println("欢迎你！");
        System.out.println("这是一个非常无聊的游戏");
        locate();
    }

    //获得用户当前位置
    public void locate(){
        System.out.println("现在你在："+currentRoom.getName());
        //打印当前Room的所有出口方位
        //创建动态字符串
        StringBuffer sb=new StringBuffer();
        //for-each循环遍历
        for (String key: currentRoom.getExits().keySet()) {
            sb.append(key+" ");
        }
        System.out.println("出口有："+sb);
    }

    //用户命令
    //-help
    public void help(){
        System.out.println("迷路了吗？你可以：go bye help");
        System.out.println("例如：go east");
    }
    //-bye
    public void bye(){
        System.out.println("感谢您的光临！再见");
    }
    //-go
    public void go(String direction){//传入要去到的方向
        //根据要去到的方向，判断有没有房间，有的话切换currentRoom
        //获得当前Room的出口房间哈希表
        HashMap<String, Room> exits=currentRoom.getExits();
        if (exits.get(direction)!=null){//如果这个方向有出口房间，则去到该房间
            currentRoom=exits.get(direction);
            locate();//向用户更新当前位置信息
        }else {
            System.out.println("该方向没有门！");//如果这个关键字不在列表中，告诉用户这个方向没有出口
        }

    }

    //TODO:开始游戏
    public static void main(String[] args) {
        //初始化游戏数据
        CastleGame game = new CastleGame();
        game.initRooms();
        game.printWelcome();

        //根据用户命令执行操作
        Scanner scanner = new Scanner(System.in);
        GAME:
        while (true){
            //解析用户命令
            String[] s=scanner.nextLine().split(" ");
            if (s.length==1){
                //如果命令短语只有一个单词
                if(s[0].equals("help")){
                    game.help();
                }else if (s[0].equals("bye")){
                    break GAME;//跳出GAME循环
                }
            }else if(s[0].equals("go")&&s.length==2){
                //如果命令短语有两个单词并且第一个是go
                game.go(s[1]);
            }
        }
        game.bye();
        scanner.close();//关闭输入流
    }
}
