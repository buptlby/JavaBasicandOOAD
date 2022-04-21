package SolutionSet.Solution9;

//整个Clock
public class Clock {
    //属性-三个框
    private Display hour =new Display(24);
    private Display minute=new Display(60);
    private Display second=new Display(60);

    //构造函数-初始化：时分秒
    public Clock(int hour,int minute,int second){
        this.hour.setValue(hour);
        this.minute.setValue(minute);
        this.second.setValue(second);
    }

    //功能函数
    //1.嘀嗒一下，时间走一秒，时分秒联动
    public void tick(){
        while (true){
            second.increase();
            if (second.getValue()==0){
                minute.increase();
                if (minute.getValue()==0){
                    hour.increase();
                }
            }
            System.out.println(toString());
        }
    }
    //2.toString
    public String toString(){
        String s=new String(hour.getValue()+":"+ minute.getValue()+":"+second.getValue());
        return s;
    }
}
