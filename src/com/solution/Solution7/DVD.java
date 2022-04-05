package com.solution.Solution7;

public class DVD extends Item{
    //子类新增属性
    private String director;//导演
    private int numofVideos;//视频个数

    //getter and setter-Generate半自动生成
    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getNumofVideos() {
        return numofVideos;
    }

    public void setNumofVideos(int numofVideos) {
        this.numofVideos = numofVideos;
    }

    //constructor-Generate半自动生成
    public DVD(String title, String comment, String director, int numofVideos) {
        super(title, comment);
        this.director = director;
        this.numofVideos = numofVideos;
    }

    @Override
    //Generate-toString()
    public String toString() {
        return "DVD{" +
                "director='" + director + '\'' +
                ", numofVideos=" + numofVideos +", "+
                super.toString()+
                '}';
    }
}
