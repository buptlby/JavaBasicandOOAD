package com.solution;

import java.util.*;

//Q：泛型容器类，各操作加强印象
public class Solution6 {
    //
    //1.ArrayList<>
    //动态修改的容器类
    public void al(){
        //初始化ArrayList
        ArrayList<String> al = new ArrayList<>();
        //泛器容器类在初始化对象后，需要一个一个往里加元素
        //通过console读入
        Scanner scanner = new Scanner(System.in);
        String s = new String();//用于存储从控制台接收的字符串
        s= scanner.nextLine();
        while (s.length()!=0){
            al.add(s);
            s= scanner.nextLine();
        }
        //通过for-each循环可以一次处理数组/元素集合中的每一个元素
        System.out.println("用for-each循环打印出ArrayList中的每一个元素：");
        for (String i:al) {
            System.out.print(i);
        }
        System.out.println("\n");
        //可以直接sout打印出整个ArrayList对象
        System.out.println("用sout直接一次打印出ArrayList中的所有元素："+al);
    }
    //
    //2.对象数组
    //对象数组中的每个元素都是对象的管理者，而非对象本身
    public void on(){
        //初始化字符串对象的数组
        String[] on = new String[10];//数组中的元素是字符串类型的对象，也可以是别的类型的对象
        //通过console读入
        Scanner scanner = new Scanner(System.in);
        String s = new String();//用于存储从控制台接收的字符串
        s=scanner.nextLine();
        int i=0;//计数器
        while (s.length()!=0&&i<10){
            on[i]=s;
            i++;
            s=scanner.nextLine();
        }
        ///通过for-each循环可以一次处理数组/元素集合中的每一个元素
        System.out.println("用for-each循环打印出对象数组中的每一个元素：");
        for (String a:on) {
            System.out.print(a);
        }
        System.out.println("\n");
        //可以直接sout打印出整个对象数组
        System.out.println("用sout直接一次打印出对象数组中的所有元素："+ Arrays.toString(on));//数组类型直接打印需要Arrays.toString(数组名);
    }
    //
    //3.集合容器
    //集合中无重复元素，例如HashSet<>
    public void set(){
        //初始化集合容器
        HashSet<String> hs = new HashSet<>();
        //逐个放入元素
        hs.add("Hello ");
        hs.add("World ");
        hs.add("Hello ");//添加重复元素
        ///通过for-each循环依次打印
        System.out.println("用for-each循环打印出每一个元素：");
        for (String s:hs) {
            System.out.print(s);
        }
        System.out.println("\n");
        //通过sout直接打印出整个集合容器里的所有元素
        System.out.println("用sout直接一次打印出集合容器中的所有元素："+hs);//打印出只有Hello World，没有第二个Hello的重复元素
    }
    //
    //4.Hash表
    //HashMap<Key,Value>，其中的类型必须是对象，而不能是基本元素，例如：Interger可以，int不行；
    public void hm(){
        //初始化一个哈希表
        HashMap<Integer, String> hm = new HashMap<>();
        //1.测试HashMap的各函数
        hm.put(1,"a");//往哈希表中添加对象二元组<关键字，值>
        hm.put(2,"b");
        hm.put(3,"c");
        hm.get(1);//通过key查找相应的value
        hm.containsKey(1);//判断哈希表中有无该key关键字，返回true/false
        hm.containsValue("a");//判断哈希表中有无该value值，返回true/false
        hm.keySet().size();//哈希表中有多少种关键字，Set集合，不包含相同的元素
        hm.size();//哈希表中对象元素的个数
        //……
        //2.简单输出成字符串
        System.out.println(hm);
        //3.关键字各不相同，同一个key值，put多value，只留最后一次的
        hm.put(3,"alter");
        System.out.println("重复put了key=3的value字符串后："+hm);
        //4.逐个遍历for-each
        System.out.println("用for-each循环逐个打印哈希表中的对象元素：");
        for (Integer k:hm.keySet()) {
            System.out.println("关键字："+k+",值："+hm.get(k));
        }
    }
    //
    //TODO:测试运行
    public static void main(String[] args) {
        Solution6 solution6 = new Solution6();
        solution6.hm();
    }
}
