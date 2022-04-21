package SolutionSet.Solution7;

public class Item {
    //属性
    private String title;//标题
    private boolean gotIt;//默认初始未获得
    private String comment;//评论

    //getter and setter-Generate半自动生成
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isGotIt() {
        return gotIt;
    }

    public void setGotIt(boolean gotIt) {
        this.gotIt = gotIt;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    //constructor-Generate半自动生成
    public Item(String title, String comment) {
        this.title = title;
        this.gotIt = false;
        this.comment = comment;
    }

    @Override
    //Generate-toString()
    public String toString() {
        return "title='" + title + '\'' +
                ", gotIt=" + gotIt +
                ", comment='" + comment + '\'' ;
    }

    //打印当前对象的内容
    public void print(){
        System.out.println(this);//sout可以直接打印对象
    }

    @Override
    public boolean equals(Object obj) {
        //return super.equals(obj);//默认使用Object类的equals函数，所以要改写
        Item ii=(Item) obj;//向下造型-这里是安全的
        boolean flag=false;
        if (this.title.equals(ii.title)&&//逐字段对比
        this.gotIt==ii.gotIt&&
        this.comment.equals(ii.comment)){
            flag=true;
        }
        return flag;
    }
}
