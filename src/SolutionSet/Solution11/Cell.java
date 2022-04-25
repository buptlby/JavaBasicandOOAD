package SolutionSet.Solution11;

import java.awt.*;

//Cell：细胞单元
public class Cell {
    //属性
    private boolean alive;

    //构造函数
    public Cell(){
        this.alive=false;//在创建细胞对象时初始化为死亡状态；
    }

    //方法
    //1.令当前细胞对象死去
    public void die(){
        this.alive=false;
    }
    //2.令当前细胞对象活过来
    public void born(){
        this.alive=true;
    }
    //3.返回当前细胞的状态
    public boolean isAlive() {
        return alive;
    }
    //TODO:Cell还要负责当前细胞对象画出来正方形
    public void draw(Graphics g,int x,int y,int size){//活：黑色    死：白色
        g.drawRect(x,y,size,size);
        if (alive){//如果当前细胞是活的，把画的正方形涂满
            g.fillRect(x,y,size,size);
        }
    }
}
