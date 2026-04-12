package jp.co.sss.java100_questions_cac.lesson09.challenge02.Nurserry.logic;

public class NurserySchoolChild {

    private String name;

    public NurserySchoolChild(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    void Play(){
        System.out.println("遊ぶよ～。");
    }

}
