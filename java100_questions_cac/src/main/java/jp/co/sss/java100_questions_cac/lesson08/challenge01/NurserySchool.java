/**
 * 第8章 保育園のお仕事
 *
 * 問題1  ファイルの分割
 *
 * 保育士クラス（Nurse）と
 * 園児クラス（NurserySchoolChild）と
 * 保育園クラス（NurserySchool）を別のファイルに
 * 記述し直してください。
 *
 */

package jp.co.sss.java100_questions_cac.lesson08.challenge01;

class Nurse {
    private String name;

    public Nurse(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class NurserySchoolChild {

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

public class NurserySchool {

    public static void main(String[] args) {

        Nurse nurse1 = new Nurse("保育太郎");
        Nurse nurse2 = new Nurse("保育次郎");
        Nurse nurse3 = new Nurse("保育三郎");

        System.out.println(nurse1.getName() + "が出勤しました。");
        System.out.println(nurse2.getName() + "が出勤しました。");
        System.out.println(nurse3.getName() + "が出勤しました。");

        NurserySchoolChild child1 = new NurserySchoolChild("園児①");
        NurserySchoolChild child2 = new NurserySchoolChild("園児②");
        NurserySchoolChild child3 = new NurserySchoolChild("園児③");

        System.out.println(child1.getName() + "が登園しました。");
        System.out.println(child2.getName() + "が登園しました。");
        System.out.println(child3.getName() + "が登園しました。");
    }

}
