package SolutionSet.Solution11;

import java.util.ArrayList;

//数据层-Cell对象的二维数组
public class Field {
    //属性
    private Cell[][] field;
    private int width;
    private int height;

    //构造函数
    public Field(int width,int height){
        this.width=width;
        this.height=height;
        this.field=new Cell[this.width][this.height];
    }

    //方法
    //1.get and set width 二维数组的宽度
    public int getWidth() {
        return width;
    }
    public void setWidth(int width) {
        this.width = width;
    }
    //2.get and set height 二维数组的高度
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }

    //3.在二维数组的(x,y)位置放cell对象：用在CellMachine在(x,y)位置放置一个新cell对象时
    public void place(int x,int y,Cell cell){
        //TODO:排查点
        field[x][y]=cell;
    }
    //4.返回二维数组的(x,y)位置的cell对象
    public Cell get(int x,int y){
        return field[x][y];
    }

    //5.获得(x,y)位置的cell对象的所有邻居cells，装到一个Cell对象数组里返回
    public Cell[] getNeighbors(int x,int y){
        //只是要所有的邻居cell，在这里不需要判断cell状态
        //因为在边界上的cell的邻居和中间位置cell的邻居数量不一致，所以用泛型容器类动态添加
        ArrayList<Cell> list = new ArrayList<>();
        //TODO：判断并获得邻居cells算法（通用/分类讨论）


        return list.toArray(new Cell[list.size()]);
    }

    //6.清空二维数组中的所有位置的cell对象
    public void clear(){
        for (int i=0;i<width;i++){
            for (int j=0;j<height;j++){
                field[i][j]=null;
            }
        }
    }
}
