package com.solution.Solution7;

import java.util.ArrayList;

//媒体资料库-Database中存储-DVD、CD类型的对象-拥有一个共同父类Item
public class Database {
    //两个容器属性：一个放CD，一个放DVD
    public ArrayList<CD> listCD=new ArrayList<>();
    public ArrayList<DVD> listDVD=new ArrayList<>();
    public ArrayList<Item> listItem=new ArrayList<>();

    //列出Database中的所有对象，包括CD容器、DVD容器、Item容器
    public void list(){
        for (CD cd:listCD) {
            cd.print();
        }
        for (DVD dvd:listDVD) {
            dvd.print();
        }
        for (Item item :listItem) {
            item.print();
        }
        //CD、DVD的print()，继承自Item
    }

    //TODO：测试运行
    public static void main(String[] args) {
        //初始化一个数据库对象
        Database db = new Database();
        //
        CD cd = new CD("Wait after your class", "Nice", "Jacky Zhou", 5);//周杰伦的新专辑
        DVD dvd = new DVD("Taitanic", "Nice", "Someone", 6);//泰坦尼克号
        Item item=new Item("这是一个标题", "这是一个评论");

        //
        CD cd2 = new CD("Wait after your class", "Nice", "Jacky Zhou", 5);//周杰伦的新专辑
        System.out.println(cd.equals(cd2));
        //
        db.listCD.add(cd);
        db.listDVD.add(dvd);
        db.listItem.add(item);
        //
        db.list();
    }
}
