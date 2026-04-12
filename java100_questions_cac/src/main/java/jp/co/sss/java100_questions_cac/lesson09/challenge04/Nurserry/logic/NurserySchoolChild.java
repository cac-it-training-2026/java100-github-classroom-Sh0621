package jp.co.sss.java100_questions_cac.lesson09.challenge04.Nurserry.logic;

public class NurserySchoolChild {

    private String name;
    private int temperature;

    public NurserySchoolChild(String name, int temperature) {
        this.name = name;
        this.temperature = temperature;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    void Play() {
        System.out.println("遊ぶよ～。");
    }

}
