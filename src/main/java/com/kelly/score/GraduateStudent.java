package com.kelly.score;

public class GraduateStudent extends Student {
    int thesis;
    public GraduateStudent(String name,int english,int math,int thesis){
       super(name, english, math);
        this.thesis = thesis;
    }
    public GraduateStudent(String name){
        super(name);
        //呼叫 Students name
        // this.name = name
    }
    @Override //覆寫檢查
    public void print(){
        System.out.println(name + "\t"+english+"\t" +math + "\t" +getAverage() + "\t" + thesis);
    }




}
