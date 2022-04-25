package SolutionSet.Solution10;

import java.util.HashMap;

//城堡房间
public class Room {
    //属性
    private String name;//房间名称
    //动态存储Room的出口方位（北->东->南->西，后期可以再添加上、下）
    private HashMap<String,Room> exits;//哈希表中关键字不可以有重复

    //构造函数
    public Room(String name){
        this.name=name;//赋值房间名称
        this.exits=new HashMap<String,Room>();//new exits哈希表对象
    }

    //方法
    //getter 获得当前Room的名称
    public String getName() {
        return name;
    }
    //获得当前Room的所有出口Room的动态列表
    public HashMap<String, Room> getExits() {
        return exits;
    }

    //给当前Room新增exit
    public void addExit(String name,Room room){//参数：添加到的方位名称，房间
        exits.put(name,room);
    }
}
