package SolutionSet.Solution9;

//整个钟当中的一个小显示框
public class Display {
    //属性
    private int value=0;//框中的数值，默认的0值
    private int uplimit=0;//数值上限
    //构造函数：初始化框中的上限
    public Display(int uplimit) {
        this.uplimit = uplimit;
    }
    //功能函数
    //1.框内数值增加
    public void increase(){
        //value增长一个值
        value++;
        //如果value到达上限，重置为0
        if (value==uplimit){
            value=0;
        }
    }
    //显示框中的数值
    public int getValue() {
        return value;
    }
    //设置框中初始值
    public void setValue(int value) {
        this.value = value;
    }
}
