package SolutionSet.Solution11;

import javax.swing.*;
import java.awt.*;

//表现层：负责把Field里的数据全部搬过来画出来
public class View extends JPanel {
    //画板属性
    private static final long serialVersionUID = -5258995676212660595L;
    private static final int GRID_SIZE = 16;//画图的基本长度单位?
    private Field theField;//有一个field

    //构造函数-往View里传入一个field对象并放进去
    public View(Field field){
        this.theField=field;
    }

    //方法
    @Override
    //1.把Field中的数据遍历一遍，用paint函数画出来所有数据：从JComponent中继承来，用以画出当前组件
    public void paint(Graphics g) {
        super.paint(g);
        for (int i=0;i<theField.getWidth();i++){
            for (int j=0;j<theField.getHeight();j++){
                //获得(i,j)位置的cell对象
                Cell cell=theField.get(i,j);
                //如果cell对象非空，画出来它
                if (cell!=null){
                    cell.draw(g,i*GRID_SIZE,j*GRID_SIZE,GRID_SIZE);
                }
            }
        }
    }
    @Override
    //2.返回组件UI的size：从JComponent中继承来的
    public Dimension getPreferredSize() {
        return new Dimension(theField.getWidth()*GRID_SIZE+1,theField.getHeight()*GRID_SIZE+1);
    }

    //TODO：测试View效果
    public static void main(String[] args) {
        //初始化数据层
        Field field = new Field(10, 10);
        for (int i=0;i<field.getHeight();i++){
            for (int j=0;j< field.getWidth();j++){
                //遍历二维数组，先行后列
                field.place(i,j,new Cell());
            }
        }
        //初始化表示层
        View view = new View(field);
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//点叉叉可以结束程序
        frame.setResizable(false);
        frame.setTitle("Cells");
        frame.add(view);
        frame.pack();
        frame.setVisible(true);
        //以上这段代码建立了一个静态的machine
    }
}
