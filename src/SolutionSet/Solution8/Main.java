package SolutionSet.Solution8;

import java.util.Scanner;

//第一章内容的编程题练习
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);//开启输入流
        Fraction a = new Fraction(in.nextInt(),in.nextInt());
        Fraction b = new Fraction(in.nextInt(),in.nextInt());
        System.out.println();
        a.print();
        b.print();
        a.plus(b).print();
        a.multiply(b).plus(new Fraction(5,6)).print();
        a.print();
        b.print();
        in.close();//关闭输入流
    }
}

class Fraction{
    //属性
    private int a;//分子
    private int b;//分母
    //构造函数
    public Fraction(int a, int b) {
        this.a = a;
        this.b = b;
        simplest();
    }
    //功能函数
    //1.转换为double类型的浮点数
    public double toDouble(){
        return (double) this.a/this.b;
    }
    //2.将两个Franction对象的分数相加
    public Fraction plus(Fraction r){
        //this、r两个对象的分数相加
        int a;//新分子
        int b;//新分母
        //对两个对象的分子分母进行处理
        b=this.b*r.b;
        a=this.a*r.b+this.b*r.a;
        //在构造新对象的时候就化简了
        return new Fraction(a,b);
    }
    //3.将两个Franction对象相乘
    public Fraction multiply(Fraction r){
        //this、r两个对象的分数相乘
        int a;//新分子
        int b;//新分母
        //对两个对象的分子分母进行处理
        a=this.a*r.a;
        b=this.b*r.b;
        //在构造新对象的时候就化简了
        return new Fraction(a,b);
    }
    //4.将当前对象以"分子/分母"的形式输出到sout，并带有回车换行
    public void print(){
        if (a==1&&b==1){
            System.out.println(1);
        }else{
            System.out.println(this.a+"/"+this.b);
        }
    }
    //+把分数化为最简形式
    void simplest(){
        //如果分子分母最大公约数不是1，化简
        int gcd=gcd(this.a,this.b);
        while (gcd!=1){
            this.a=this.a/gcd;
            this.b=this.b/gcd;
            gcd=gcd(this.a,this.b);
        }
    }
    //+两个数的最大公约数-辗转相除法
    int gcd(int a,int b){
        int gcd=1;//最大公约数初始值为1
        while (b!=0){
            int temp=a%b;
            a=b;
            b=temp;
        }
        if (b==0) {
            gcd = a;
        }
        return gcd;
    }
}
