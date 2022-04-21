package SolutionSet.Solution7;

public class CD extends Item{
    //子类新增属性
    private String artist;//艺术家
    private int numofTracks;//乐曲个数

    //getter and setter-Generate半自动生成
    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getNumofTracks() {
        return numofTracks;
    }

    public void setNumofTracks(int numofTracks) {
        this.numofTracks = numofTracks;
    }

    //constructor-Generate半自动生成
    public CD(String title, String comment, String artist, int numofTracks) {
        super(title, comment);
        this.artist = artist;
        this.numofTracks = numofTracks;
    }

    @Override
    //Generate-toString()
    public String toString() {
        return "CD{" +
                "artist='" + artist + '\'' +
                ", numofTracks=" + numofTracks +", "+
                super.toString()+
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        //return super.equals(cc);//默认用Item的equals()判断是否相同，所以改掉这个语句
        CD cc=(CD) obj;//向下造型-这里是安全的
        boolean flag=false;
        if(this.artist.equals(cc.artist)&&//逐字段对比
        this.numofTracks==cc.numofTracks&&
        super.equals(cc)){
            flag=true;
        }
        return flag;
    }
}
